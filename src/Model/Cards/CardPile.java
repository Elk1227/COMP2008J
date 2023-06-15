package Model.Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CardPile {
    private  ArrayList<Card> cardPile = new ArrayList<>();
    private  Stack<Card> trueCardPile = new Stack<>();

    public CardPile() {

    }


    public void  addCard(){
        for (Card card : cardPile) {
            trueCardPile.push(card);
        }
    }

    public ArrayList<Card> getCards(int x){
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            cards.add(trueCardPile.pop());

        }
        return  cards;

    }

    public void shuffle(){
        Collections.shuffle(cardPile);
    }

    public boolean isEmpty(){
        return trueCardPile.isEmpty();
    }

    public Stack<Card> getTrueCardPile(){
        return trueCardPile;
    }

    public void setCardPile(ArrayList<Card> cardPile) {
        this.cardPile = cardPile;
    }

    public void setTrueCardPile(Stack<Card> trueCardPile) {
        this.trueCardPile = trueCardPile;
    }

    public  ArrayList<Card> getCardPile() {
        return cardPile;
    }


}





