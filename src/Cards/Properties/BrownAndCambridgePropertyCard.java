package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class BrownAndCambridgePropertyCard extends Propertycard{
    private CardColor colorOne = CardColor.CambridgeBlue;
    private CardColor colorTwo = CardColor.Brown;

    private CardColor currentColor ;
    private int currentLayer ;

    public BrownAndCambridgePropertyCard(String name) {
        super(name, CardPrice.M1);
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
