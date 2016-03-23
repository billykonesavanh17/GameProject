package game.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameView
{
	private String windowMessage;
	private ImageIcon GameIcon;
	
	
	public GameView()
	{
		windowMessage = "Hello from your friendly Gamebot.";
		GameIcon = new ImageIcon(getClass().getResource("images/codybot.png"));

	}
	
	public void showResponse(String popupText)
	{
		JOptionPane.showMessageDialog(null, popupText, windowMessage, JOptionPane.INFORMATION_MESSAGE, GameIcon);
	}

	
	public String grabAnswer(String popupText)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, popupText, windowMessage, JOptionPane.PLAIN_MESSAGE, GameIcon, null, "Answer here" ) + "";
		return answer;
	}
	
}