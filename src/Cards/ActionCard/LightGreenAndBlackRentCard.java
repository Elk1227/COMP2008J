package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class LightGreenAndBlackRentCard extends ActionCard{
	CardColor colorOne = CardColor.LightGreen;
    CardColor colorTwo = CardColor.Black;
    CardColor currentColor ;
    
	public LightGreenAndBlackRentCard(String name) {
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
