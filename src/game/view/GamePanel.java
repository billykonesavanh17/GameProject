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
	private JButton PVPButton;
	private JButton CPUButton;
	private SpringLayout baseLayout;
	private JTextArea gameArea;
	private JScrollPane gamePane;
	
	public GamePanel(GameController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		scissorsButton = new JButton("SCISSORS");
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 0, SpringLayout.NORTH, scissorsButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, scissorsButton, -10, SpringLayout.SOUTH, this);
		paperButton = new JButton("PAPER");
		baseLayout.putConstraint(SpringLayout.EAST, rockButton, -6, SpringLayout.WEST, paperButton);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, scissorsButton);
		baseLayout.putConstraint(SpringLayout.EAST, paperButton, -6, SpringLayout.WEST, scissorsButton);
		PVPButton = new JButton("PVP");
		baseLayout.putConstraint(SpringLayout.NORTH, PVPButton, 0, SpringLayout.NORTH, scissorsButton);
		baseLayout.putConstraint(SpringLayout.EAST, PVPButton, -6, SpringLayout.WEST, rockButton);
		CPUButton = new JButton("CPU");
		baseLayout.putConstraint(SpringLayout.NORTH, CPUButton, 0, SpringLayout.NORTH, scissorsButton);
		baseLayout.putConstraint(SpringLayout.EAST, CPUButton, -6, SpringLayout.WEST, PVPButton);
		
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
		this.add(PVPButton);
		this.add(CPUButton);
		this.add(rockButton);
		gameArea = new JTextArea(10, 15);
		baseLayout.putConstraint(SpringLayout.EAST, scissorsButton, 0, SpringLayout.EAST, gameArea);
		this.add(gameArea);
		gameArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, gameArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, gameArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gameArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gameArea, 235, SpringLayout.NORTH, this);
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
	
}
