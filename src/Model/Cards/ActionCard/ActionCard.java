package Model.Cards.ActionCard;

import Controller.GameController;
import Model.Cards.Card;
import Model.Cards.CardPrice;
public abstract class ActionCard extends Card {
    public ActionCard(String name, CardPrice price,String graph) {
        super(name, price,graph);
    }

    public abstract void function(GameController controller);
}
