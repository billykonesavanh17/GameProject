package game.view;

import javax.swing.JFrame;
import game.controller.GameController;

public class GameFrame extends JFrame
{
	private GameController baseController;
	private GamePanel basePanel;
	
	public GameFrame(GameController baseController)
	{
		this.baseController = baseController;
		basePanel = new GamePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(575,400);
		this.setTitle("Rock Paper Scissors");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GameController getBaseController()
	{
		return baseController;
	}


}

