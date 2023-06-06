package Cards.ActionCard;

import Cards.Card;
import Cards.CardPrice;
public abstract class ActionCard extends Card {
    public ActionCard(String name, CardPrice price,String graph) {
        super(name, price,graph);
    }

    public abstract void function();
}
