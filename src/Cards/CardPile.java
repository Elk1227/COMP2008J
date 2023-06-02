package Cards;

import java.util.ArrayList;
import java.util.Stack;

public class CardPile {
    private static ArrayList<Card> cardPile = new ArrayList<>();
    private static Stack<Card> trueCardPile = new Stack<>();




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

    public boolean isEmpty(){
        return trueCardPile.isEmpty();
    }

    public Stack<Card> getTrueCardPile(){
        return trueCardPile;
    }






}
