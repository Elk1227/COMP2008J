package Game;
import Controller.GameController;
import Controller.ViewController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.MonopolyModel.selectedValue;

public class MonopolyStartScreenView extends JFrame {
    private JButton startButton;
    private JButton chooseAgeButton;
    private JComboBox<Integer> memberComboBox;
    private MonopolyModel model;


    public MonopolyStartScreenView(MonopolyModel model) {
        this.model = model;
        setTitle("Monopoly start screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("resources/monopoly.jpg").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new BorderLayout(50, 50));
        panel.setOpaque(false);

        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        optionPanel.setOpaque(false);

        JLabel memberLabel = new JLabel("Choose member:");
        memberLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        memberLabel.setForeground(Color.RED);

        memberComboBox = new JComboBox<>();
        memberComboBox.addItem(null);
        for (int i = 2; i <= 5; i++) {
            memberComboBox.addItem(i);
            memberComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        }
        memberComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<?>memberComboBox = (JComboBox<?>) e.getSource();
                int selectedValue = (int) memberComboBox.getSelectedItem();
                MonopolyModel.selectedValue = selectedValue;
            }
        });

        optionPanel.add(memberLabel);
        optionPanel.add(memberComboBox);

        chooseAgeButton = new JButton("Input age");
        chooseAgeButton.setFont(new Font("Arial", Font.BOLD, 30));
        chooseAgeButton.setForeground(Color.WHITE);
        chooseAgeButton.setBackground(new Color(200, 50, 50));
        chooseAgeButton.setPreferredSize(new Dimension(200, 60));
        chooseAgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (memberComboBox.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null, "Please choose the number of players.");
                    return;
                }

                for (int i = 0; i < selectedValue; i++) {
                    String input = JOptionPane.showInputDialog("Please input User " + (i + 1) + "'s age");
                    if (input == null) {
                        break;
                    }
                    try {
                        int age = Integer.parseInt(input);
                        if (model.isInvalidAge(age)) {
                            JOptionPane.showMessageDialog(null, "Sorry, players under the age of 8 and above the age of 100 are not allowed to play!");
                            i--;
                        } else {
                            model.addAge(age);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid age.");
                        i--;
                    }
                }
                if (model.isAgeListComplete(selectedValue)) {
                    JOptionPane.showMessageDialog(null, "Age input complete!");
                }
            }
        });
        optionPanel.add(chooseAgeButton);

        panel.add(optionPanel, BorderLayout.SOUTH);
        getContentPane().add(panel);

        startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.BOLD, 30));
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(200, 50, 50));
        startButton.setPreferredSize(new Dimension(200, 60));


        if (model.isAgeListComplete(selectedValue)&&model.isInputMember(selectedValue)) {
            startButton.setEnabled(true);
        }else{
            startButton.setEnabled(false);
        }
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewController g=new ViewController();
                g.start(memberComboBox);
            }
        });
        optionPanel.add(startButton);

        panel.add(optionPanel, BorderLayout.SOUTH);
        getContentPane().add(panel);
    }
}

