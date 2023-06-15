package DemoTests;

import  Model.Bank.Bank;
import  Model.Cards.ActionCard.*;
import  Model.Cards.Card;
import  Model.Cards.CardPrice;
import  Model.Player.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BankTest {
    private Bank bank;
    private Card card1;
    private Card card2;
    private Card card3;

    @Before
    public void setup() {
        bank = new Bank(1, new Player(1));
        card1 = new DebtCollectorCard();
        card2 = new DealBreakerCard();
        card3 = new ItIsMyBirthdayCard();
        bank.addCard(card1);
        bank.addCard(card2);
        bank.addCard(card3);
    }

    @Test
    public void addCardTest() {
        Card card4 = new SlyDealCard();
        bank.addCard(card4);
        Assert.assertEquals(4, bank.getBankSize());
        Assert.assertTrue(bank.hasCard(card4));
        System.out.println("Successful test");
    }

    @Test
    public void removeCardTest() {
        bank.removeCard(card2);
        Assert.assertEquals(2, bank.getBankSize());
        Assert.assertFalse(bank.hasCard(card2));
        System.out.println("Successful test");
    }

    @Test
    public void hasCardTest() {
        Assert.assertTrue(bank.hasCard(card1));
        Assert.assertFalse(bank.hasCard(new PassGoCard()));
        System.out.println("Successful test");
    }

    @Test
    public void transferCardTest() {
        List<Card> cardsToTransfer = new ArrayList<>();
        cardsToTransfer.add(card1);
        cardsToTransfer.add(card2);
        cardsToTransfer.add(card3);
        List<CardPrice> transferredPrices = bank.transferCard(cardsToTransfer);
        Assert.assertEquals(3, transferredPrices.size());
        Assert.assertEquals(3, transferredPrices.get(0).getPrice());
        Assert.assertEquals(5, transferredPrices.get(1).getPrice());
        Assert.assertEquals(2, transferredPrices.get(2).getPrice());
        System.out.println("Successful test");
    }

    @Test
    public void isEmptyTest() {
        Assert.assertFalse(bank.isEmpty());
        bank.removeCard(card1);
        bank.removeCard(card2);
        bank.removeCard(card3);
        Assert.assertTrue(bank.isEmpty());
        System.out.println("Successful test");
    }

    @Test
    public void calculatePriceTest() {
        Assert.assertEquals(10, bank.calculatePrice(600));
        System.out.println("Successful test");

    }
}
