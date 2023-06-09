package Game;

import Controller.GameController;
import Controller.ViewController;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewBank implements ActionListener{
	
	JFrame frame;
	Container container;
	ViewController gameFrame;
	
	JPanel panel;
	JButton back;
	public ViewBank(JFrame frame, Container container, ViewController gameFrame){
		this.frame = frame;
		this.container = container;
		this.gameFrame = gameFrame;
		panel = new JPanel();
		panel.setBounds(0,0,frame.getWidth(),frame.getHeight());
		panel.setBackground(new Color(0, 134, 145, 100));
		
		back = new JButton("BACK");
		back.addActionListener(this);
		panel.add(back);
		
		container.add(panel);
		frame.getLayeredPane().add(panel, Integer.MIN_VALUE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			panel.setVisible(false);
			gameFrame.viewFrame.getCheck_bank().setEnabled(true);
			container.remove(panel);
			//container.revalidate();
			container.repaint();
		}
	}


}
