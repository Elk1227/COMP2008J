package Model.Cards.ActionCard;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Controller.GameController;
import Model.Cards.Card;
import Model.Cards.CardPile;
import Model.Cards.CardPrice;
import Model.Player.Player;
import View.changeImageSize;
import Controller.ViewController;

public class PassGoCard extends ActionCard {
	private ViewController viewController;
	public PassGoCard() {
		super("Pass Go",CardPrice.M1,"resources/action cards/PASS_GO.jpg");
		
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
	 private CardPile cardPile = new CardPile();
	
	@Override
	public void function(GameController controller) {
		Player player1 = controller.playerController.getCurrentplayer();
		if (!cardPile.isEmpty()) {
			ArrayList<Card> cards = cardPile.getCards(2);
			player1.getHandCards().getHandcards().addAll(cards);
			for (int i = 0; i < cards.size(); i++) {
				Card card = cards.get(i);
				card.setOwner(player1);
				card.setLocation(new Point(180 + i * 100, 500));
				try {
					controller.getCardController().turnFront(card);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

		}
	}
}
