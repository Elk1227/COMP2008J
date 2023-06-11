package DemoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import Cards.Card;
import Cards.ActionCard.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Cards.CardFactory;
class CardFactoryTest {

	 @Test
	    public void testPackaging() {
	        CardFactory cardFactory = new CardFactory();
	        List<Card> allCards = cardFactory.packaging();
	        int expectedTotalCards = 2+2+2+3+3+3+3+3+3+4+1+1+1+1+1+2+2+2+2+3+3+4+3+3+10+3+3+2+2+2+2+2+2+3+6+5+3+3+2+1;
	        // Check that the list is not empty and contains the expected number of cards
	        Assertions.assertNotNull(allCards);
	        Assertions.assertEquals(expectedTotalCards, allCards.size());

	        // Check that this list has the expected number of cards of a particular type
	        Assertions.assertEquals(2, compareType(allCards, DealBreakerCard.class));
	        Assertions.assertEquals(3, compareType(allCards, DebtCollectorCard.class));
	        Assertions.assertEquals(4, compareType(allCards, ForceDealCard.class));
	        System.out.println("Successful test");
	    }

	    private int compareType(List<Card> cardList, Class<?> cardType) {
	        int count = 0;
	        for (Card card : cardList) {
	            if (card.getClass().equals(cardType)) {
	                count++;
	            }
	        }
	        return count;
	    }
}
