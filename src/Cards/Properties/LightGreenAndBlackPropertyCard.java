package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class LightGreenAndBlackPropertyCard extends Propertycard{
    private CardColor colorOne = CardColor.LightGreen;
    private CardColor colorTwo = CardColor.Black;

    private CardColor currentColor ;
    private int currentLayer ;

    public LightGreenAndBlackPropertyCard(String name) {
        super(name, CardPrice.M2);
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
