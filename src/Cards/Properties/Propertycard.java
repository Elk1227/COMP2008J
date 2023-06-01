package Cards.Properties;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

public abstract class Propertycard extends Card {
    private int rent;
    private CardColor color;

    private CardColor color1;
    private CardColor color2;
    private int fullLayer;


    public Propertycard(String name, CardPrice price, CardColor color, int fullLayer) {
        super(name, price);
        this.color = color;
        this.fullLayer = fullLayer;
    }

    public Propertycard(String name, CardPrice price, CardColor color1, CardColor color2,int fullLayer) {
        super(name, price);
        this.color1 = color1;
        this.color2 = color2;
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

    public void ChosenColor(){}
    public void ChangeColor(){
    }

}
