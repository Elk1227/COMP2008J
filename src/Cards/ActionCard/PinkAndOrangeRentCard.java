package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class PinkAndOrangeRentCard extends ActionCard {
	private CardColor colorOne = CardColor.Pink;
	private CardColor colorTwo = CardColor.Orange;
	private CardColor currentColor ;
	public PinkAndOrangeRentCard(String name) {
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
