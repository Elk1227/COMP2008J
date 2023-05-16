package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class BlueAndGreenRentCard extends ActionCard {
	private CardColor colorOne = CardColor.Blue;
	private CardColor colorTwo = CardColor.Green;
	private CardColor currentColor ;
	public BlueAndGreenRentCard(String name) {
		super(name, CardPrice.M1);
		
	}
	
	public void choseColor(){}
	@Override
	public void function() {
		
		
	}

	public CardColor getColorOne() {
		return colorOne;
	}

	public CardColor getColorTwo() {
		return colorTwo;
	}

	public CardColor getCurrentColor() {
		return currentColor;
	}
}
