package Cards.Properties;

import Cards.CardColor;
import Cards.CardPrice;

public class WildProperty extends Propertycard{

    private CardColor color;
    public WildProperty(String name) {

        super(name,null,null,0);
    }

    public void ChosenColor(){}
    public void ChangeColor(){}

    @Override
    public CardColor getColor() {
        return color;
    }
}
