import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class Tetris extends JApplet
{
	
	TetrisGame game = new TetrisGame();
	
	Thread backgroundThread;
	
	//APPLET=FUNCTIONS=====================================================================================
	public void init()
	{
		addKeyListener(new TetrisKeyListener());
		setFocusable(true);
		requestFocusInWindow();
        game.validate();
    	this.add(game);
<<<<<<< HEAD
        setSize(300, 300);
=======
        setSize(500, 600);
>>>>>>> refs/remotes/origin/master
        setVisible(true);
    	backgroundThread = new Thread(game);
    	backgroundThread.start();
	}
	
    public void destroy() 
    {
         backgroundThread = null;
         System.out.println("Destroyed!");
    }

	public void run()
	{
		game.run();
	}
	
	private class TetrisKeyListener implements KeyListener
	{
		public void keyReleased(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				game.hardDrop();
			}
		}
		
		public void keyPressed(KeyEvent e)
		{
<<<<<<< HEAD
			System.out.println("Key pressed!");
=======
>>>>>>> refs/remotes/origin/master
			game.inputKey(e.getKeyCode());
		}
		
		public void keyTyped(KeyEvent e){}
	}
}