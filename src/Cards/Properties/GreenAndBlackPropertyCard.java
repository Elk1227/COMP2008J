package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class GreenAndBlackPropertyCard extends Propertycard{
    CardColor colorOne = CardColor.Green;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public GreenAndBlackPropertyCard(String name) {
        super(name, CardPrice.M4);
    }

    
    public void choseColor(){}
    public void changeColor(){}
}
