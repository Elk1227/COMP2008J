package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class BlackAndCambridgeBlueRentCard extends Rentcard{
    CardColor colorOne = CardColor.CambridgeBlue;
    CardColor colorTwo = CardColor.Black;

    CardColor currentColor ;
    int currentLayer ;

    public BlackAndCambridgeBlueRentCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}
}
