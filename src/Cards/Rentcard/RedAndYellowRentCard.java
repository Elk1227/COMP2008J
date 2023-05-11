package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class RedAndYellowRentCard extends Rentcard{
    CardColor colorOne = CardColor.Red;
    CardColor colorTwo = CardColor.Yellow;

    CardColor currentColor ;
    int currentLayer ;

    public RedAndYellowRentCard(String name) {
        super(name, CardPrice.M3);
    }

    public void choseColor(){}
    public void changeColor(){}
}
