package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class RedAndYellowPropertyCard extends Propertycard{
    private CardColor colorOne = CardColor.Red;
    private CardColor colorTwo = CardColor.Yellow;

    private CardColor currentColor ;
    private int currentLayer ;
    public RedAndYellowPropertyCard(String name) {
        super(name, CardPrice.M3);
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
