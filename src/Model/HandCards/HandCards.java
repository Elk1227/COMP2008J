package Model.HandCards;

import Model.Cards.Card;
import Model.Player.Player;

import java.util.ArrayList;

public class HandCards {
    private ArrayList<Card> handcards;
    private Player owner;
    private int count;

    public HandCards(Player owner) {
        handcards = new ArrayList<>();
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
                count--;
                return handcard;

            }

        }
        return null;
    }

    public boolean isEmpty(){
        return handcards.isEmpty();
    }

    public Card getFirstHandCard(){
        return handcards.get(0);
    }
    public int getHandCardSize(){
        return handcards.size();
    }

    public boolean isFull(){
        return count > 7;
    }


    public ArrayList<Card> getHandcards(){
        return handcards;
    }

    public int getCount() {
        return count;
    }
}
