package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class BlackPropertyCard extends Propertycard{
    public BlackPropertyCard(String name) {
        super(name, CardPrice.M2, CardColor.Black, 4);
    }
}
