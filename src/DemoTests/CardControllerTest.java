package DemoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.CardController;
import Controller.GameController;
import Player.Player;
import java.awt.Dimension;
import Cards.Card;

class CardControllerTest {
	 private CardController cardController;
     private GameController gameController;

     @BeforeEach
     public void setUp() {
         // Create a game controller
         gameController = new GameController();
         // Create a card controller
         cardController = new CardController(gameController);

     }

     @Test
     public void initCardTest() {
         ArrayList<Player> players= gameController.getPlayersArr();
         // Set the number of players to 2
         if(players.size() == 2){
         cardController.initCard();
         assertEquals(5,players.get(0).getHandCards().getHandCardSize());
         assertEquals(players.get(0).getHandCards().getFirstHandCard().getLocation(),new Point(280,500));
         }
         System.out.println("Successful test");
     }

     @Test
     public void initialPileTest() {
         // Set the number of players to 3
         ArrayList<Player> players= gameController.getPlayersArr();
         Dimension dimension = new Dimension(60, 100);
         if(players.size() == 3){
             cardController.initialPile();
             assertSame(players.get(0).getHandCards().getFirstHandCard().getSize(), dimension);
         }
         System.out.println("Successful test");
     }
     @Test
     public void moveTest() {
         // Create a card object
         ArrayList<Player> players= gameController.getPlayersArr();
         Card card=players.get(0).getHandCards().getFirstHandCard();
         // Create a start point and a destination point
         Point from = new Point(100, 100);
         Point to = new Point(200, 200);
         // Call move method
         cardController.move(card, from, to);
         System.out.println("Successful test");
     }

     @Test
     public void setCardLocationTest() {
         ArrayList<Player> players= gameController.getPlayersArr();
         Dimension dimension = new Dimension(40, 70);
         if(players.size() == 4){
             cardController.initialPile();
             assertSame(players.get(0).getHandCards().getFirstHandCard().getSize(), dimension);
         }
         System.out.println("Successful test");
     }

     @Test
     public void turnFrontTest() {
         try {
             //Create a Card object
             ArrayList<Player> players= gameController.getPlayersArr();
             Card card=players.get(0).getHandCards().getFirstHandCard();
             // Call the turnFront() method
             cardController.turnFront(card);
             // verification results
             Assert.assertTrue(card.isUp());
             System.out.println("Successful test");
         } catch (IOException e) {
             e.printStackTrace();
             Assert.fail("Exception occurred: " + e.getMessage());
         }
     }

     @Test
     public void turnRearTest() {
         //Create a Card object
         ArrayList<Player> players= gameController.getPlayersArr();
         Card card=players.get(0).getHandCards().getFirstHandCard();
         // Call the turnRear() method
         cardController.turnRear(card);
         // verification results
         Assert.assertFalse(card.isUp());
         System.out.println("Successful test");
     }

}
