package Game;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

import Game.changeImageSize;

public class playerScreen {
	
	JFrame frame;
	Container container;
	public playerScreen(JFrame frame, Container container) {
		this.frame = frame;
		this.container = container;
	}
	
	public void two_player() {
		changeImageSize changeSize = new changeImageSize();
		try {
			changeSize.changeSize("resources/action cards/images.jpg", 60, 100);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon pile = new ImageIcon("resources/action cards/images.jpg");
		JLabel draw_pile = new JLabel();
		draw_pile.setBounds(40, 70, pile.getIconWidth(), pile.getIconHeight());
		draw_pile.setBackground(Color.gray);
		draw_pile.setOpaque(false);
		
		
		JTextField drawPile = new JTextField();
		drawPile.setBounds(40,40,70,20);
		drawPile.setText("draw pile");
		drawPile.setFont(new Font("Arial", Font.PLAIN, 15));
		drawPile.setEditable(false);
		
		JTextField playerPile = new JTextField();
		playerPile.setBounds(40, 230, 80, 20);
		playerPile.setText("player pile");
		playerPile.setFont(new Font("Arial", Font.PLAIN, 15));
		playerPile.setEditable(false);
		
		JLabel action_pile = new JLabel();
		action_pile.setBounds(40, 260, pile.getIconWidth(), pile.getIconHeight());
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
		//p1.setBackground(new Color(0,0,0,0));
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
		//p2.setBackground(new Color(0,0,0,0));
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
		
		changeImageSize changeSize = new changeImageSize();
		try {
			changeSize.changeSize("resources/action cards/images.jpg", 60, 100);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon pile = new ImageIcon("resources/action cards/images.jpg");
		JLabel draw_pile = new JLabel();
		draw_pile.setBounds(40, 70, pile.getIconWidth(), pile.getIconHeight());
		draw_pile.setBackground(Color.gray);
		draw_pile.setOpaque(false);
		
		
		JTextField drawPile = new JTextField();
		drawPile.setBounds(40,40,70,20);
		drawPile.setText("draw pile");
		drawPile.setFont(new Font("Arial", Font.PLAIN, 15));
		drawPile.setEditable(false);
		
		JTextField playerPile = new JTextField();
		playerPile.setBounds(40, 200, 80, 20);
		playerPile.setText("player pile");
		playerPile.setFont(new Font("Arial", Font.PLAIN, 15));
		playerPile.setEditable(false);
		
		JLabel action_pile = new JLabel();
		action_pile.setBounds(40, 240, pile.getIconWidth(), pile.getIconHeight());
		action_pile.setBackground(Color.gray);
		action_pile.setOpaque(true);
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JTextField player1 = new JTextField();
		player1.setBounds(0,0,60,20);
		player1.setText("player 1");
		player1.setFont(new Font("Arial", Font.PLAIN, 15));
		player1.setEditable(false);
		
		JLabel p1 = new JLabel();
		p1.setBounds(180, 50, 800, 140);
		p1.setBorder(blackline);
		p1.setBackground(new Color(0,0,0,0));
		p1.add(player1);
		p1.setOpaque(true);
		
		JTextField player2 = new JTextField();
		player2.setBounds(0,0,60,20);
		player2.setText("player 2");
		player2.setFont(new Font("Arial", Font.PLAIN, 15));
		player2.setEditable(false);
		
		JLabel p2 = new JLabel();
		p2.setBounds(180, 220, 800, 140);
		p2.setBorder(blackline);
		p2.setBackground(new Color(0,0,0,0));
		p2.add(player2);
		p2.setOpaque(true);
		
		JTextField player3 = new JTextField();
		player3.setBounds(0, 0, 60, 20);
		player3.setText("player 3");
		player3.setFont(new Font("Arial", Font.PLAIN, 15));
		player3.setEditable(false);
		
		JLabel p3 = new JLabel();
		p3.setBounds(180, 390, 800, 140);
		p3.setBorder(blackline);
		p3.setBackground(new Color(0,0,0,0));
		p3.add(player3);
		p3.setOpaque(true);
		
		container.add(draw_pile);
		container.add(drawPile);
		container.add(playerPile);
		container.add(action_pile);
		container.add(p1);
		container.add(p2);
		container.add(p3);
	}
	
	
	public void four_player(){
		changeImageSize changeSize = new changeImageSize();
		try {
			changeSize.changeSize("resources/action cards/images.jpg", 54, 90);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon pile = new ImageIcon("resources/action cards/images.jpg");
		JLabel draw_pile = new JLabel();
		draw_pile.setBounds(40, 70, pile.getIconWidth(), pile.getIconHeight());
		draw_pile.setBackground(Color.gray);
		draw_pile.setOpaque(false);
		
		
		JTextField drawPile = new JTextField();
		drawPile.setBounds(40,40,70,20);
		drawPile.setText("draw pile");
		drawPile.setFont(new Font("Arial", Font.PLAIN, 15));
		drawPile.setEditable(false);
		
		JTextField playerPile = new JTextField();
		playerPile.setBounds(40, 180, 80, 20);
		playerPile.setText("player pile");
		playerPile.setFont(new Font("Arial", Font.PLAIN, 15));
		playerPile.setEditable(false);
		
		JLabel action_pile = new JLabel();
		action_pile.setBounds(40, 220, pile.getIconWidth(), pile.getIconHeight());
		action_pile.setBackground(Color.gray);
		action_pile.setOpaque(true);
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JTextField player1 = new JTextField();
		player1.setBounds(0,0,60,20);
		player1.setText("player 1");
		player1.setFont(new Font("Arial", Font.PLAIN, 15));
		player1.setEditable(false);
		
		JLabel p1 = new JLabel();
		p1.setBounds(150, 50, 800, 120);
		p1.setBorder(blackline);
		p1.setBackground(new Color(0,0,0,0));
		p1.add(player1);
		p1.setOpaque(true);
		
		JTextField player2 = new JTextField();
		player2.setBounds(0,0,60,20);
		player2.setText("player 2");
		player2.setFont(new Font("Arial", Font.PLAIN, 15));
		player2.setEditable(false);
		
		JLabel p2 = new JLabel();
		p2.setBounds(150, 200, 800, 120);
		p2.setBorder(blackline);
		p2.setBackground(new Color(0,0,0,0));
		p2.add(player2);
		p2.setOpaque(true);
		
		JTextField player3 = new JTextField();
		player3.setBounds(0, 0, 60, 20);
		player3.setText("player 3");
		player3.setFont(new Font("Arial", Font.PLAIN, 15));
		player3.setEditable(false);
		
		JLabel p3 = new JLabel();
		p3.setBounds(150, 350, 800, 120);
		p3.setBorder(blackline);
		p3.setBackground(new Color(0,0,0,0));
		p3.add(player3);
		p3.setOpaque(true);
		
		JTextField player4 = new JTextField();
		player4.setBounds(0,0,60,20);
		player4.setText("player 4");
		player4.setFont(new Font("Arial", Font.PLAIN, 15));
		player4.setEditable(false);
		
		JLabel p4 = new JLabel();
		p4.setBounds(150, 500, 800, 120);
		p4.setBorder(blackline);
		p2.setBackground(new Color(0,0,0,0));
		p4.add(player4);
		p4.setOpaque(true);
		
		container.add(draw_pile);
		container.add(drawPile);
		container.add(playerPile);
		container.add(action_pile);
		container.add(p1);
		container.add(p2);
		container.add(p3);
		container.add(p4);
	}
	
	
	public void five_player(){		
		changeImageSize changeSize = new changeImageSize();
		try {
			changeSize.changeSize("resources/action cards/images.jpg", 48, 80);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon pile = new ImageIcon("resources/action cards/images.jpg");
		JLabel draw_pile = new JLabel();
		draw_pile.setBounds(40, 70, pile.getIconWidth(), pile.getIconHeight());
		draw_pile.setBackground(Color.gray);
		draw_pile.setOpaque(false);
		
		
		JTextField drawPile = new JTextField();
		drawPile.setBounds(40,40,70,20);
		drawPile.setText("draw pile");
		drawPile.setFont(new Font("Arial", Font.PLAIN, 15));
		drawPile.setEditable(false);
		
		JTextField playerPile = new JTextField();
		playerPile.setBounds(40, 160, 80, 20);
		playerPile.setText("player pile");
		playerPile.setFont(new Font("Arial", Font.PLAIN, 15));
		playerPile.setEditable(false);
		
		JLabel action_pile = new JLabel();
		action_pile.setBounds(40, 200, pile.getIconWidth(), pile.getIconHeight());
		action_pile.setBackground(Color.gray);
		action_pile.setOpaque(true);
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JTextField player1 = new JTextField();
		player1.setBounds(0,0,60,20);
		player1.setText("player 1");
		player1.setFont(new Font("Arial", Font.PLAIN, 15));
		player1.setEditable(false);
		
		JLabel p1 = new JLabel();
		p1.setBounds(150, 50, 800, 100);
		p1.setBorder(blackline);
		p1.add(player1);
		p1.setOpaque(true);
		
		JTextField player2 = new JTextField();
		player2.setBounds(0,0,60,20);
		player2.setText("player 2");
		player2.setFont(new Font("Arial", Font.PLAIN, 15));
		player2.setEditable(false);
		
		JLabel p2 = new JLabel();
		p2.setBounds(150, 170, 800, 100);
		p2.setBorder(blackline);
		p2.add(player2);
		p2.setOpaque(true);
		
		JTextField player3 = new JTextField();
		player3.setBounds(0, 0, 60, 20);
		player3.setText("player 3");
		player3.setFont(new Font("Arial", Font.PLAIN, 15));
		player3.setEditable(false);
		
		JLabel p3 = new JLabel();
		p3.setBounds(150, 290, 800, 100);
		p3.setBorder(blackline);
		p3.add(player3);
		p3.setOpaque(true);
		
		JTextField player4 = new JTextField();
		player4.setBounds(0,0,60,20);
		player4.setText("player 4");
		player4.setFont(new Font("Arial", Font.PLAIN, 15));
		player4.setEditable(false);
		
		JLabel p4 = new JLabel();
		p4.setBounds(150, 410, 800, 100);
		p4.setBorder(blackline);
		p4.add(player4);
		p4.setOpaque(true);
		
		JTextField player5 = new JTextField();
		player5.setBounds(0,0,60,20);
		player5.setText("player 5");
		player5.setFont(new Font("Arial", Font.PLAIN, 15));
		player5.setEditable(false);
		
		JLabel p5 = new JLabel();
		p5.setBounds(150, 530, 800, 100);
		p5.setBorder(blackline);
		p5.add(player5);
		p5.setOpaque(true);
		
		container.add(draw_pile);
		container.add(drawPile);
		container.add(playerPile);
		container.add(action_pile);
		container.add(p1);
		container.add(p2);
		container.add(p3);
		container.add(p4);
		container.add(p5);
	}
}
