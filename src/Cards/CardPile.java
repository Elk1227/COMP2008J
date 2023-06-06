package Cards;

import Game.gameJFrame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CardPile {
    private  ArrayList<Card> cardPile = new ArrayList<>();
    private  Stack<Card> trueCardPile = new Stack<>();

    private gameJFrame gameJFrame;

    private CardFactory factory;


    public CardPile(gameJFrame gameJFrame){
        this.gameJFrame = gameJFrame;
        this.initialPile();
        Collections.shuffle(cardPile);
        for (Card card : cardPile) {
            trueCardPile.push(card);
        }

    }

    public void  initialPile(){
        cardPile =  (ArrayList<Card>)factory.packaging();
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

    public boolean isEmpty(){
        return trueCardPile.isEmpty();
    }

    public Stack<Card> getTrueCardPile(){
        return trueCardPile;
    }


    public  ArrayList<Card> getCardPile() {
        return cardPile;
    }
}
