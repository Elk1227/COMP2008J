package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class YellowRentCard extends Rentcard{
    public YellowRentCard(String name) {
        super(name, CardPrice.M3 , CardColor.Yellow, 3);
    }
}
