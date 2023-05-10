package Cards.Cards.ActionCard;

import Cards.Cards.*;

public abstract class ActionCard extends Card {

    public ActionCard(String name, CardPrice price) {
        super(name, price);
    }

    public abstract void function();
}
