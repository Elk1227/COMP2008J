package Controller;


import  Model.Cards.Card;
import  Model.Cards.CardPile;
import Model.*;
import Model. Player.Player;
import View.MonopolyStartScreenView;
import View.ViewBank;
import View.ViewFrame;
import View.playerScreen;
import View.EndView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;
import Model.Cards.ActionCard.*;
public class ViewController extends JFrame implements ActionListener {
	private Container container = null;
	static MonopolyModel model=new MonopolyModel();
	static MonopolyStartScreenView view =new MonopolyStartScreenView(model);


	public JButton check_bank;
	public ViewFrame viewFrame;
	
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
	JButton button3 ;
	JButton button4 ;
	JButton button5 ;
	ArrayList<JButton> buttons= new ArrayList<>();


	public ViewController()  {
		playerNumber = MonopolyModel.selectedValue;

		// set the panel
		initJframe();
		
		initView();
		
		this.setVisible(true);
	}

	public void setGameController(GameController gameController){
		this.gameController  = gameController;
	}


	private void initView() {
		int i=playerNumber-2;
// TODO Auto-generated method stub
		check = new JButton("VIEW");
		check.setBounds(30, 670-i*30, 80, 40);
		check.setFocusable(false);
		check.addActionListener(this);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(check, JLayeredPane.PALETTE_LAYER);

//add to bank

		add_to_bank = new JButton("AS MONEY");
		add_to_bank.setBounds(30,420-i*30,80,40);
		add_to_bank.setFocusable(false);
		add_to_bank.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().moveToBank();
			}
		});
		layeredPane.add(add_to_bank, JLayeredPane.PALETTE_LAYER);
		use_function = new JButton("USE FUNCTION");
		use_function.setBounds(30,470-i*30,80,40);
		use_function.setFocusable(false);
		use_function.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().moveToFoldPile();
			}
		});
		layeredPane.add(use_function, JLayeredPane.PALETTE_LAYER);
		add_house = new JButton("ADD HOUSE");
		add_house.setBounds(30,520-i*30,80,40);
		add_house.setFocusable(false);
		add_house.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				gameController.getCardController().buildRealEstate();

			}
		});
		layeredPane.add(add_house, JLayeredPane.PALETTE_LAYER);
		finish_output = new JButton("END");
		finish_output.setBounds(30,570-i*30,80,40);
		finish_output.setFocusable(false);
		finish_output.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				PlayerController playerController=new PlayerController(gameController);
				try {
					gameController.updateHandCard();
					end();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		layeredPane.add(finish_output, JLayeredPane.PALETTE_LAYER);

		give_up = new JButton("GIVE UP");
		give_up.setBounds(30,620-i*30,80,40);
		give_up.setFocusable(false);
		give_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().discard();

			}
		});
		layeredPane.add(give_up, JLayeredPane.PALETTE_LAYER);

		button1= new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button1.setBounds(130,600,40,20);
		button2.setBounds(130,520,40,20);
		button3.setBounds(130,550,40,20);
		button4.setBounds(130,630,40,20);
		button5.setBounds(130,660,40,20);
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);


		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		button5.setVisible(false);


		container.add(layeredPane);
		container.add(check);
		container.add(add_to_bank);
		container.add(use_function);
		container.add(add_house);
		container.add(finish_output);
		container.add(give_up);
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		container.add(button5);
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);


		button1.addActionListener(new ActionListener() {
										  @Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().setColor(button1.getBackground());


			}
		});

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().setColor(button2.getBackground());


			}
		});

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().setColor(button3.getBackground());


			}
		});

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().setColor(button4.getBackground());


			}
		});

		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameController.getCardController().setColor(button5.getBackground());


			}
		});

	}



	private void initJframe() {
		// TODO Auto-generated method stub
		container= this.getContentPane();
		container.setLayout(null);
		this.setVisible(true);

		// set the title
		this.setTitle("Monopoly Deal Cards");
		// set the size
		this.setSize(1024, 768);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setResizable(false);
		
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
			dispose();
			//The Start window is closed
			beginPlay();


		}
	}
	public void end(){
		if(gameController.checkDeadHeat()){
			dispose();
			EndView endFrame=new EndView();
		}else if(!gameController.checkDeadHeat()){
			System.out.println("ok");
		}
	}



	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}


	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}



}