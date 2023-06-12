package Game;


import Cards.Card;
import Controller.CardController;
import Controller.GameController;
import Controller.PlayerController;
import Controller.ViewController;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Building.Building;

public class ViewBank implements ActionListener{

	JFrame frame;
	Container container;
	ViewController gameFrame;

	JPanel panel;
	JButton back;
	GameController gameController ;
	CardController cardController;

	public ViewBank(JFrame frame, Container container, ViewController gameFrame){
		this.frame = frame;
		this.container = container;
		this.gameFrame = gameFrame;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,frame.getWidth(),frame.getHeight());
		panel.setBackground(new Color(0, 134, 145, 100));

		back = new JButton("BACK");
		back.setBounds(450,0,100,50);
		back.addActionListener(this);
		panel.add(back);

		gameController = gameFrame.getGameController();
		cardController = new CardController(gameController);


		showBank(gameController.getPlayerController().getCurrentplayer().getBank().getCards());
		showRealEstate(gameController.getPlayerController().getCurrentplayer().getRealEstate().getBuildings());
		
		container.add(panel);
		frame.getLayeredPane().add(panel, Integer.MIN_VALUE);

	}

	public void showBank(List<Card> money){
		for (int i = 0; i < money.size(); i++){
			ImageIcon icon = new ImageIcon(money.get(i).getGraph());
			JLabel put_money = new JLabel(icon);
			put_money.setBounds(100*i,100, icon.getIconWidth(), icon.getIconHeight());
			put_money.setOpaque(true);
			panel.add(put_money);
		}
	}
	
	public void showRealEstate(ArrayList<Building> estate){
		for (int i = 0; i < estate.size(); i++){
			ImageIcon icon = new ImageIcon(estate.get(i).getBuilding().get(0).getGraph());
			JLabel put_building = new JLabel(icon);
			put_building.setBounds(100*i,300, icon.getIconWidth(), icon.getIconHeight());
			put_building.setOpaque(true);
			panel.add(put_building);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			panel.setVisible(false);
			gameFrame.getCheck().setEnabled(true);
			//gameFrame.viewFrame.getCheck_bank().setEnabled(true);
			container.remove(panel);
			//container.revalidate();
			container.repaint();
		}
	}


}
