package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class RedAndYellowPropertyCard extends Propertycard{
    CardColor colorOne = CardColor.Red;
    CardColor colorTwo = CardColor.Yellow;

    CardColor currentColor ;
    int currentLayer ;

    public RedAndYellowPropertyCard(String name) {
        super(name, CardPrice.M3);
    }

    public void choseColor(){}
    public void changeColor(){}
}
