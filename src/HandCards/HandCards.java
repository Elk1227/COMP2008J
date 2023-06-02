package HandCards;

import Cards.Card;
import Player.Player;

import java.util.ArrayList;

public class HandCards {
    private ArrayList<Card> handcards;
    private Player owner;
    private int count;

    public HandCards(Player owner) {
        this.owner = owner;
    }

    public HandCards(ArrayList<Card> handcards, Player owner, int count) {
        this.handcards = handcards;
        this.owner = owner;
        this.count = count;
    }


    public void addCard(Card card){
        handcards.add(card);
        count++;

    }
    public Card removeCard(Card card){
        for (Card handcard : handcards) {
            if (handcard == card){
                handcards.remove(handcard);
                return handcard;

            }

        }
        return null;
    }

    public boolean isEmpty(){
        return handcards.isEmpty();
    }


    public boolean isFull(){
        return count > 7;
    }
}
