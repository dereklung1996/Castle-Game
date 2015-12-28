
public class GameLoop
{
	final int NANOSECOND = 1000000000; //1 seconds in nanoseconds
	final int TARGET_FPS = 60;
	final long OPTIMAL_TIME = NANOSECOND / TARGET_FPS; //How many nano seconds for a frame
	long lastLoopTime;
	long now;
	long updateLength;
	long lastFpsTime;
	int fps;
	Boolean gameRunning = false;
	GameDraw canvas;
	
	public GameLoop()
	{
		gameRunning = true;
	}
	
	public void setCanvas(GameDraw g)
	{
		canvas = g;
	}
	
	public void loop()
	{
		lastLoopTime = System.nanoTime();
		
		while(gameRunning)
		{
			now = System.nanoTime();
			updateLength = now - lastLoopTime;
			lastLoopTime = now;
			
			//update the frame counter
			lastFpsTime += updateLength;
			fps++;
			
			//update FPS counter if one second in nanosecond has passed
			if(lastFpsTime >= NANOSECOND)
			{
				System.out.println("(FPS: " + fps + " )");
				canvas.x = fps;
				lastFpsTime = 0;
				fps = 0;
				
			}
			
			// Game Updates
			// Draw Game
			canvas.repaint();
			// Puts the thread to sleep by a certain amount to achieve our Target FPS
			try
			{
				Thread.sleep((lastLoopTime - System.nanoTime() + OPTIMAL_TIME) / 1000000) ;
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
