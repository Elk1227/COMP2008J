package Controller;


import Cards.Card;
import Cards.CardPile;
import Game.*;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;

public class ViewController extends JFrame implements ActionListener {
	private Container container = null;
	static MonopolyModel model=new MonopolyModel();
	static MonopolyStartScreenView view =new MonopolyStartScreenView(model);


	public JButton check_bank;
	public ViewFrame viewFrame;
	/**判断谁的回合*/
	private int turn = 0;


	 private  int playerNumber;

	JButton check;
	JButton add_to_bank;
	JButton use_function;

	JButton add_house;

	JButton finish_output;
	JButton give_up;

	GameController gameController;

	JButton button1;
	JButton button2 ;






	public ViewController()  {
		playerNumber = MonopolyModel.selectedValue;

		// 设置界面
		initJframe();
		// 初始化玩家\
		// 添加组件
		initView();
		// 先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
		this.setVisible(true);
		// 准备牌，洗牌，发牌
		// 打牌之前的准备工作


	}

	public void setGameController(GameController gameController){
		this.gameController  = gameController;
	}





	private void initView() {
		int i=playerNumber-2;
// TODO Auto-generated method stub
		check = new JButton("VIEW");
		check.setBounds(30, 640-i*30, 80, 40);
		check.setFocusable(false);
		check.addActionListener(this);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(check, JLayeredPane.PALETTE_LAYER);

//add to bank

		add_to_bank = new JButton("AS MONEY");
		add_to_bank.setBounds(30,390-i*30,80,40);
		add_to_bank.setFocusable(false);
		add_to_bank.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().moveToBank();
			}
		});
		layeredPane.add(add_to_bank, JLayeredPane.PALETTE_LAYER);
		use_function = new JButton("USE FUNCTION");
		use_function.setBounds(30,440-i*30,80,40);
		use_function.setFocusable(false);
		use_function.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		layeredPane.add(use_function, JLayeredPane.PALETTE_LAYER);
		add_house = new JButton("ADD HOUSE");
		add_house.setBounds(30,490-i*30,80,40);
		add_house.setFocusable(false);
		add_house.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				gameController.getCardController().buildRealEstate1();

			}
		});
		layeredPane.add(add_house, JLayeredPane.PALETTE_LAYER);
		finish_output = new JButton("END");
		finish_output.setBounds(30,540-i*30,80,40);
		finish_output.setFocusable(false);
		finish_output.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayerController playerController=new PlayerController(gameController);
				try {
					gameController.updateHandCard();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		layeredPane.add(finish_output, JLayeredPane.PALETTE_LAYER);

		give_up = new JButton("GIVE UP");
		give_up.setBounds(30,590-i*30,80,40);
		give_up.setFocusable(false);
		give_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().discard();

			}
		});
		layeredPane.add(give_up, JLayeredPane.PALETTE_LAYER);

		button1=new JButton();
		button2 = new JButton();
		button1.setBounds(30,600,40,20);
		button2.setBounds(160,520,40,20);
		button1.setFocusable(false);
		button2.setFocusable(false);
		button2.setBackground(new Color(255,0,0,255));
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		button1.setBackground(new Color(0,255,0,255));
		button1.setVisible(false);
		button2.setVisible(false);


		container.add(layeredPane);
		container.add(check);
		container.add(add_to_bank);
		container.add(use_function);
		container.add(add_house);
		container.add(finish_output);
		container.add(give_up);
		container.add(button1);
		container.add(button2);

	}


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

	public JButton getCheck() {
		return check;
	}
	public GameController getGameController() {
		return gameController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==check) {
			new ViewBank(this, container, this);
		}
		check.setEnabled(false);
	}



	public static void initialize() {
		view.setVisible(true);
	}


	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Locale.setDefault(Locale.ENGLISH);
				MonopolyModel model = new MonopolyModel();
				MonopolyStartScreenView view = new MonopolyStartScreenView(model);

				initialize();
			}
		});
	}

	public static void beginPlay() {
		GameController gameFrame = new GameController();
		view.setVisible(false);
	}

	public void start(JComboBox<Integer> memberComboBox){
		if (model.getAgeList().size() == 0 ) {
			JOptionPane.showMessageDialog(null, "Please add player age first!");
			dispose();
		} else if (model.getAgeList().size() != (int) memberComboBox.getSelectedItem()){
			model.getAgeList().clear();
			JOptionPane.showMessageDialog(null, "Incorrect number of entered age, please re-enter from Player 1");
		}else {
			dispose(); //The Start window is closed
			beginPlay();


		}
	}
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



}