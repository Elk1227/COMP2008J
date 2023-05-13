package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class CambridgeBlueAndBrownRentCard extends ActionCard{
	CardColor colorOne = CardColor.CambridgeBlue;
    CardColor colorTwo = CardColor.Brown;
    CardColor currentColor ;
	public CambridgeBlueAndBrownRentCard(String name) {
		super(name, CardPrice.M1);
	}
	public void choseColor(){}
	@Override
	public void function() {
	
		
	}

}
