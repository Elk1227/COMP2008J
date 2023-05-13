package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class BlackAndCambridgeBluePropertyCard extends Propertycard{
    CardColor colorOne = CardColor.CambridgeBlue;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public BlackAndCambridgeBluePropertyCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}
}
