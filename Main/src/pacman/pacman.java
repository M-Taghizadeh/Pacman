package pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class pacman {

	int x = 200, y = 100;

	int xa = 1, ya = 1;
	
	Game game;
	private BufferedImage pacman22;
	private BufferedImage pacman2;
	private BufferedImage pacman33;
	private BufferedImage pacman3;
	private BufferedImage pacman44;
	private BufferedImage pacman4;
	private BufferedImage pacman55;
	private BufferedImage pacman5;

	static int flagpacman = 1;

	public pacman(Game game) {
		this.game = game;
		try {
			pacman22 = ImageIO.read(new File("pacman22.png"));
		} catch (IOException ex) {
			System.out.println("456");
		}
		try {
			pacman2 = ImageIO.read(new File("pacman2.png"));
		} catch (IOException ex) {
			System.out.println("789");
		}
		try {
			pacman33 = ImageIO.read(new File("pacman33.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
		try {
			pacman3 = ImageIO.read(new File("pacman3.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
		try {
			pacman44 = ImageIO.read(new File("pacman44.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
		try {
			pacman4 = ImageIO.read(new File("pacman4.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
		try {
			pacman55 = ImageIO.read(new File("pacman55.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
		try {
			pacman5 = ImageIO.read(new File("pacman5.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	int Direction = 1;
	private int y2;
	private BufferedImageOp x2;

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			xa = -1;
			ya = 0;
			Direction=4;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			xa = 1;
			ya = 0;
			Direction=1;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

			xa = 0;
			ya = -1;
			Direction=3;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			xa = 0;
			ya = 1;
			Direction=2;
		}
	}

	public void move() {

		if (x + xa < 0)
			xa = 0;
		if (x + xa > game.getWidth() - pacman22.getWidth())
			xa = 0;

		if (y + ya < 0)
			ya = 0;
		if (y + ya > game.getHeight() - pacman22.getHeight() - 30)
			ya = 0;

		x = x + xa;
		y = y + ya;
	}

	public void paint(Graphics td) {

		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		switch (Direction ) {
		case 1:

			if (flagpacman == 1) {
				g.drawImage(pacman22, x, y, null);
				flagpacman = 0;

			} else {

				g.drawImage(pacman2, x, y, null);
				flagpacman = 1;
			}
			break;
		case 2:
			if (flagpacman == 1) {
				g.drawImage(pacman33, x, y, null);
				flagpacman = 0;

			} else {

				g.drawImage(pacman3, x, y, null);
				flagpacman = 1;
			}
			break;
		case 3:
			if (flagpacman == 1) {
				g.drawImage(pacman44, x, y, null);
				flagpacman = 0;

			} else {

				g.drawImage(pacman4, x, y, null);
				flagpacman = 1;
			}
			break;
		case 4:
			if (flagpacman == 1) {
				g.drawImage(pacman55, x, y, null);
				flagpacman = 0;

			} else {

				g.drawImage(pacman5, x, y, null);
				flagpacman = 1;
			}
			break;
		default:
			System.out.println(":-)");
			break;
		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, pacman22.getWidth(), pacman22.getHeight());

	}

}
