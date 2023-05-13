package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class BlueAndGreenRentCard extends ActionCard {
	CardColor colorOne = CardColor.Blue;
    CardColor colorTwo = CardColor.Green;
    CardColor currentColor ;
	public BlueAndGreenRentCard(String name) {
		super(name, CardPrice.M1);
		
	}
	
	public void choseColor(){}
	@Override
	public void function() {
		
		
	}

}
