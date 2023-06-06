package Game;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import Cards.Card;
import Player.Player;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class gameJFrame extends JFrame implements ActionListener {
	private Container container = null;


	/**管理出牌、结束、弃牌、使用功能牌、放入银行5个按钮*/
	private JButton[] playerButton = new JButton[5];

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
	private ArrayList<Card> cardPile = new ArrayList<>();
	
	/**弃牌堆*/
	private ArrayList<Card> foldPile = new ArrayList<>();

	/**添加玩家*/
	private ArrayList<Player> playersArr = new ArrayList<>();
	
	/**对局记录*/
	private JTextArea recordArea = new JTextArea();
	
	public gameJFrame(){
		// 设置界面
		initJframe();
		// 初始化玩家
		initPlayer();
		// 添加组件
		initView();
		// 先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
		this.setVisible(true);
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
		
	}

	private void initPlayer() {
		// TODO Auto-generated method stub
		
	}
	
	private void initCard() {
		// TODO Auto-generated method stub
		
	}
	MonopolyStartScreen m=new MonopolyStartScreen();
	private void initJframe() {
		// TODO Auto-generated method stub
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
		
		playerScreen pS = new playerScreen(this);
		int playerNumber=OtherClass.selectedValue;
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
		
	}
	
	public static void main(String[] args) {
		new gameJFrame();
	}
}