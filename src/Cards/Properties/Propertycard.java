package Cards.Properties;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

public abstract class Propertycard extends Card {
    public int rent;
    public CardColor color;
    public int fullLayer;



    public Propertycard(String name, CardPrice price) {
        super(name,price);
    }


    public Propertycard(String name, CardPrice price, CardColor color, int fullLayer) {
        super(name, price);
        this.color = color;
        this.fullLayer = fullLayer;
    }

    public int getRent() {
        return rent;
    }

    public CardColor getColor() {
        return color;
    }

    public int getFullLayer() {
        return fullLayer;
    }
}
