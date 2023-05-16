package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class BlackAndCambridgeBluePropertyCard extends Propertycard{
    private CardColor colorOne = CardColor.CambridgeBlue;
    private CardColor colorTwo = CardColor.Black;

    private CardColor currentColor ;
    private int currentLayer ;

    public BlackAndCambridgeBluePropertyCard(String name) {
        super(name, CardPrice.M4);
    }

    public void choseColor(){}
    public void changeColor(){}

    public CardColor getColorOne() {
        return colorOne;
    }

    public CardColor getColorTwo() {
        return colorTwo;
    }

    public CardColor getCurrentColor() {
        return currentColor;
    }

    public int getCurrentLayer() {
        return currentLayer;
    }
}
