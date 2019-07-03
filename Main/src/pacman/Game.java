package pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Game extends JPanel implements Runnable {

	static int score;
	static int life = 4;
	static boolean playe = true;
	static boolean flagegameover;
	static boolean flageWin;
	static boolean Play = true;
	static int f = 1;
	private Thread pacman;
	pacman pacman2 = new pacman(this);
	Wall wall[] = new Wall[100];
	Enemy enemy[] = new Enemy[3];
	Point point[] = new Point[422];

	public Game() {

		for (int i = 0; i < wall.length; i++) {
			wall[i] = new Wall(this);

		}
		for (int i = 0; i < point.length; i++) {
			point[i] = new Point(this);

		}
		drawpoint();
		for (int i = 0; i < enemy.length; i++) {
			enemy[i] = new Enemy(this);

		}
		int xe = 200, ye = 10;
		for (int i = 0; i < enemy.length - 1; i++) {
			enemy[i].x = xe;
			enemy[i].y = ye;
			xe += 250;
			ye += 80;

		}
		enemy[2].x = 200;
		enemy[2].y = 300;
		addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {

				pacman2.keyPressed(e);

			}

			public void keyTyped(KeyEvent e) {
			}
		});
		setFocusable(true);
		setDoubleBuffered(true);
	}

	void drawall() {
		int x = 50, y = 50;
		for (int i = 0; i < 5; i++) {
			wall[i].x = x; // 50<=x<=130 y>50

			wall[i].y = y;
			x += 20;// 130
			/* oooooooooooo */
		}

		x = 50;
		for (int i = 4; i < 8; i++) {
			wall[i].x = x;
			wall[i].y = y; // 50<=y<=130 x>50
			y += 20;// 130
			/*
			 * o o o o
			 */

		}

		for (int i = 8; i < 12; i++) {
			wall[i].x = x;
			wall[i].y = y;// 130 //50<=x<=130 y>130
			x += 20;// 130
			/* ooooooo */
			/*
			 * if(y>130-20 &&(x>=50 && x<=130)){ ya = 1; }
			 */
		}

		for (int i = 12; i < 17; i++) {
			wall[i].x = x; // 50<=y<=130 x>130
			wall[i].y = y;
			y -= 20;
			/*
			 * o o o o
			 */
		}
		x = 0;
		y = 200;
		for (int i = 17; i < 23; i++) {
			wall[i].x = x;
			wall[i].y = y; // 200<=y<=320 x>0
			y += 20;

		}

		for (int i = 23; i < 30; i++) {
			wall[i].x = x; // 0<=x<=140 y>320
			wall[i].y = y;
			x += 20;

		}

		x = 250;
		y = 200;
		for (int i = 30; i < 45; i++) {
			wall[i].x = x; // 250<=x<=550 y>200
			wall[i].y = y;
			x += 20;

		}

		x = 390;
		y = 60;
		for (int i = 45; i < 52; i++) {
			wall[i].x = x;
			wall[i].y = y; // 60<=y<=220 x>390
			y += 20;

		}
		y += 20;

		for (int i = 52; i < 57; i++) {
			wall[i].x = x; // 240<=y<=320 x>390
			wall[i].y = y;
			y += 20;

		}

		x = 700;
		y = 50;
		for (int i = 57; i < 70; i++) {
			wall[i].x = x; // 50<=y<=310 x>700
			wall[i].y = y;
			y += 20;

		}

		for (int i = 70; i < 75; i++) {
			wall[i].x = x; // 700<=x<=600 y>310
			wall[i].y = y;
			x -= 20;

		}

	}

	public void drawpoint() {

		int x = 15, y = 15;
		int i = 0;
		for (i = 0; i < 39; i++) {
			point[i].x = x; // 50<=x<=130 y>50

			point[i].y = y;
			x += 20;// 130

		}
		x = 15;
		for (i = 39; i < 48; i++) {
			point[i].x = x; // 50<=x<=130 y>50

			point[i].y = y;
			y += 20;// 130

		}
		x += 20;
		int t = x;
		for (i = 48; i < 58; i++) {
			point[i].x = x; // 50<=x<=130 y>50

			point[i].y = y;
			x += 20;// 130

		}
		x = t;
		int c = 1;
		for (i = 58; i < 119; i++) {
			if (c <= 10) {
				point[i].x = x;

				point[i].y = y;
				x += 20;
				c++;
			} else {
				c = 1;
				point[i].x = x;

				point[i].y = y;
				y += 20;
				x = t;
				c++;
			}
		}

		x = 440;
		y = 50;
		c = 1;
		for (i = 119; i < 200; i++) {
			if (c <= 10) {
				point[i].x = x;

				point[i].y = y;
				x += 20;
				c++;
			} else {
				c = 1;
				point[i].x = x;

				point[i].y = y;
				y += 20;
				x = 440;
				c++;
			}

		}

		x = 180;
		y = 50;
		c = 1;
		for (i = 200; i < 251; i++) {
			if (c <= 10) {
				point[i].x = x;

				point[i].y = y;
				x += 20;
				c++;
			} else {
				c = 1;
				point[i].x = x;

				point[i].y = y;
				y += 20;
				x = 180;
				c++;
			}

		}
		x = 450;
		y = 230;
		c = 1;
		for (i = 251; i < 300; i++) {
			if (c <= 10) {
				point[i].x = x;

				point[i].y = y;
				x += 20;
				c++;
			} else {
				c = 1;
				point[i].x = x;

				point[i].y = y;
				y += 20;
				x = 450;
				c++;
			}
			x = 730;
			y = 50;
			c = 1;
			for (i = 300; i < 346; i++) {
				if (c <= 3) {
					point[i].x = x;

					point[i].y = y;
					x += 20;
					c++;
				} else {
					c = 1;
					point[i].x = x;

					point[i].y = y;
					y += 20;
					x = 730;
					c++;
				}
			}
			x = 250;
			y = 230;
			c = 1;
			for (i = 346; i < 377; i++) {
				if (c <= 6) {
					point[i].x = x;

					point[i].y = y;
					x += 20;
					c++;
				} else {
					c = 1;
					point[i].x = x;

					point[i].y = y;
					y += 20;
					x = 250;
					c++;
				}
			}
			x = 450;
			y = 230;
			c = 1;
			for (i = 377; i < 422; i++) {
				if (c <= 9) {
					point[i].x = x;

					point[i].y = y;
					x += 20;
					c++;
				} else {
					c = 1;
					point[i].x = x;

					point[i].y = y;
					y += 20;
					x = 450;
					c++;
				}
			}
		}

	}

	public void move() {
		
		gamWin();
		gameOver();
		
		pacman2.move();
		for (int i = 0; i < wall.length; i++) {
			
			wall[i].move(i);
		}
		drawall();
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].move(i);

		}

		for (int i = 0; i < point.length; i++) {
			point[i].score(i);

		}
	}

	public void addNotify() {
		super.addNotify();
		pacman = new Thread(this);
		pacman.start();
	}

	public void paint(Graphics td) {
		
		super.paint(td);
		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 400);
		pacman2.paint(g);
		for (int i = 0; i < wall.length; i++) {
			wall[i].paint(td);

		}
	
		for (int i = 0; i < point.length; i++) {
			point[i].paint(g);

		}
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].paint(g);

		}
		g.setColor(Color.white);
		g.fillRect(0, 340, 800, 3);

		Font font3 = new Font("Arial", Font.BOLD, 15);
		g.setFont(font3);
		g.drawString("Score : " + score, 100, 360);
		g.drawString("Life : " + life, 600, 360);
		Font font2 = new Font("Arial", Font.BOLD, 40);
		g.setFont(font2);
		if (f == 0 && flagegameover) {
			g.drawString("Game Over!", 450, 100);
			Font font4 = new Font("Arial", Font.BOLD, 20);
			g.setFont(font4);
			g.drawString("Score:" + score, 500, 130);
			g.drawString("Life:" + life, 510, 160);
		}
		if (f == 0 && flageWin) {
			g.drawString("Win!", 490, 100);
			Font font4 = new Font("Arial", Font.BOLD, 20);
			g.setFont(font4);
			g.drawString("Score:" + score, 500, 130);
			g.drawString("Life:" + life, 510, 160);
		}
	}

	public void gamWin() {

		if (score == 1870) {
			f = 0;
			flageWin = true;
		}
	}

	public void gameOver() {

		if (life == 0) {
			f = 0;
			flagegameover = true;
		}

	}

	public void run() {
		while (f == 1) {

			move();
			repaint();
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
