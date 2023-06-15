package Model.Cards.ActionCard;

import java.awt.event.MouseEvent;

import Controller.GameController;
import Model.Building.Building;
import Model.Cards.CardPrice;
import Model.Player.Player;

public class HotelCard extends ActionCard{

	public HotelCard() {
		super("Hotel",CardPrice.M4,"resources/action cards/Hotel.jpg");


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
		Player player =  this.getOwner();
		int i = 0;
		for (Building building : player.getRealEstate().getBuildings()) {
			if (building.isFull()){
				controller.getViewController().getButtons().get(i).setBackground(building.getColorOfBuilding().getColor());
				controller.getViewController().getButtons().get(i).setVisible(true);



			}

		}
	}
}
