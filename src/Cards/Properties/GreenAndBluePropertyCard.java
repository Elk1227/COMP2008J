package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class GreenAndBluePropertyCard extends Propertycard{
    CardColor colorOne = CardColor.Green;
    CardColor colorTwo = CardColor.Blue;

    CardColor currentColor ;
    int currentLayer ;

    public GreenAndBluePropertyCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}
}
