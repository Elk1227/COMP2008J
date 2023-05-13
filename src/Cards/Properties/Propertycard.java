package Cards.Properties;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

public abstract class Propertycard extends Card {
    public int rent;
    public CardColor color;
    public int layer;



    public Propertycard(String name, CardPrice price) {
        super(name,price);
    }


    public Propertycard(String name, CardPrice price, CardColor color, int layer) {
        super(name, price);
        this.color = color;
        this.layer = layer;
    }
}
