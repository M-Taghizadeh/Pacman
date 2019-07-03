package pacman;

import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {
		add(game);
		setVisible(true);
		setSize(800, 400);
	
		setLocationRelativeTo(null);
		this.setResizable(false);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	static Game game = new Game();

	public static void main(String[] args) {

		new Main();

		
	}

}
