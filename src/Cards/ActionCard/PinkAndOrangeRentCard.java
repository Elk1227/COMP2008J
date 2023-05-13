package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class PinkAndOrangeRentCard extends ActionCard {
	CardColor colorOne = CardColor.Pink;
    CardColor colorTwo = CardColor.Orange;
    CardColor currentColor ;
	public PinkAndOrangeRentCard(String name) {
		super(name, CardPrice.M1);
	}
	public void choseColor(){}
	@Override
	public void function() {
		
		
	}

}
