package Cards.ActionCard;

import Cards.Card;
import Cards.CardPrice;
public abstract class ActionCard extends Card {
    public ActionCard(String name, CardPrice price) {
        super(name, price);
    }

    public abstract void function();
}
