package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

import java.awt.*;

public class PinkAndOrangePropertyCard extends Propertycard{
     CardColor colorOne = CardColor.Pink;
     CardColor colorTwo = CardColor.Orange;

     CardColor currentColor ;
     int currentLayer ;

    public PinkAndOrangePropertyCard(String name) {
        super(name, CardPrice.M2);
    }

    public void choseColor(){}
    public void changeColor(){}
}
