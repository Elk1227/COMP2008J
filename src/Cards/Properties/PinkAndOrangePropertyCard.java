package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

import java.awt.*;

public class PinkAndOrangePropertyCard extends Propertycard{
    private CardColor colorOne = CardColor.Pink;
    private CardColor colorTwo = CardColor.Orange;

    private CardColor currentColor ;
    private int currentLayer ;

    public PinkAndOrangePropertyCard(String name) {
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
