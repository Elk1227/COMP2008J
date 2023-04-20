package Cards;

public abstract class ActionCard extends Card {

    public ActionCard(String name, int value, boolean isUsed, boolean becomePriceCard) {
        super(name, value, isUsed, becomePriceCard);
    }

    public abstract void function();
}
