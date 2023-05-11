package Cards.Rentcard;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

public abstract class Rentcard extends Card {
    public int rent;
    public CardColor color;
    public int layer;



    public Rentcard(String name, CardPrice price) {
        super(name,price);
    }


    public Rentcard(String name, CardPrice price, CardColor color, int layer) {
        super(name, price);
        this.color = color;
        this.layer = layer;
    }
}
