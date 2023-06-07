package Game;
import Cards.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Common {
	private JFrame gameJFrame;
	
	public Common(JFrame gameJFrame) {
		this.gameJFrame = gameJFrame;
	}

	/**固定y轴移动速度*/
	public static void move(Card card, Point from, Point to) {
		if (to.y != from.y) {
			double k = (double) (to.x - from.x) / (to.y - from.y);
			double b = to.x - to.y * k;
			int speed = 0;
			if (from.y < to.y) {
				speed = 2;
			}
			else{
				speed = -2;
			}
			for (int i = from.y; Math.abs(i - to.y) > 2; i += speed) {
				double x = k * i + b;
				card.setLocation((int) x, i);
				card.repaint();
				try {
					Thread.sleep(4);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		card.setLocation(to);
	}

	/**重新摆放牌
	   参数一：游戏界面
	   参数二：要重新摆放顺序的集合
	   参数三：标记
	   0 表示自己，1表示对手;*/
	public static void rePositon(gameJFrame m, ArrayList<Card> list, int flag) {
		Point p = new Point();
		if (flag == 0) {
			p.x = 370 - list.size() * 20;
			p.y = 530;
		}
		if (flag == 1) {
			p.x = 50 + list.size() * 20;
			p.y = 60;
		}
		int len = list.size();
		for (int i = 0; i < len; i++) {
			Card card = list.get(i);
			move(card, card.getLocation(), p);
			//moveCard(poker, p);
			m.getContainer().setComponentZOrder(card, 0);
			p.x += 90;

		}
	}

	/**牌的流畅移动*/
//	public static void moveCard(Card moveCard, Point to) {
//		Runnable moveTask = new MoveCartoon(moveCard, to);
//		EventQueue.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Thread move = new Thread(moveTask);
//				move.start();
//			}
//		});
//	}

	/**手牌的流畅移动*/
//	public static void moveHandsCard(Card removeCard, int player, ArrayList<Card> handsCard) {
//		Point to = null;
//		if (player == 0) {
//			to = new Point(150, 250);
//		} else if (player == 1) {
//			to = new Point(150, 170);
//		}
//		moveCard(removeCard, to);
//		handsCard.remove(removeCard);
//	}

	/**隐藏牌*/



}
