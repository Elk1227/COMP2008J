package Cards;

public abstract class Card {
    final String name;
    final int value;
    boolean isUsed;
    boolean becomePriceCard;

    public Card(String name, int value, boolean isUsed, boolean becomePriceCard) {
        this.name = name;
        this.value = value;
        this.isUsed = isUsed;
        this.becomePriceCard = becomePriceCard;
    }
}	