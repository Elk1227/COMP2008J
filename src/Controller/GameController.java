package Controller;


import javax.swing.*;

import  Model.Cards.Card;
import  Model.Cards.CardPile;
import Model.*;
import  Model.Player.Player;
import View.MonopolyStartScreenView;
import View.ViewFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class GameController  {
	static MonopolyModel model=new MonopolyModel();
	static MonopolyStartScreenView view =new MonopolyStartScreenView(model);


	
	private JButton[] playerButton = new JButton[5];
	public JButton check_bank;
	public ViewFrame viewFrame;
	//Judge whose turn
	private int turn = 0;

	ArrayList<ArrayList<Card>> currentList = new ArrayList<>();


	public ArrayList<ArrayList<Card>> playerList = new ArrayList<>();

	//card pill, hold all the cards
	private CardPile cardPile;

	//Discard pile
	private ArrayList<Card> foldPile = new ArrayList<>();

	//Add player
	private ArrayList<Player> playersArr = new ArrayList<>();

	private JTextArea recordArea = new JTextArea();
	private CardController cardController;

	private PlayerController playerController;

	private ViewController viewController;

	private  int playerNumber;

	public GameController(){
		playerNumber = MonopolyModel.selectedValue;


		viewController = new ViewController();
		// Set the panel
		// Initialize the player
		playerController = new PlayerController(this);
		// Prepare cards, shuffle cards, deal cards
		// Preparation before playing cards

		cardController = new CardController(this);
		cardPile = cardController.getCardPile();
		new  Thread(cardController::initCard).start();
		initGame();

	}

	public void initGame() {
		// TODO Auto-generated method stub

	}


	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public void setPlayersArr(ArrayList playersArr) {
		this.playersArr = playersArr;

	}

	public PlayerController getPlayerController() {
		return playerController;
	}

	public void setPlayerController(PlayerController playerController) {
		this.playerController = playerController;
	}

public ArrayList<Player> getPlayersArr() {
	return playersArr;
}

	public ViewController getViewController() {
		return viewController;
	}

	public void setViewController(ViewController viewController) {
		this.viewController = viewController;
	}

	public CardController getCardController() {
		return cardController;
	}

	public void setCardController(CardController cardController) {
		this.cardController = cardController;
	}

	public void updateHandCard() throws IOException {
		Player player= playerController.getCurrentplayer();
		ArrayList<Card> handCard1 = player.getHandCards().getHandcards();
		for (int j = 0; j < handCard1.size(); j++) {
			viewController.remove(handCard1.get(j));
			viewController.revalidate();
			viewController.repaint();
		}
		playerController.changeTONextPlayer();
		Player playerCurrent =   playerController.getCurrentplayer();

		ArrayList<Card> handCards = playerCurrent.getHandCards().getHandcards();
		for (int i = 0; i < handCards.size(); i++) {
			//handCards.get(i).setIcon(new ImageIcon(handCards.get(i).getGraph()));
			handCards.get(i).setVisible(true);
			viewController.add(handCards.get(i));


		}
		viewController.repaint();
		viewController.revalidate();
		playerCurrent.setTime(3);
		int index =  handCards.size();
		ArrayList<Card> cards = playerCurrent.drawCard(cardPile);

		for (Card card : cards) {
			card.setOwner(playerCurrent);
			Point point = new Point(handCards.get(index-1).getLocation().x+card.getWidth(),handCards.get(index-1).getLocation().y);
			cardController.moveCard(card,point);
			card.setLocation(point);
			card.turnFront();
			index++;

		}
		Player player1 =  playerController.getCurrentplayer();

        if(player1.getHandCards().isFull()){
			viewController.add_house.setVisible(false);
			viewController.add_to_bank.setVisible(false);
			viewController.use_function.setVisible(false);
			viewController.finish_output.setVisible(false);
		}

	}
	public boolean checkDeadHeat(){
		if(cardPile.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}