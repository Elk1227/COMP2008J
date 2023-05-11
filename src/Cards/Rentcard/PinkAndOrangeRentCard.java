package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

import java.awt.*;

public class PinkAndOrangeRentCard extends Rentcard{
     CardColor colorOne = CardColor.Pink;
     CardColor colorTwo = CardColor.Orange;

     CardColor currentColor ;
     int currentLayer ;

    public PinkAndOrangeRentCard(String name) {
        super(name, CardPrice.M2);
    }

    public void choseColor(){}
    public void changeColor(){}
}
