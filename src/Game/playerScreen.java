package Game;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

import Game.changeImageSize;

public class playerScreen {
	
	JFrame frame;
	Container container;
	public playerScreen(JFrame frame) {
		this.frame = frame;
	}
	
	public void two_player() {
		container = frame.getContentPane();
		container.setLayout(null);
		
		ImageIcon pile = new ImageIcon("resources/action cards/images.jpg");
		JLabel draw_pile = new JLabel(pile);
		//changeImageSize changeSize = new changeImageSize();
		/*try {
			changeSize.changeSize("resources/action cards/images.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		draw_pile.setBounds(40, 70, pile.getIconWidth(), pile.getIconHeight());
		draw_pile.setOpaque(true);
		
		
		JTextField drawPile = new JTextField();
		drawPile.setBounds(40,40,70,20);
		drawPile.setText("draw pile");
		drawPile.setFont(new Font("Arial", Font.PLAIN, 15));
		drawPile.setEditable(false);
		
		JTextField playerPile = new JTextField();
		playerPile.setBounds(40, 280, 80, 20);
		playerPile.setText("player pile");
		playerPile.setFont(new Font("Arial", Font.PLAIN, 15));
		playerPile.setEditable(false);
		
		JLabel action_pile = new JLabel();
		action_pile.setBounds(40, 310, pile.getIconWidth(), pile.getIconHeight());
		action_pile.setBackground(Color.gray);
		action_pile.setOpaque(true);
		
		
		JTextField player1 = new JTextField();
		player1.setBounds(0,0,60,20);
		player1.setText("player 1");
		player1.setFont(new Font("Arial", Font.PLAIN, 15));
		player1.setEditable(false);
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JLabel p1 = new JLabel();
		p1.setBounds(180, 70, 800, 200);
		p1.setBorder(blackline);
		p1.add(player1);
		p1.setOpaque(true);
		
		JTextField player2 = new JTextField();
		player2.setBounds(0,0,60,20);
		player2.setText("player 2");
		player2.setFont(new Font("Arial", Font.PLAIN, 15));
		player2.setEditable(false);
		
		JLabel p2 = new JLabel();
		p2.setBounds(180, 280, 800, 200);
		p2.setBorder(blackline);
		p2.add(player2);
		p2.setOpaque(true);
		
		container.add(draw_pile);
		container.add(drawPile);
		container.add(playerPile);
		container.add(action_pile);
		container.add(p1);
		container.add(p2);
	}
	
	
	public void three_player(){
		
	}
	
	
	public void four_player(){
		
	}
	
	
	public void five_player(){
		
	}
}
