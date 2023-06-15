package Model.Bank;

import java.util.List;
import java.util.ArrayList;
import Model.Cards.Card;
import Model.Cards.CardPrice;
import Model.Player.Player;

public class Bank {
    private int id;
    private Player owner;
    private List<Card> cards;

    public Bank(int id,Player owner) {
    this.id=id;
    this.owner=owner;
    this.cards = new ArrayList<Card>();
    }
 
    public void addCard(Card card) {
        cards.add(card);
    }
 
    public void removeCard(Card card) {
        cards.remove(card);
    }
 
    public boolean hasCard(Card card) {
        return cards.contains(card);
    }
 
    //The list value stores the contents of the card price
    public List<CardPrice> transferCard (List<Card> cards) {
        List<CardPrice> prices = new ArrayList<>();
        for (int i=0; i<cards.size(); i=i+1) {
            Card aCard = cards.get(i);
            prices.add(aCard.getPrice());
        }
        return prices;
    }
    //Check if the bank is empty 
    public boolean isEmpty(){
        return cards.size() == 0;
    }
 
    //Calculate the price need to pay (in the bank) and give no change
    public int calculatePrice(int amount) {
    	if(!isEmpty()) {
    		int bankMoney = 0;
		    for (Card card : cards) {
		        bankMoney = bankMoney + card.getPrice().getPrice();
		    }
		    if (bankMoney < amount) {
		    	// If the amount in the bank is less than the amount claimed, return the full amount directly to the bank
		        return bankMoney;
		    } 
		    else if (bankMoney == amount || containsSingleCardEqualAmount(amount)) {
		    	// If the amount in the bank is equal to the amount claimed, or there is a card with the amount equal to the amount claimed, simply return the amount claimed
		        return amount;
		    }
		    else {
		    	// Find the sum of one or more cards that is larger than and closest to the amount claimed
		        return findClosestAmount(amount);
		    }
		}
	    else {
		    return 0;
	    }
    }    
    
    //Calculate whether there is a card with an amount equal to the amount claimed
    private boolean containsSingleCardEqualAmount(int amount) {
        for (Card card : cards) {
		    if (card.getPrice().getPrice() == amount) {
		        return true;
		    }
		}
		return false;
    }
    
    //Calculate the amount closest to the amount claimed
	private int findClosestAmount(int amount) {
	    int closestAmount = Integer.MAX_VALUE;
		List<Card> selectedCards = new ArrayList<>();
		findClosestAmountRecursive(amount, closestAmount, selectedCards, 0);
		return calculateSelectedCardsAmount(selectedCards);
	}

	private void findClosestAmountRecursive(int targetAmount, int closestAmount, List<Card> selectedCards, int currentIndex) {
		if (currentIndex >= cards.size()) {
		    return;
		}

		Card currentCard = cards.get(currentIndex);
		int currentCardPrice = currentCard.getPrice().getPrice();

		if (currentCardPrice == targetAmount) {
		    closestAmount = targetAmount;
		    selectedCards.clear();
		    selectedCards.add(currentCard);
		    return;
		}

	    if (currentCardPrice < targetAmount) {
		    selectedCards.add(currentCard);
		    findClosestAmountRecursive(targetAmount - currentCardPrice, closestAmount, selectedCards, currentIndex + 1);
		    selectedCards.remove(selectedCards.size() - 1);
		}
	  
		findClosestAmountRecursive(targetAmount, closestAmount, selectedCards, currentIndex + 1);

		if (closestAmount != targetAmount && Math.abs(currentCardPrice - targetAmount) < Math.abs(closestAmount - targetAmount)) {
		    closestAmount = currentCardPrice;
		    selectedCards.clear();
		    selectedCards.add(currentCard);
		}
	}
    //Calculate the sum of the selected cards
	private int calculateSelectedCardsAmount(List<Card> selectedCards) {
	    int totalAmount = 0;
	    for (Card card : selectedCards) {
		    totalAmount = totalAmount + card.getPrice().getPrice();
		}
	    return totalAmount;
    }

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public int getBankSize() {
		return cards.size();
	}

}


//The fact that the bank doesn't have the money but there's half the property built outside the bank that can be paid for hasn't been written yet