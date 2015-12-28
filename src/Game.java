
public class Game
{
	public static void main(String[] args)
	{
		GameGUI gameGUI = new GameGUI();
		gameGUI.initialize();
		GameLoop gameLoop = new GameLoop();
		gameLoop.loop();
	}
}
