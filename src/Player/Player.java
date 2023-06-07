package Player;

import Bank.Bank;
import Cards.ActionCard.ActionCard;
import Cards.Card;
import Cards.CardPile;
import Cards.Properties.PropertyCard;
import HandCards.HandCards;
import RealEstate.RealEstate;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Properties;

public class Player {
    private int id;
    private Bank bank;
    private  RealEstate realEstate;
    private HandCards handCards;

    playerField feild;



    public class playerField extends JPanel {



    }


    public Player(int id) {
        this.id = id;
        this.bank = new Bank(id,this);
        this.realEstate = new RealEstate(this);
        this.handCards = new HandCards(this);
    }


    public ArrayList<Card> drawCard(CardPile cardPile){
        ArrayList<Card> cards = new ArrayList<>();
        if (handCards.isEmpty()){
            for (Card card : cardPile.getCards(5)) {
                handCards.addCard(card);
                cards.add(card);


            }

        }else {
            for (Card card : cardPile.getCards(2)) {
                handCards.addCard(card);
                cards.add(card);
            }
        }
        return cards;
    }

    public void discard(Card card){
        while (handCards.isFull()){
            handCards.removeCard(card);
        }
    }
    public void selectColor(){}
    public void storedInBank(Card card){
        bank.addCard(card);
    }
    public void playCard(ActionCard card){
        card.function();
        //添加到弃牌堆


    }
    public void payRent(){}
    public void buildPropertySet(PropertyCard card){
        realEstate.addRealEstate(card);
    }


    public int getId() {
        return id;
    }

    public Bank getBank() {
        return bank;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public HandCards getHandCards() {
        return handCards;
    }
}
