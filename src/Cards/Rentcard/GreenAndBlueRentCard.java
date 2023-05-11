package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class GreenAndBlueRentCard extends Rentcard{
    CardColor colorOne = CardColor.Green;
    CardColor colorTwo = CardColor.Blue;

    CardColor currentColor ;
    int currentLayer ;

    public GreenAndBlueRentCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}
}
