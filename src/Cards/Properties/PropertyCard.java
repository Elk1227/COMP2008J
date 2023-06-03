package Cards.Properties;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

public class PropertyCard extends Card {
    private int rent;
    private CardColor color;

    private CardColor color1;
    private CardColor color2;
    private int fullLayer;
    private int fullLayer1;
    private int fullLayer2;


    public PropertyCard(String name, CardPrice price, CardColor color, int fullLayer) {
        super(name, price);
        this.color = color;
        this.fullLayer = fullLayer;
    }

    public PropertyCard(String name, CardPrice price, CardColor color1, CardColor color2,int fullLayer1,int fullLayer2) {
        super(name, price);
        this.color1 = color1;
        this.color2 = color2;
        this.fullLayer1 = fullLayer1;
        this.fullLayer2 = fullLayer2;
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
//选了颜色必须是对应的层数
}
