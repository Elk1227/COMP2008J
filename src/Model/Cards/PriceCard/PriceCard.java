package Model.Cards.PriceCard;

import Model.Cards.Card;
import Model.Cards.CardPrice;

import java.awt.event.MouseEvent;

public  class PriceCard extends Card {

    public String name;
    public CardPrice price;
    public PriceCard(String name, CardPrice price,String graph) {
        super(name, price,graph);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

