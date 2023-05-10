package Cards.PriceCard;

import Cards.*;

public abstract class PriceCard extends Card {

    public String name;
    public CardPrice price;
    public PriceCard(String name, CardPrice price) {
        super(name, price);
    }
}

