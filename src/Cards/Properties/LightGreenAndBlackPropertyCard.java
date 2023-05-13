package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class LightGreenAndBlackPropertyCard extends Propertycard{
    CardColor colorOne = CardColor.LightGreen;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public LightGreenAndBlackPropertyCard(String name) {
        super(name, CardPrice.M2);
    }

    public void choseColor(){}
    public void changeColor(){}

}
