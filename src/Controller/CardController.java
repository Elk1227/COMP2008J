package Controller;

import Cards.ActionCard.ActionCard;
import Cards.Card;
import Cards.CardColor;
import Cards.CardFactory;
import Cards.CardPile;
import Cards.PriceCard.PriceCard;
import Cards.Properties.PropertyCard;
import Game.changeImageSize;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;



public class CardController {

    private GameController gameController;
    private ArrayList<Card> foldPile = new ArrayList<>();

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
                System.out.println(card.getLocation().toString());
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player2 =  players.get(1);
            ArrayList<Card> cards2 = player2.drawCard(cardPile);
            for (int i = 0; i<cards2.size(); i++) {
                Card card = cards2.get(i);
                card.setOwner(player2);
                card.setLocation(new Point(180+i*100,500));

                card.setVisible(false);
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
            Player player2 =  players.get(1);
            ArrayList<Card> cards2 = player2.drawCard(cardPile);
            for (int i = 0; i<cards2.size(); i++) {
                Card card = cards2.get(i);
                card.setOwner(player2);
                card.setLocation(new Point(180+i*100,550));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player3 =  players.get(2);
            ArrayList<Card> cards3 = player3.drawCard(cardPile);
            for (int i = 0; i<cards3.size(); i++) {
                Card card = cards3.get(i);
                card.setOwner(player3);
                card.setLocation(new Point(180+i*100,550));
                card.setVisible(false);
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
            Player player2 =  players.get(1);
            ArrayList<Card> cards2 = player2.drawCard(cardPile);
            for (int i = 0; i<cards2.size(); i++) {
                Card card = cards2.get(i);
                card.setOwner(player2);
                card.setLocation(new Point(150+i*100,635));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player3 =  players.get(2);
            ArrayList<Card> cards3 = player3.drawCard(cardPile);
            for (int i = 0; i<cards3.size(); i++) {
                Card card = cards3.get(i);
                card.setOwner(player3);
                card.setLocation(new Point(150+i*100,635));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player4 =  players.get(3);
            ArrayList<Card> cards4 = player4.drawCard(cardPile);
            for (int i = 0; i<cards4.size(); i++) {
                Card card = cards4.get(i);
                card.setOwner(player4);
                card.setLocation(new Point(150+i*100,635));
                card.setVisible(false);
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
            Player player2 =  players.get(1);
            ArrayList<Card> cards2 = player2.drawCard(cardPile);
            for (int i = 0; i<cards2.size(); i++) {
                Card card = cards2.get(i);
                card.setOwner(player2);
                card.setLocation(new Point(150+i*100,645));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player3 =  players.get(2);
            ArrayList<Card> cards3 = player3.drawCard(cardPile);
            for (int i = 0; i<cards3.size(); i++) {
                Card card = cards3.get(i);
                card.setOwner(player3);
                card.setLocation(new Point(150+i*100,645));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player4 =  players.get(3);
            ArrayList<Card> cards4 = player4.drawCard(cardPile);
            for (int i = 0; i<cards4.size(); i++) {
                Card card = cards4.get(i);
                card.setOwner(player4);
                card.setLocation(new Point(150+i*100,645));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Player player5 =  players.get(4);
            ArrayList<Card> cards5 = player5.drawCard(cardPile);
            for (int i = 0; i<cards5.size(); i++) {
                Card card = cards5.get(i);
                card.setOwner(player5);
                card.setLocation(new Point(150+i*100,645));
                card.setVisible(false);
                try {
                    this.turnFront(card);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        playerController.getCurrentplayer().setTime(3);
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

    public Card buildRealEstate1() {
        Player player = playerController.getCurrentplayer();
        int size = players.size();
        if (player.getTime() != 0) {
            if (size == 2) {
                if (player.getId() == 1) {
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if (handcard.isClicked()) {
                            if (handcard instanceof PropertyCard ) {
                                PropertyCard propertyCard = (PropertyCard)handcard;
                                if(propertyCard.getColor()!=null && propertyCard.getColor()== CardColor.wild){
                                    player.buildPropertySet((PropertyCard) handcard);
                                    int i = player.getRealEstate().getSize();
                                    Point to = new  Point(550+i*90,100);
                                    this.moveCard(handcard,to);
                                    player.getHandCards().removeCard(handcard);
                                    reposition();
                                    int time = player.getTime()-1;
                                    player.setTime(time);
                                } else if (propertyCard.getColor()== CardColor.wild) {




                                }else {
                                     propertyCard.getColor1();
                                     viewController.button2.setVisible(true);
                                     viewController.button1.setVisible(true);
                                     System.out.println("11111");
                                }


                            }
                        }

                    }
                }
            }

        }
        return null;
    }
                public void buildRealEstate(){
        Player player =  playerController.getCurrentplayer();
        int size  =    players.size();
        if (player.getTime()!=0){
            if(size == 2){
                if(player.getId()==1){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(550+i*90,100);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }
                }else if(player.getId()==2){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(550+i*90,320);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }

            } else if (size == 3) {
                if(player.getId()==1){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(550+i*60,80);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }
                }else if(player.getId()==2){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(550+i*60,320);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else if(player.getId()==3){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(550+i*60,430);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }

            }else if (size == 4){
                if(player.getId()==1){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*54,70);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);

                            }
                        }

                    }
                }else if(player.getId()==2){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*54,220);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else if(player.getId()==3){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*54,370);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else if(player.getId()==4){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*54,520);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }



            }else {
                if(player.getId()==1){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*48,70);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);

                            }
                        }

                    }
                }else if(player.getId()==2){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*48,220);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else if(player.getId()==3){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*48,370);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else if(player.getId()==4){
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*48,520);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }

                }else {
                    for (Card handcard : player.getHandCards().getHandcards()) {
                        if(handcard.isClicked()){
                            if(handcard instanceof PropertyCard){
                                player.buildPropertySet((PropertyCard) handcard);
                                int i = player.getRealEstate().getSize();
                                Point to = new  Point(530+i*48,550);
                                this.moveCard(handcard,to);
                                player.getHandCards().removeCard(handcard);
                                reposition();
                                int time = player.getTime()-1;
                                player.setTime(time);


                            }
                        }

                    }
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

    public void moveToBank() {

        Player player = playerController.getCurrentplayer();

        if(player.getTime()!=0){
            if (players.size() == 2) {
                if (player.getId() == 1) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(215 + i * 20, 100);
                            System.out.println(collectCard.getLocation());
                            this.moveCard(collectCard, to);
                            System.out.println(collectCard.getLocation());
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);

                        }
                    }
                } else if (player.getId() == 2) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(215 + i * 20, 320);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                }
            } else if (players.size() == 3) {
                if (player.getId() == 1) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 80);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 2) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 320);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 3) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 430);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                }
            } else if (players.size() == 4) {
                if (player.getId() == 1) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(185 + i * 20, 70);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 2) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 220);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 3) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 370);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 4) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 520);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                }
            } else if (players.size() == 5) {
                if (player.getId() == 1) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(185 + i * 20, 70);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 2) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 220);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 3) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 370);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 4) {
                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 520);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);

                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                } else if (player.getId() == 5) {

                    for (Card collectCard : player.getHandCards().getHandcards()) {
                        if (collectCard.isClicked() && (collectCard instanceof ActionCard || collectCard instanceof PriceCard)) {
                            player.buildBank(collectCard);
                            int i = player.getBank().getBankSize();
                            Point to = new Point(210 + i * 20, 550);
                            this.moveCard(collectCard, to);
                            player.getHandCards().removeCard(collectCard);
                            reposition();
                            int time = player.getTime()-1;
                            player.setTime(time);
                        }
                    }
                }
            }
        }
    }


    public  void moveCard(Card moveCard, Point to) {
        this.move(moveCard,moveCard.getLocation(),to);
//        Runnable moveTask = new MoveCartoon(moveCard, to);
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                Thread move = new Thread(moveTask);
//                move.start();
//                try {
//                    move.join();
//                    moveTask.run();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });

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
            card.revalidate();
            card.repaint();
        }

    }

    public CardPile getCardPile() {
        return cardPile;
    }

    public void setCardPile(CardPile cardPile) {
        this.cardPile = cardPile;
    }




    public void discard(){
        Player player =  playerController.getCurrentplayer();

        for (Card handcard : player.getHandCards().getHandcards()) {
            while (player.getHandCards().isFull()){
                viewController.add_house.setEnabled(false);
                viewController.add_to_bank.setEnabled(false);
                viewController.use_function.setEnabled(false);
                viewController.finish_output.setEnabled(false);
                for(int i=0;i<2;i++) {
                    if(handcard.isClicked()){
                        player.getHandCards().removeCard(handcard);
                        foldPile.add(handcard);
                        if (players.size() == 2) {
                            Point to = new  Point(40,260);
                            this.moveCard(handcard,to);


                        }
                        else if(players.size() == 3) {
                            Point to = new  Point(40,240);
                            this.moveCard(handcard,to);


                        }else if(players.size() == 4) {
                            Point to = new  Point(40,220);
                            this.moveCard(handcard,to);


                        }
                        else if(players.size() == 5) {
                            Point to = new  Point(40,200);
                            this.moveCard(handcard,to);

                        }
                    }
                }
                viewController.add_house.setEnabled(true);
                viewController.add_to_bank.setEnabled(true);
                viewController.use_function.setEnabled(true);
                viewController.finish_output.setEnabled(true);

            }
        }
    }
}
