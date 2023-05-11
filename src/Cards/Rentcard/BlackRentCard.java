package Cards.Rentcard;

import Cards.CardColor;
import Cards.CardPrice;

public class BlackRentCard extends Rentcard{
    public BlackRentCard(String name) {
        super(name, CardPrice.M2, CardColor.Black, 4);
    }
}
