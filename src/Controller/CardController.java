package Controller;

import Cards.Card;
import Cards.CardFactory;
import Cards.CardPile;
import Cards.Properties.PropertyCard;
import Game.changeImageSize;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;


public class CardController {

    private GameController gameController;

    private ArrayList<Player> players;

    private CardPile cardPile;

    private CardFactory factory;

    private PlayerController playerController;

    private ViewController viewController;




    public CardController(GameController gameController){
        this.gameController = gameController;
        viewController = gameController.getViewController();
        factory = new CardFactory();
        this.playerController = gameController.getPlayerController();
        players = playerController.getPlayers();
        cardPile = new CardPile();

        this.initialPile();
        viewController.gameController = gameController;

    }




    public void initCard() {
        for (Card card : cardPile.getCardPile()) {
            this.setCardLocation(card);
        }


        if(players.size() == 2){
            Player player1 =  players.get(0);
            ArrayList<Card> cards = player1.drawCard(cardPile);
            for (int i = 0; i<cards.size(); i++) {
                Card card = cards.get(i);
                card.setOwner(player1);
                System.out.println(card.getName());
                this.move(card , card.getLocation(),new Point(180+i*100,500));
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }




        }if(players.size() == 3){
            Player player1 =  players.get(0);
            ArrayList<Card> cards = player1.drawCard(cardPile);
            for (int i = 0; i<cards.size(); i++) {
                Card card = cards.get(i);
                card.setOwner(player1);
                this.move(card , card.getLocation(),new Point(180+i*100,550));
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        if(players.size() == 4){
            Player player1 =  players.get(0);
            ArrayList<Card> cards = player1.drawCard(cardPile);
            for (int i = 0; i<cards.size(); i++) {
                Card card = cards.get(i);
                card.setOwner(player1);
                this.move(card , card.getLocation(),new Point(150+i*100,635));
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        if(players.size() == 5){
            Player player1 =  players.get(0);
            ArrayList<Card> cards = player1.drawCard(cardPile);
            for (int i = 0; i<cards.size(); i++) {
                Card card = cards.get(i);
                card.setOwner(player1);
                this.move(card, card.getLocation(),new Point(150+i*100,645));
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }




    public void  initialPile(){
         cardPile.setCardPile((ArrayList<Card>)factory.packaging()) ;
        for (Card card : cardPile.getCardPile()) {
            card.setUp(false);
            this.turnRear(card);
            if(players.size()==2){
                card.setSize(90,150);

            } else if (players.size()==3) {
                card.setSize(60,100);

            } else if (players.size()==4) {
                card.setSize(54,90);

            }else {
                card.setSize(48,80);
            }
            card.setVisible(true);
        }
        cardPile.shuffle();
        cardPile.addCard();
    }








    public  void move(Card card, Point from, Point to) {
        if (to.y != from.y) {
            double k = (double) (to.x - from.x) / (to.y - from.y);
            double b = to.x - to.y * k;
            int speed = 0;
            if (from.y < to.y) {
                speed = 2;
            }
            else{
                speed = -2;
            }
            for (int i = from.y; Math.abs(i - to.y) > 2; i += speed) {
                double x = k * i + b;
                card.setLocation((int) x, i);
                card.repaint();
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        card.setLocation(to);
    }

//    public static void rePositon(GameJFrame m, ArrayList<Card> list, int flag) {
//        Point p = new Point();
//        if (flag == 0) {
//            p.x = 370 - list.size() * 20;
//            p.y = 530;
//        }
//        if (flag == 1) {
//            p.x = 50 + list.size() * 20;
//            p.y = 60;
//        }
//        int len = list.size();
//        for (int i = 0; i < len; i++) {
//            Card card = list.get(i);
//            this.move(card, card.getLocation(), p);
//            //moveCard(poker, p);
//            m.getContainer().setComponentZOrder(card, 0);
//            p.x += 90;
//
//        }
//    }



    public void setCardLocation(Card card) {
        Container container = viewController.getContainer();
        if (players.size() == 2) {
            card.setLocation(40, 70);
            container.add(card);
            container.setComponentZOrder(card, 0);
            card.setVisible(true);
        } else if (players.size() == 3) {
            card.setLocation(40, 70);
            container.add(card);
            container.setComponentZOrder(card, 0);

        } else if (players.size() == 4) {
            card.setLocation(40, 70);
            container.add(card);
            container.setComponentZOrder(card, 0);

        } else {
            card.setLocation(40, 70);
            container.add(card);
            container.setComponentZOrder(card, 0);

        }

    }


    public void turnFront(Card card) throws IOException {

        // 给牌设置反面
        changeImageSize changeSize = new changeImageSize();
        card.removeAll();
        changeSize.changeSize(card.getGraph(),card.getWidth(),card.getHeight());
        card.setIcon(new ImageIcon(card.getGraph()));
        card.repaint();
        viewController.repaint();
        // 修改成员变量
        card.setUp(true);

    }



    public void turnRear(Card card) {
        // 给牌设置反面
         card.removeAll();
        card.setIcon(new ImageIcon("resources/action cards/images.jpg"));
        card.repaint();
        viewController.repaint();
        // 修改成员变量
        card.setUp(false);
    }

    public void buildRealEstate(){
        Player player =  playerController.getCurrentplayer();
        for (Card handcard : player.getHandCards().getHandcards()) {
            if(handcard.isClicked()){
                if(handcard instanceof PropertyCard){
                    player.buildPropertySet((PropertyCard) handcard);
                    int i = player.getRealEstate().getSize();
                    Point to = new  Point(560+i*40,70);
                    this.moveCard(handcard,to);
                    player.getHandCards().removeCard(handcard);
                    reposition();

                }
            }

        }





    }


    public void reposition(){
        Player player = playerController.getCurrentplayer();
        ArrayList<Card> handcards = player.getHandCards().getHandcards();
        int size = players.size();
        if(size == 2){
            for (int i = 0; i < handcards.size(); i++) {
                Card card = handcards.get(i);
                moveCard(card,new Point(180+i*100,500));
            }
        } else if (size == 3) {
            for (int i = 0; i < handcards.size(); i++) {
                Card card = handcards.get(i);
                moveCard(card,new Point(180+i*100,550));
            }

        }else if (size == 4) {
            for (int i = 0; i < handcards.size(); i++) {
                Card card = handcards.get(i);
                moveCard(card,new Point(150+i*100,635));
            }

        }else {
            for (int i = 0; i < handcards.size(); i++) {
                Card card = handcards.get(i);
                moveCard(card,new Point(150+i*100,645));
            }

        }

    }

    public  void moveCard(Card moveCard, Point to) {
        Runnable moveTask = new MoveCartoon(moveCard, to);
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Thread move = new Thread(moveTask);
                move.start();
            }
        });
    }

    public class MoveCartoon implements Runnable{
        private Card card;
        private Point point;

        public MoveCartoon(Card aCard,Point aPoint) {
            card = aCard;
            point = aPoint;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            CardController.this.move(card, card.getLocation(), point);
            card.repaint();
        }

    }
}
