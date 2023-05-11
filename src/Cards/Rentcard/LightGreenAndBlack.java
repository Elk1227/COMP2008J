package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class LightGreenAndBlack extends Rentcard{
    CardColor colorOne = CardColor.LightGreen;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public LightGreenAndBlack(String name) {
        super(name, CardPrice.M2);
    }

    public void choseColor(){}
    public void changeColor(){}

}
