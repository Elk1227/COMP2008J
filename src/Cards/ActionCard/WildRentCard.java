package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class WildRentCard extends ActionCard{
	private CardColor color;
	public WildRentCard(String name) {
		super(name, CardPrice.M3);
		}
	public void choseColor(){}
	@Override
	public void function() {
		
	}

	public CardColor getColor() {
		return color;
	}
}
