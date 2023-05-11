package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class BrownAndCambridgeRentCard extends Rentcard{
    CardColor colorOne = CardColor.CambridgeBlue;
    CardColor colorTwo = CardColor.Brown;

    CardColor currentColor ;
    int currentLayer ;

    public BrownAndCambridgeRentCard(String name) {
        super(name, CardPrice.M1);
    }

    public void choseColor(){}
    public void changeColor(){}
}
