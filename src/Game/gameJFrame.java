package Game;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

import Cards.Card;
import Cards.CardPile;
import Player.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class gameJFrame extends JFrame implements ActionListener {
	private Container container = null;


	/**管理出牌、结束、弃牌、使用功能牌、放入银行5个按钮*/
	private JButton[] playerButton = new JButton[5];
	public JButton check_bank;
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

	int playerNumber;

	public gameJFrame(){
		playerNumber = OtherClass.selectedValue;


		// 设置界面
		initJframe();
		// 初始化玩家
		initPlayer();
		// 添加组件
		initView();
		// 先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
		this.setVisible(true);
		cardPile = new CardPile(this);
		// 准备牌，洗牌，发牌
		new Thread(this::initCard).start();
		// 打牌之前的准备工作
		initGame();

	}

	private void initGame() {
		// TODO Auto-generated method stub

	}

	private void initView() {
		// TODO Auto-generated method stub
		check_bank = new JButton("BANK");
		check_bank.setBounds(30, 500, 100, 50);
		check_bank.setFocusable(false);
		check_bank.addActionListener(this);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(check_bank, JLayeredPane.PALETTE_LAYER);

		container.add(layeredPane);
		container.add(check_bank);
	}

	private void initPlayer() {
		if(playerNumber==2) {
			Player player1 = new Player(1);
			Player player2 = new Player(2);
			playersArr.add(player1);
			playersArr.add(player2);
		}else if(playerNumber==3) {
			Player player1 = new Player(1);
			Player player2 = new Player(2);
			Player player3 = new Player(3);
			playersArr.add(player1);
			playersArr.add(player2);
			playersArr.add(player3);


		}else if(playerNumber==4) {
			Player player1 = new Player(1);
			Player player2 = new Player(2);
			Player player3 = new Player(3);
			Player player4 = new Player(4);
			playersArr.add(player1);
			playersArr.add(player2);
			playersArr.add(player3);
			playersArr.add(player4);
		}else{
			Player player1 = new Player(1);
			Player player2 = new Player(2);
			Player player3 = new Player(3);
			Player player4 = new Player(4);
			Player player5 = new Player(5);
			playersArr.add(player1);
			playersArr.add(player2);
			playersArr.add(player3);
			playersArr.add(player4);
			playersArr.add(player5);
		}
	}

	private void initCard() {
		for (Card card : cardPile.getCardPile()) {
			this.setCardLocation(card);
		}

		if(playersArr.size() == 2){
			Player player1 =  playersArr.get(0);
			ArrayList<Card> cards = player1.drawCard(cardPile);
			for (int i = 0; i<cards.size(); i++) {
				Card card = cards.get(i);
				Common.move(card , card.getLocation(),new Point(180+i*40,300));
			}




		}
	}

	MonopolyStartScreen m =new MonopolyStartScreen();

	private void initJframe() {
		// TODO Auto-generated method stub
		container= this.getContentPane();
		container.setLayout(null);
		this.setVisible(true);

		// 设置标题
		this.setTitle("Monopoly Deal Cards");
		// 设置大小
		this.setSize(1024, 768);
		// 设置关闭模式
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口无法进行调节
		this.setResizable(false);
		// 界面居中
		this.setLocationRelativeTo(null);

		playerScreen pS = new playerScreen(this, container);
		System.out.println(playerNumber);
		if(playerNumber==2) {
			pS.two_player();
		}else if(playerNumber==3) {
			pS.three_player();
		}else if(playerNumber==4) {
			pS.four_player();
		}else{
			pS.five_player();

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==check_bank) {
			new ViewBank(this, container, this);
		}
		check_bank.setEnabled(false);
	}


	public void setCardLocation(Card card) {
		if(playersArr.size()==2){

			card.setLocation(40, 70);
			container.add(card);
			container.setComponentZOrder(card, 0);
			card.setVisible(true);
		}else if(playersArr.size()==3){
			card.setLocation(40, 70);
			container.add(card);
			container.setComponentZOrder(card, 0);

		}else if(playersArr.size()==4){
			card.setLocation(40, 70);
			container.add(card);
			container.setComponentZOrder(card, 0);

		}else {
			card.setLocation(40, 70);
			container.add(card);
			container.setComponentZOrder(card, 0);

		}

	}

	public ArrayList<Player> getPlayersArr() {
		return playersArr;
	}

	public void setPlayersArr(ArrayList<Player> playersArr) {
		this.playersArr = playersArr;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}
}