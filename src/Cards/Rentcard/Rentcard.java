package Cards.Rentcard;

import Cards.Card;
import Cards.CardPrice;

public abstract class Rentcard extends Card {


    public Rentcard(String name, CardPrice price) {
        super(name,price);
    }
}
