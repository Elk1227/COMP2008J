package Model.Cards.ActionCard;

import java.awt.event.MouseEvent;

import Controller.GameController;
import Model.Cards.CardColor;
import Model.Cards.CardPrice;

public class RentCard extends ActionCard{
    private CardColor color;
    private CardColor color1;
    private CardColor color2;
    public RentCard(String name, CardPrice price, CardColor color1, String graph) {
        super(name, price,graph);
        this.color1 = color1;
  
    }
	
    public RentCard(String name, CardPrice price, CardColor color1, CardColor color2,String graph) {
        super(name, price,graph);
        this.color1 = color1;
        this.color2 = color2;
    }
	
	public void choseColor(){
		
	}
	
	 public void ChangeColor(){
	    }
	 
	 public CardColor getColor() {
	        return color;
	    }
	 

	public CardColor getColorOne() {
		return color1;
	}

	public CardColor getColorTwo() {
		return color2;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function(GameController controller) {

	}
}
