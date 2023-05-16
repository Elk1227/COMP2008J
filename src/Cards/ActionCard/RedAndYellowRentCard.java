package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class RedAndYellowRentCard extends ActionCard{
	private CardColor colorOne = CardColor.Red;
	private CardColor colorTwo = CardColor.Yellow;
	private CardColor currentColor ;
	public RedAndYellowRentCard(String name) {
		super(name,CardPrice.M1);
		
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
