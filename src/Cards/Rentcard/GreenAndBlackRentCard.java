package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class GreenAndBlackRentCard extends Rentcard{
    CardColor colorOne = CardColor.Green;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public GreenAndBlackRentCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}
}
