import java.awt.EventQueue;
import javax.swing.JFrame;

public class Game extends JFrame
{
	static GameDraw draw;
	public Game()
	{
		draw = new GameDraw();
	}
	public void initialize()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setTitle("Game");
				setSize(300, 400);
				setLocationRelativeTo(null);
				setResizable(false);
				setVisible(true);
				add(draw);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});

	}
	public static void main(String[] args)
	{
		Game main = new Game();
		main.initialize();
		GameLoop gameLoop = new GameLoop();
		gameLoop.setCanvas(draw);
		gameLoop.loop();
	}
}
