package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class CambridgeBlueAndBrownRentCard extends ActionCard{
	private CardColor colorOne = CardColor.CambridgeBlue;
	private CardColor colorTwo = CardColor.Brown;
	private CardColor currentColor ;
	public CambridgeBlueAndBrownRentCard(String name) {
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
