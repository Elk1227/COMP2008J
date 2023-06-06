package Cards;

import Game.gameJFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Card extends JLabel implements MouseListener {
        private gameJFrame gameJFrame;
        private String name;
        private CardPrice price;
        private boolean canClicked = false;

        private String graph ;

    private boolean up;

    private boolean clicked = false;

    private boolean multipleClicks = false;




        public Card(String name, CardPrice price,String graph) {
            this.name = name;
            this.price = price;
            this.graph = graph;
            this.addMouseListener(this);



        }

    public void turnFront() {
        // 给牌设置反面
        this.removeAll();
        this.setIcon(new ImageIcon());
        this.repaint();
        gameJFrame.repaint();
        // 修改成员变量
        this.up = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    public void turnRear() {
        // 给牌设置反面
        this.removeAll();
        this.setIcon(new ImageIcon("resources/action cards/images.jpg"));
        this.repaint();
        gameJFrame.repaint();
        // 修改成员变量
        this.up = false;
    }

    public String getName() {
            return name;}
    public CardPrice getPrice() {
            return price;
        }

    public Game.gameJFrame getGameJFrame() {
        return gameJFrame;
    }

    public void setGameJFrame(Game.gameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }
}
