package Controller;


import javax.swing.*;

import Cards.Card;
import Cards.CardPile;
import Game.*;
import Player.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class GameController  {
	static MonopolyModel model=new MonopolyModel();
	static MonopolyStartScreenView view =new MonopolyStartScreenView(model);


	/**管理出牌、结束、弃牌、使用功能牌、放入银行5个按钮*/
	private JButton[] playerButton = new JButton[5];
	public JButton check_bank;
	public ViewFrame viewFrame;
	/**判断谁的回合*/
	private int turn = 0;

	ArrayList<ArrayList<Card>> currentList = new ArrayList<>();

	/**集合嵌套集合
	 大集合中有两个小集合
	 小集合中装着每一个玩家的牌
	 0：自己
	 1：对手*/
	public ArrayList<ArrayList<Card>> playerList = new ArrayList<>();

	/**牌堆，装所有的牌*/
	private CardPile cardPile;

	/**弃牌堆*/
	private ArrayList<Card> foldPile = new ArrayList<>();

	/**添加玩家*/
	private ArrayList<Player> playersArr = new ArrayList<>();

	/**对局记录*/
	private JTextArea recordArea = new JTextArea();
	private CardController cardController;

	private PlayerController playerController;

	private ViewController viewController;

	private  int playerNumber;

	public GameController(){
		playerNumber = MonopolyModel.selectedValue;


		viewController = new ViewController();
		// 设置界面
		// 初始化玩家
		playerController = new PlayerController(this);
		// 添加组件
//		initView();
		// 先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示


		// 准备牌，洗牌，发牌
		// 打牌之前的准备工作

		cardController = new CardController(this);
		cardPile = cardController.getCardPile();
		new  Thread(cardController::initCard).start();
		initGame();

	}

	private void initGame() {
		// TODO Auto-generated method stub

	}

//	private void initView() {
//		// TODO Auto-generated method stub
//		check_bank = new JButton("BANK");
//		check_bank.setBounds(30, 500, 100, 50);
//		check_bank.setFocusable(false);
//		check_bank.addActionListener(this);
//
//		JLayeredPane layeredPane = new JLayeredPane();
//		layeredPane.add(check_bank, JLayeredPane.PALETTE_LAYER);
//
//		container.add(layeredPane);
//		container.add(check_bank);
//	}

//	private void initPlayer() {
//		if(playerNumber==2) {
//			Player player1 = new Player(1);
//			Player player2 = new Player(2);
//			playersArr.add(player1);
//			playersArr.add(player2);
//		}else if(playerNumber==3) {
//			Player player1 = new Player(1);
//			Player player2 = new Player(2);
//			Player player3 = new Player(3);
//			playersArr.add(player1);
//			playersArr.add(player2);
//			playersArr.add(player3);
//
//
//		}else if(playerNumber==4) {
//			Player player1 = new Player(1);
//			Player player2 = new Player(2);
//			Player player3 = new Player(3);
//			Player player4 = new Player(4);
//			playersArr.add(player1);
//			playersArr.add(player2);
//			playersArr.add(player3);
//			playersArr.add(player4);
//		}else{
//			Player player1 = new Player(1);
//			Player player2 = new Player(2);
//			Player player3 = new Player(3);
//			Player player4 = new Player(4);
//			Player player5 = new Player(5);
//			playersArr.add(player1);
//			playersArr.add(player2);
//			playersArr.add(player3);
//			playersArr.add(player4);
//			playersArr.add(player5);
//		}
//	}

//	private void initCard() {
//		for (Card card : cardPile.getCardPile()) {
//			this.setCardLocation(card);
//		}
//
//		if(playersArr.size() == 2){
//			Player player1 =  playersArr.get(0);
//			ArrayList<Card> cards = player1.drawCard(cardPile);
//			for (int i = 0; i<cards.size(); i++) {
//				Card card = cards.get(i);
//				Common.move(card , card.getLocation(),new Point(180+i*100,500));
//
//				try {
//					card.turnFront();
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//			}
//
//		}
//
//		if(playersArr.size() == 3){
//			Player player1 =  playersArr.get(0);
//			ArrayList<Card> cards = player1.drawCard(cardPile);
//			for (int i = 0; i<cards.size(); i++) {
//				Card card = cards.get(i);
//				Common.move(card , card.getLocation(),new Point(180+i*100,550));
//
//				try {
//					card.turnFront();
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//			}
//
//		}
//		if(playersArr.size() == 4){
//			Player player1 =  playersArr.get(0);
//			ArrayList<Card> cards = player1.drawCard(cardPile);
//			for (int i = 0; i<cards.size(); i++) {
//				Card card = cards.get(i);
//				Common.move(card , card.getLocation(),new Point(150+i*100,635));
//
//				try {
//					card.turnFront();
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//			}
//
//		}
//		if(playersArr.size() == 5){
//			Player player1 =  playersArr.get(0);
//			ArrayList<Card> cards = player1.drawCard(cardPile);
//			for (int i = 0; i<cards.size(); i++) {
//				Card card = cards.get(i);
//				Common.move(card , card.getLocation(),new Point(150+i*100,645));
//
//				try {
//					card.turnFront();
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//			}
//
//		}
//
//
//	}


//	private void initJframe() {
//		// TODO Auto-generated method stub
//		container= this.getContentPane();
//		container.setLayout(null);
//		this.setVisible(true);
//
//		// 设置标题
//		this.setTitle("Monopoly Deal Cards");
//		// 设置大小
//		this.setSize(1024, 768);
//		// 设置关闭模式
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		// 设置窗口无法进行调节
//		this.setResizable(false);
//		// 界面居中
//		this.setLocationRelativeTo(null);
//
//		playerScreen pS = new playerScreen(this, container);
//		System.out.println(playerNumber);
//		if(playerNumber==2) {
//			pS.two_player();
//		}else if(playerNumber==3) {
//			pS.three_player();
//		}else if(playerNumber==4) {
//			pS.four_player();
//		}else{
//			pS.five_player();
//
//		}
//	}



//	public void setCardLocation(Card card) {
//		if(playersArr.size()==2){
//
//			card.setLocation(40, 70);
//			container.add(card);
//			container.setComponentZOrder(card, 0);
//			card.setVisible(true);
//		}else if(playersArr.size()==3){
//			card.setLocation(40, 70);
//			container.add(card);
//			container.setComponentZOrder(card, 0);
//
//		}else if(playersArr.size()==4){
//			card.setLocation(40, 70);
//			container.add(card);
//			container.setComponentZOrder(card, 0);
//
//		}else {
//			card.setLocation(40, 70);
//			container.add(card);
//			container.setComponentZOrder(card, 0);
//
//		}
//
//	}
//	public static void initialize() {
//		view.setVisible(true);
//	}
//	public ArrayList<Player> getPlayersArr() {
//		return playersArr;
//	}
//
//
//	public Container getContainer() {
//		return container;
//	}
//
//	public void setContainer(Container container) {
//		this.container = container;
//	}
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				Locale.setDefault(Locale.ENGLISH);
//				MonopolyModel model = new MonopolyModel();
//				MonopolyStartScreenView view = new MonopolyStartScreenView(model);
//
//				initialize();
//			}
//		});
//	}
//
//	public static void beginPlay() {
//		GameController gameFrame = new GameController();
//		view.setVisible(false);
//	}
//
//	public void start(JComboBox<Integer> memberComboBox){
//		if (model.getAgeList().size() == 0 ) {
//			JOptionPane.showMessageDialog(null, "Please add player age first!");
//		} else if (model.getAgeList().size() != (int) memberComboBox.getSelectedItem()){
//			model.getAgeList().clear();
//			JOptionPane.showMessageDialog(null, "Incorrect number of entered age, please re-enter from Player 1");
//		}else {
//			dispose(); //The Start window is closed
//			beginPlay();
//
//
//		}
//	}
//		int selectedMembers = (int) memberComboBox.getSelectedItem();
//		if (model.isAgeListComplete(selectedMembers)&&model.isInputMember(selectedMembers)) {
//			dispose(); //The Start window is closed
//			beginPlay();
//		} else {
//			JOptionPane.showMessageDialog(null, "Please add player age first!");
//		}
//		System.out.println(selectedMembers);
//	}


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

//	public Container getContainer() {
//		return container;
//	}
//
//	public void setContainer(Container container) {
//		this.container = container;
//	}
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


	}
}