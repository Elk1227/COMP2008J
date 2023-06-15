package View;

import javax.swing.*;

import static Model.MonopolyModel.selectedValue;

import java.awt.*;
import java.awt.event.ActionListener;

public class ViewFrame {
    JFrame jFrame;
    Container container;
    int playerNumber;
    JButton check_bank;
    ActionListener actionListener;
    public  ViewFrame(JFrame jFrame, Container container, ActionListener actionListener){
        this.jFrame = jFrame;
        this.container = container;
        this.actionListener = actionListener;
        initJframe();
    }

    private void initJframe() {
        playerNumber = selectedValue;

        // TODO Auto-generated method stub
        container.setLayout(null);
        jFrame.setVisible(true);

        // Set the title
        jFrame.setTitle("Monopoly Deal Cards");
        // Set the size
        jFrame.setSize(1024, 768);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Settings window cannot be adjusted
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

        playerScreen pS = new playerScreen(jFrame, container);
        System.out.println(playerNumber);
        if(playerNumber==2) {
            pS.two_player();
        }else if(playerNumber==3) {
            pS.three_player();
        }else if(playerNumber==4) {
            pS.four_player();
        }else{
            pS.five_player();
        }
    }

    public void initView() {
        // TODO Auto-generated method stub
        check_bank = new JButton("BANK");
        check_bank.setBounds(30, 500, 100, 50);
        check_bank.setFocusable(false);
        check_bank.addActionListener(actionListener);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.add(check_bank, JLayeredPane.PALETTE_LAYER);

        container.add(layeredPane);
        container.add(check_bank);
    }

    public JButton getCheck_bank() {
        return check_bank;
    }
}
