package Cards.ActionCard;

import Cards.CardColor;
import Cards.CardPrice;

public class RentCard extends ActionCard{
    private CardColor color;
    private CardColor color1;
    private CardColor color2;
    
    public RentCard(String name, CardPrice price, CardColor color1, CardColor color2) {
        super(name, price);
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
	 
	@Override
	public void function() {
		
		
	}
	public CardColor getColorOne() {
		return color1;
	}

	public CardColor getColorTwo() {
		return color2;
	}

}
