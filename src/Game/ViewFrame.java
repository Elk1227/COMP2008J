package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static Game.MonopolyModel.selectedValue;

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

        // 设置标题
        jFrame.setTitle("Monopoly Deal Cards");
        // 设置大小
        jFrame.setSize(1024, 768);
        // 设置关闭模式
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口无法进行调节
        jFrame.setResizable(false);
        // 界面居中
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
