package Model.Cards.ActionCard;

import java.awt.event.MouseEvent;

import Controller.GameController;
import Model.Cards.CardPrice;
import Model.Player.Player;

public class DebtCollectorCard extends ActionCard{

	public DebtCollectorCard() {
		super("Debt Collector", CardPrice.M3,"resources/action cards/DEBT COLLECTOR.jpg" );
		
	}




	public CardPrice DebtCollector(Player player){
		return CardPrice.M5;
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
