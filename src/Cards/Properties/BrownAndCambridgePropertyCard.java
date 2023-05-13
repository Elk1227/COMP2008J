package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class BrownAndCambridgePropertyCard extends Propertycard{
    CardColor colorOne = CardColor.CambridgeBlue;
    CardColor colorTwo = CardColor.Brown;

    CardColor currentColor ;
    int currentLayer ;

    public BrownAndCambridgePropertyCard(String name) {
        super(name, CardPrice.M1);
    }

    public void choseColor(){}
    public void changeColor(){}
}
