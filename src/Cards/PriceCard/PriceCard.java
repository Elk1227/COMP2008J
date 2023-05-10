package Cards.PriceCard;

import Cards.Card;
import Cards.CardPrice;

public abstract class PriceCard extends Card {

    public String name;
    public CardPrice price;
    public PriceCard(String name, CardPrice price) {
        super(name, price);
    }
}

