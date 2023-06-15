package Model.Cards.ActionCard;

import Controller.GameController;
import Model.Cards.CardPrice;
import Model.Player.Player;
import Model.RealEstate.RealEstate;

import java.awt.event.MouseEvent;

public class DealBreakerCard extends ActionCard {

	public DealBreakerCard() {
		super("Deal Breaker",CardPrice.M5,"resources/action cards/DEAL BREAKER.jpg");
		}


	public void DealBreaker(Player player){
		RealEstate realEstate =  player.getRealEstate();
		///realEstate.removeBuilding(building);
		//player.getRealEstate().addBuilding();

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

	@Override
	public void function(GameController controller) {

	}
}
