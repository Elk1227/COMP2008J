package Cards;

import Game.changeImageSize;
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
        factory = new CardFactory();
        this.initialPile();
        Collections.shuffle(cardPile);
        for (Card card : cardPile) {

            trueCardPile.push(card);
        }


    }

    public void  initialPile(){
        cardPile =  (ArrayList<Card>)factory.packaging();
        for (Card card : cardPile) {
            card.setGameJFrame(gameJFrame);
            card.setUp(false);
            card.turnRear();
            if(card.getGameJFrame().getPlayersArr().size()==2){

                card.setSize(90,150);

            } else if (card.getGameJFrame().getPlayersArr().size()==3) {
                card.setSize(60,100);

            } else if (card.getGameJFrame().getPlayersArr().size()==4) {
                card.setSize(54,90);

            }else {
                card.setSize(48,80);
            }
            card.setVisible(true);
        }

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

    public void setCardPile(ArrayList<Card> cardPile) {
        this.cardPile = cardPile;
    }

    public void setTrueCardPile(Stack<Card> trueCardPile) {
        this.trueCardPile = trueCardPile;
    }

    public Game.gameJFrame getGameJFrame() {
        return gameJFrame;
    }

    public void setGameJFrame(Game.gameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    public CardFactory getFactory() {
        return factory;
    }

    public void setFactory(CardFactory factory) {
        this.factory = factory;
    }

    public  ArrayList<Card> getCardPile() {
        return cardPile;
    }
}
