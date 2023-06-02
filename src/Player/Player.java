package Player;

import Bank.Bank;
import Cards.Card;
import Cards.CardPile;
import HandCards.HandCards;
import RealEstate.RealEstate;

import java.util.ArrayList;

public class Player {
    private int id;
    private Bank bank;
    private  RealEstate realEstate;
    private HandCards handCards;


    public Player(int id) {
        this.id = id;
        this.bank = new Bank(id,this);
        this.realEstate = new RealEstate(this);
        this.handCards = new HandCards(this);
    }


    public void drawCard(CardPile cardPile){
        if (handCards.isEmpty()){
            for (Card card : cardPile.getCards(5)) {
                handCards.addCard(card);

            }

        }else {
            for (Card card : cardPile.getCards(2)) {
                handCards.addCard(card);
            }
        }
    }

    public void discard(){}

    public void playCard(){}
    public void payRent(){}
    public void buildPropertySet(){}
}
