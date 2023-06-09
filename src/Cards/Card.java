package Cards;

import Game.changeImageSize;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;


public abstract class Card extends JLabel implements MouseListener {
        //private GameJFrame gameJFrame;
        private String name;
        private CardPrice price;
        private boolean canClicked = false;

        private String graph ;

    private boolean up;

    private boolean clicked = false;

    private boolean multipleClicks = false;

    private Player owner;




        public Card(String name, CardPrice price,String graph) {
            this.name = name;
            this.price = price;
            this.graph = graph;
            this.addMouseListener(this);



        }

    public void turnFront() throws IOException {

        // 给牌设置反面
        changeImageSize changeSize = new changeImageSize();
        this.removeAll();
        changeSize.changeSize(this.graph,this.getWidth(),this.getHeight());
        this.setIcon(new ImageIcon(this.graph));
        this.repaint();
        //gameJFrame.repaint();
        // 修改成员变量
        this.up = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            Point from = this.getLocation();
            int step;
            if (clicked) {
                //已经被点击：下降, 而且原本选中的角色不变成未选中状态
                step = 20;
                clicked = false;
            } else {
                int i = 0;
                for (Card handcard : owner.getHandCards().getHandcards()) {
                    if(handcard.clicked == true){
                        i++;

                    }

                }
                if (i==0){
                    step = -20;

                    clicked = true;
                }else {
                    step = 0;
                }

            }

            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }




    public void turnRear() {
        // 给牌设置反面
        this.removeAll();
        this.setIcon(new ImageIcon("resources/action cards/images.jpg"));
        this.repaint();
        //gameJFrame.repaint();
        // 修改成员变量
        this.up = false;
    }

    public String getName() {
            return name;}
    public CardPrice getPrice() {
            return price;
        }


    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isCanClicked() {
        return canClicked;
    }

    public String getGraph() {
        return graph;
    }

    public boolean isClicked() {
        return clicked;
    }

    public boolean isMultipleClicks() {
        return multipleClicks;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(CardPrice price) {
        this.price = price;
    }

    public void setCanClicked(boolean canClicked) {
        this.canClicked = canClicked;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public void setMultipleClicks(boolean multipleClicks) {
        this.multipleClicks = multipleClicks;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
