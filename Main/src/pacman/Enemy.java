package pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.util.Random;

public class Enemy {
	int x = 250, y = 100;
	int xa = 1, ya = 1;
	Random random = new Random();
	Game game;
	private BufferedImage enemy;

	public Enemy(Game game) {
		this.game = game;
		try {
			enemy = ImageIO.read(new File("enemy.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}
	}

	int Direction = 1;

	public void move(int k) {

		Direction = random.nextInt();

		if (Direction > 4)
			Direction = 1;
		if (Direction < 1)
			Direction = 4;

		switch (Direction) {
		case 1:

			if (y + ya < 0) {

				ya = 1;
			}
			if (y + ya > 340 - enemy.getHeight()) {

				ya = -1;
			}
			if ((y > 130 && y < 130 + 20) && (x >= 50 && x <= 130)) {
				ya = 1;
			}
			if ((y + ya >= 30 && y + ya <= 50)
					&& (x + xa >= 50 && x + xa <= 130)) {

				ya = -1;
			}
			if ((x + xa >= 0 && x + xa <= 160)
					&& (y + ya >= 300 && y + ya <= 320)) {

				ya = -1;
			}
			if ((x + xa >= 600 && x + xa <= 700)
					&& (y + ya >= 280 && y + ya <= 300)) {

				ya = -1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 180 && y + ya <= 200)) {

				ya = -1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 200 && y + ya <= 220)) {

				ya = 1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 220 && y + ya <= 240)) {

				ya = 1;
			}
			if ((x + xa >= 390 && x + xa <= 400)
					&& (y + ya >= 40 && y + ya <= 60)) {

				ya = -1;
			}
			if ((x + xa >= 700 && x + xa <= 740)
					&& (y + ya >= 30 && y + ya <= 60)) {

				ya = -1;
			}
			if ((x + xa >= 0 && x + xa <= 20)
					&& (y + ya >= 180 && y + ya <= 200)) {

				ya = -1;
			}
			y = y + ya;
			break;

		case 2:
			if (x + xa < 0) {
				xa = -1;

			}
			if (x + xa > game.getWidth() - enemy.getWidth()) {
				xa = 1;

			}

			if ((x + xa >= 130 && x <= 150) && (y + ya >= 50 && y + ya <= 130)) {

				xa = -1;
			}
			if ((x + xa >= 30 && x + xa <= 50)
					&& (y + ya >= 50 && y + ya <= 130)) {
				xa = 1;
			}
			if ((x + xa >= 0 && x <= 20) && (y + ya >= 200 && y + ya <= 3200)) {

				xa = -1;
			}
			if ((x + xa >= 680 && x <= 700) && (y + ya >= 50 && y + ya <= 310)) {

				xa = 1;
			}
			if ((x + xa >= 700 && x <= 720) && (y + ya >= 50 && y + ya <= 310)) {

				xa = -1;
			}
			if ((x + xa >= 230 && x <= 250) && (y + ya >= 100 && y + ya <= 300)) {

				xa = 1;
			}
			if ((x + xa > 390 && x <= 410) && (y + ya >= 60 && y + ya <= 220)) {

				xa = -1;
			}
			if ((x + xa >= 370 && x <= 390) && (y + ya >= 60 && y + ya <= 220)) {

				xa = 1;
			}
			if ((x + xa >= 390 && x <= 410) && (y + ya >= 240 && y + ya <= 320)) {

				xa = -1;
			}
			if ((x + xa >= 370 && x <= 390) && (y + ya >= 240 && y + ya <= 320)) {

				xa = 1;
			}
			if ((x + xa >= 550 && x <= 550) && (y + ya >= 180 && y + ya <= 200)) {

				xa = -1;
			}
			if ((x + xa >= 600 && x <= 620) && (y + ya >= 310 && y + ya <= 330)) {

				xa = 1;
			}
			if ((x + xa >= 700 && x <= 720) && (y + ya >= 300 && y + ya <= 340)) {

				xa = -1;
			}
			if ((x + xa >= 120 && x <= 140) && (y + ya >= 310 && y + ya <= 370)) {

				xa = -1;
			}
			x = x - xa;

			break;

		case 3:
			if (y + ya < 0) {

				ya = -1;
			}
			if (y + ya > 340 - enemy.getHeight()) {

				ya = 1;
			}
			if ((y + ya > 130 && y + ya < 130 + 20) && (x >= 50 && x <= 130)) {
				ya = -1;
			}
			if ((y + ya >= 30 && y + ya <= 50)
					&& (x + xa >= 50 && x + xa <= 130)) {

				ya = 1;
			}
			if ((x + xa >= 0 && x + xa <= 160)
					&& (y + ya >= 320 && y + ya <= 340)) {

				ya = 1;
			}
			if ((x + xa >= 600 && x + xa <= 700)
					&& (y + ya >= 290 && y + ya <= 320)) {

				ya = 1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 180 && y + ya <= 200)) {

				ya = 1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 220 && y + ya <= 240)) {

				ya = -1;
			}
			if ((x + xa >= 250 && x + xa <= 550)
					&& (y + ya >= 220 && y + ya <= 240)) {

				ya = -1;
			}
			if ((x + xa >= 370 && x + xa <= 400)
					&& (y + ya >= 40 && y + ya <= 60)) {

				ya = 1;
			}
			if ((x + xa >= 700 && x + xa <= 740)
					&& (y + ya >= 30 && y + ya <= 60)) {

				ya = 1;
			}
			if ((x + xa >= 0 && x + xa <= 20)
					&& (y + ya >= 180 && y + ya <= 200)) {

				ya = 1;
			}
			y = y - ya;
			break;

		case 4:
			if (x + xa < 0) {
				xa = 1;

			}
			if (x + xa > game.getWidth() - enemy.getWidth()) {
				xa = -1;

			}
			if ((x + xa > 50 - 20 && x + xa < 50)
					&& (y + ya >= 50 && y + ya <= 130)) {
				xa = -1;
			}
			if ((x + xa >= 130 && x <= 150) && (y + ya >= 50 && y + ya <= 130)) {

				xa = 1;
			}
			if ((x + xa >= 0 && x <= 20) && (y + ya >= 200 && y + ya <= 3200)) {

				xa = 1;
			}
			if ((x + xa >= 680 && x <= 700) && (y + ya >= 50 && y + ya <= 310)) {

				xa = -1;
			}
			if ((x + xa >= 700 && x <= 720) && (y + ya >= 50 && y + ya <= 310)) {

				xa = 1;
			}
			if ((x + xa >= 230 && x <= 250) && (y + ya >= 190 && y + ya <= 210)) {

				xa = -1;
			}
			if ((x + xa >= 370 && x <= 390) && (y + ya >= 60 && y + ya <= 220)) {

				xa = -1;
			}
			if ((x + xa > 390 && x <= 410) && (y + ya >= 60 && y + ya <= 220)) {

				xa = 1;
			}
			if ((x + xa >= 370 && x <= 390) && (y + ya >= 60 && y + ya <= 320)) {

				xa = -1;
			}
			if ((x + xa > 390 && x <= 420) && (y + ya >= 240 && y + ya <= 320)) {

				xa = 1;
			}
			if ((x + xa > 390 && x <= 420) && (y + ya >= 240 && y + ya <= 320)) {

				xa = 1;
			}
			if ((x + xa >= 370 && x <= 390) && (y + ya >= 240 && y + ya <= 320)) {

				xa = -1;
			}
			if ((x + xa >= 550 && x <= 570) && (y + ya >= 200 && y + ya <= 220)) {

				xa = 1;
			}
			if ((x + xa >= 600 && x <= 620) && (y + ya >= 300 && y + ya <= 330)) {

				xa = -1;
			}
			if ((x + xa >= 550 && x <= 550) && (y + ya >= 180 && y + ya <= 200)) {

				xa = 1;
			}
			if ((x + xa >= 700 && x <= 720) && (y + ya >= 300 && y + ya <= 340)) {

				xa = 1;
			}
			if ((x + xa >= 120 && x <= 140) && (y + ya >= 310 && y + ya <= 370)) {

				xa = 1;
			}
			x = x + xa;
			break;

		default:
			System.out.println(":-)");
			break;
		}

		if (colition(k)) {
			game.pacman2.x = 500;
			game.pacman2.y = 100;
			game.life--;

		}

	}

	public void paint(Graphics td) {

		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(enemy, x, y, null);
	}

	public boolean colition(int i) {
		return game.pacman2.getBounds().intersects(getBounds(i));

	}

	public Rectangle getBounds(int j) {
		return new Rectangle(game.enemy[j].x, game.enemy[j].y,
				enemy.getWidth(), enemy.getHeight());

	}
}
