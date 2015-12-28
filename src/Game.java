import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game extends JFrame implements KeyListener
{
	static GameDraw canvas;
	public Game()
	{
		canvas = new GameDraw();
	}
	public void initialize()
	{
		addKeyListener(this);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setTitle("Game");
				setSize(300, 400);
				setLocationRelativeTo(null);
				setResizable(false);
				setVisible(true);
				add(canvas);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});

	}
	public static void main(String[] args)
	{
		Game main = new Game();
		main.initialize();
		GameLoop gameLoop = new GameLoop();
		gameLoop.setCanvas(canvas);
		gameLoop.loop();
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_LEFT: 
				canvas.x -= 1;
				break;
			case KeyEvent.VK_RIGHT:
				canvas.x += 1;
				break;
			case KeyEvent.VK_UP:
				canvas.y -= 1;
				break;
			case KeyEvent.VK_DOWN:
				canvas.y += 1;
				break;
			default:
				break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
