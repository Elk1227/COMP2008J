package Cards.ActionCard;

import Cards.Card;
import Cards.CardPrice;
import Cards.PriceCard.PriceCard;

public abstract class ActionCard extends PriceCard {

    public ActionCard(String name, CardPrice price) {
        super(name, price);
    }

    public abstract void function();
}
