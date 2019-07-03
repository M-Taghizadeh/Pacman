package pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Point {

	int x = -800, y = -800;
	int xa = 1, ya = 1;
	Random random = new Random();
	Game game;
	private BufferedImage point;

	public Point(Game game) {

		this.game = game;
		try {
			point = ImageIO.read(new File("point.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
	}

	void score(int k) {
		if (colition(k)) {
			game.point[k].x = -800;

			game.point[k].y = -800;
			game.score += 5;

		}

	}

	public void paint(Graphics td) {

		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(point, x, y, null);
	}

	public boolean colition(int i) {
		return game.pacman2.getBounds().intersects(getBounds(i));

	}

	public Rectangle getBounds(int j) {
		return new Rectangle(game.point[j].x, game.point[j].y,
				point.getWidth(), point.getHeight());

	}

}
