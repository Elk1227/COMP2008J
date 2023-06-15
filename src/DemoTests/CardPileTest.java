package DemoTests;
import Model.Cards.ActionCard.*;
import Model.Cards.Card;
import Model.Cards.CardPile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CardPileTest {
    private CardPile cardPile;

    @BeforeEach
    public void setUp() {
        cardPile = new CardPile();
        // Create some sample cards and set up the card pile
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(
                new JustSayNoCard(),
                new PassGoCard(),
                new ForceDealCard(),
                new SlyDealCard()
        ));
        cardPile.setCardPile(cards);
        cardPile.addCard();
    }

    @Test
    public void testGetCards() {
        //gets the specified number of cards
        ArrayList<Card> drawnCards = cardPile.getCards(2);
        assertEquals(2, drawnCards.size());
        assertNotEquals(drawnCards.get(0), drawnCards.get(1));
        System.out.println("Successful test");
    }

    @Test
    public void testShuffle() {
        //whether the order of the cards changes after shuffling
        ArrayList<Card> originalOrder = new ArrayList<>(cardPile.getTrueCardPile());
        cardPile.shuffle();
        cardPile.addCard();
        assertNotEquals(originalOrder, cardPile);
        System.out.println("Successful test");
    }

    @Test
    public void testIsEmpty() {
        // when the card pile is not empty, the isEmpty method returns false 
        assertFalse(cardPile.isEmpty());

        // when the card pile is empty, the isEmpty method returns true 
        cardPile.getTrueCardPile().clear();
        assertTrue(cardPile.isEmpty());
        System.out.println("Successful test");
    }
}
