package Game;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MonopolyStartScreen extends JFrame {
	private JButton startButton;
    private JButton chooseAgeButton;
    private JComboBox<Integer> memberComboBox;
    private ArrayList<Integer> ageList;
    

    public MonopolyStartScreen() {
        setTitle("Monopoly start screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); 

        // Create panel
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

        // Create options panel
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        optionPanel.setOpaque(false); 
        
        // Create a combo box for selecting the number of people
        JLabel memberLabel = new JLabel("choose member:");
        memberLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        memberLabel.setForeground(Color.RED);
        memberComboBox = new JComboBox<>();
        for (int i = 2; i <= 5; i++) {
            memberComboBox.addItem(i);
            memberComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
            memberComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	
                	ageList.clear();
                }
            });
        }
        optionPanel.add(memberLabel);
        optionPanel.add(memberComboBox);
        
        // Create an age selection button
        chooseAgeButton = new JButton("Input age");
        chooseAgeButton.setFont(new Font("Arial", Font.BOLD, 30));
        chooseAgeButton.setForeground(Color.WHITE);
        chooseAgeButton.setBackground(new Color(200, 50, 50)); 
        chooseAgeButton.setPreferredSize(new Dimension(200,60));
        chooseAgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (memberComboBox.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null, "please choose member first");
                    return;
                }
                int selectedMembers = (int) memberComboBox.getSelectedItem();
                ageList = new ArrayList<>();
                for (int i = 0; i < selectedMembers; i++) {
                    String input = JOptionPane.showInputDialog("please input User" + (i + 1) + "'s age");
                    int age = Integer.parseInt(input);
                    if (age < 8) {
                        JOptionPane.showMessageDialog(null, "Sorry, players under the age of 8 are not allowed to play!");
                        i--;
                    }else {
                    	ageList.add(age);
                    }
                    
                }
                if (ageList.size() == selectedMembers) {
                    JOptionPane.showMessageDialog(null, "Age input complete!");
                }
            }
        });
        optionPanel.add(chooseAgeButton);

        
        // Create start button
       
        startButton = new JButton("start");
        startButton.setFont(new Font("Arial", Font.BOLD, 30));
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(200, 50, 50)); 
        startButton.setPreferredSize(new Dimension(200, 60));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 if (ageList == null ) {
                     JOptionPane.showMessageDialog(null, "Please add player age first!");
                 } else {
                     dispose(); //The Start window is closed
                     
                     // 在此处添加打开游戏主界面的代码
                 }
            }
        });
        optionPanel.add(startButton);

        panel.add(optionPanel, BorderLayout.SOUTH);
        getContentPane().add(panel);
    }
    //The output age is used for sorting later
    public ArrayList<Integer> getAgeList() {
        return ageList;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MonopolyStartScreen().setVisible(true);
            }
        });
    }
}



