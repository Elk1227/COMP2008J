package DemoTests;

import  Model.Cards.Card;
import  Model.Cards.ActionCard.DealBreakerCard;
import  Model.Cards.ActionCard.DebtCollectorCard;
import  Model.Cards.ActionCard.ForceDealCard;
import  Model.HandCards.HandCards;
import Model. Player.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HandCardsTest {
    private HandCards handCards;
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player(1);
        handCards = new HandCards(player);
    }

    @Test
    public void addCardTest() {
        Card card = new DealBreakerCard();
        handCards.addCard(card);
        Assertions.assertTrue(handCards.getHandCardSize() == 1);
        Assertions.assertEquals(card, handCards.getFirstHandCard());
        System.out.println("Successful test");
    }


    @Test
    public void removeCardTest() {
        Card card = new ForceDealCard();
        handCards.addCard(card);
        Assertions.assertEquals(1,handCards.getHandCardSize());
        handCards.removeCard(card);
        Assertions.assertEquals(0,handCards.getHandCardSize());
        Assertions.assertTrue(handCards.isEmpty());
        System.out.println("Successful test");
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(handCards.isEmpty());
        Card card = new ForceDealCard();
        handCards.addCard(card);
        Assertions.assertFalse(handCards.isEmpty());
        System.out.println("Successful test");
    }

    @Test
    public void isFullTest() {
        for (int i = 0; i < 7; i++) {
            Card card = new DebtCollectorCard();
            handCards.addCard(card);
        }
        Assertions.assertFalse(handCards.isFull());
        Card extraCard = new  ForceDealCard();
        handCards.addCard(extraCard);
        Assertions.assertTrue(handCards.isFull());
        System.out.println("Successful test");
    }


    @Test
    public void getHandCardSizeTest() {
        Assertions.assertEquals(0, handCards.getHandCardSize());
        Card card = new DebtCollectorCard();
        handCards.addCard(card);
        Assertions.assertEquals(1, handCards.getHandCardSize());
        System.out.println("Successful test");
    }

}
