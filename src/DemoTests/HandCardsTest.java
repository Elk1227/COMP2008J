package DemoTests;

import Cards.Card;
import Cards.ActionCard.DealBreakerCard;
import Cards.ActionCard.DebtCollectorCard;
import Cards.ActionCard.ForceDealCard;
import HandCards.HandCards;
import Player.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandCardsTest {
    private HandCards handCards;
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player(1);
        handCards = new HandCards(player);
    }

    @Test
    public void testAddCard() {
        Card card = new DealBreakerCard();
        handCards.addCard(card);

        Assertions.assertTrue(handCards.getHandCardSize() == 1);
        Assertions.assertEquals(card, handCards.getFirstHandCard());
    }


    @Test
    public void testRemoveCard() {
        Card card = new ForceDealCard();
        handCards.addCard(card);
        Assertions.assertEquals(1,handCards.getHandCardSize());
        Card removedCard = handCards.removeCard(card);
        Assertions.assertEquals(0,handCards.getHandCardSize());
        Assertions.assertTrue(handCards.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(handCards.isEmpty());

        Card card = new ForceDealCard();
        handCards.addCard(card);

        Assertions.assertFalse(handCards.isEmpty());
    }

    @Test
    public void testIsFull() {
        for (int i = 0; i < 7; i++) {
            Card card = new DebtCollectorCard();
            handCards.addCard(card);
        }
        Assertions.assertFalse(handCards.isFull());
        Card extraCard = new  ForceDealCard();
        handCards.addCard(extraCard);
        Assertions.assertTrue(handCards.isFull());
    }


    @Test
    public void testGetHandCardSize() {
        Assertions.assertEquals(0, handCards.getHandCardSize());

        Card card = new DebtCollectorCard();
        handCards.addCard(card);

        Assertions.assertEquals(1, handCards.getHandCardSize());
    }

    // Add more tests as needed...

}
