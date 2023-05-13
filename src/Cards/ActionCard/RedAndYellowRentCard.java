package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class RedAndYellowRentCard extends ActionCard{
	CardColor colorOne = CardColor.Red;
    CardColor colorTwo = CardColor.Yellow;
    CardColor currentColor ;
	public RedAndYellowRentCard(String name) {
		super(name,CardPrice.M1);
		
	}
	public void choseColor(){}
	@Override
	public void function() {
		
		
	}

}
