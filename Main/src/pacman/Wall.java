package pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall {

	Game game;
	private BufferedImage wall;
	int x = 50;
	int y = 50;

	public Wall(Game game) {// / ع¯ط±ظپطھظ† ط¹ع©ط³ ط§ط² ظ‡ط§ط±ط¯ ط¨ط±ط§غŒ ط¯غŒظˆط§ط±
		this.game = game;
		try {
			wall = ImageIO.read(new File("wall.png"));
		} catch (IOException ex) {
			System.out.println("jgj");
		}

	}
void move(int h){
	if(colition(h))
	{
		
		game.pacman2.xa=0;
		game.pacman2.ya=0;
	}
	
	
}
	public void paint(Graphics td) {// ط±ط³ظ… ط¯غŒظˆط§ط± ط¯ط± ظ¾ظ†ظ„

		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(wall, x, y, null);

	}
	public boolean colition(int i) {
		return game.pacman2.getBounds().intersects(getBounds(i));

	}
	public Rectangle getBounds(int j) {
		return new Rectangle(game.wall[j].x, game.wall[j].y, wall.getWidth(),
				wall.getHeight());

	}
}
