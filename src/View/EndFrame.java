package View;

import Model.RealEstate.RealEstate;
import Controller.GameController;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
public class EndFrame extends JFrame {
    GameController gameController=new GameController();
    RealEstate realEstate = new RealEstate();
    public EndFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("end");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // set the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);


        // set the label
        if(gameController.checkDeadHeat()){
            JLabel label = new JLabel("DogFall", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 60));
            label.setBounds(50, 100, 300, 50);

            panel.add(label);
        }else if(realEstate.checkWin()){
            JLabel label = new JLabel("You are win!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 60));
            label.setBounds(50, 100, 300, 50);
        } else if (!realEstate.checkWin()) {
            JLabel label = new JLabel("You are failed!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 60));
            label.setBounds(50, 100, 300, 50);
        }


        add(panel);

        setVisible(true);
    }
}

