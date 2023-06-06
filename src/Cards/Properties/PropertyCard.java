package Cards.Properties;

import Cards.Card;
import Cards.CardColor;
import Cards.CardPrice;

import java.awt.event.MouseEvent;

public class PropertyCard extends Card {
    private int rent;
    private CardColor color;

    private CardColor color1;
    private CardColor color2;
    private int fullLayer;
    private int fullLayer1;
    private int fullLayer2;


    public PropertyCard(String name, CardPrice price, CardColor color, int fullLayer,String graph) {
        super(name, price,graph);
        this.color = color;
        this.fullLayer = fullLayer;
    }

    public PropertyCard(String name, CardPrice price, CardColor color1, CardColor color2,int fullLayer1,int fullLayer2,String graph) {
        super(name, price,graph);
        this.color1 = color1;
        this.color2 = color2;
        this.fullLayer1 = fullLayer1;
        this.fullLayer2 = fullLayer2;
    }

    public PropertyCard(String name ,CardPrice cardPrice , CardColor color , String graph){
        super(name, cardPrice,graph);
        this.color = color;
    };

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

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
//选了颜色必须是对应的层数
}
