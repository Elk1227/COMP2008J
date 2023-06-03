package Cards.Properties;
import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;
public class WildPropertyCard extends Card {
	CardColor color;

    public WildPropertyCard(String name){
    	super(name,CardPrice.M0);
	}

	public void ChosenColor(){}
	public void ChangeColor(){}

	public CardColor getColor() {
	    return color;
	}
}

