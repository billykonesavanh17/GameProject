package game.view;

import javax.swing.*;
import game.controller.GameController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel
{
	private GameController baseController;
	private JButton rockButton;
	private JButton scissorsButton;
	private JButton paperButton;
	private SpringLayout baseLayout;
	private JTextArea gameArea;
	private JScrollPane gamePane;
	
	public GamePanel(GameController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		scissorsButton = new JButton("SCISSORS");
		paperButton = new JButton("PAPER");
		
		setupGamePane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupGamePane()
	{
		gamePane = new JScrollPane();
		gameArea.setLineWrap(true);
		gameArea.setWrapStyleWord(true);
		gameArea.setEnabled(false);
		gameArea.setEditable(false);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(scissorsButton);
		this.add(paperButton);
		this.add(gamePane);
		rockButton = new JButton("ROCK");
		add(rockButton);
		gameArea = new JTextArea(10, 15);
		add(gameArea);
		gameArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 31, SpringLayout.EAST, paperButton);
		baseLayout.putConstraint(SpringLayout.EAST, paperButton, -188, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, paperButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gameArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, gameArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gameArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gameArea, 235, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rockButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rockButton, -34, SpringLayout.WEST, paperButton);
	}
	
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	
}
