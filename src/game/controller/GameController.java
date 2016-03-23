package game.controller;

import game.view.GameView;
import game.view.GameFrame;
import game.model.GameBot;

public class GameController
{
	private GameBot myBot;
	private GameView myDisplay;
	private GameFrame baseFrame;
	
	public GameController()
	{
		myDisplay = new GameView();
		String userName = myDisplay.grabAnswer("What is your name?");
		myBot = new GameBot(userName);
		baseFrame = new GameFrame(this);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + myBot.getUserName());
	}
	
	public String userToChatbot(String conversation)
	{
		String response = "";
		response = myBot.processChoice(conversation);
		return response;
	}
	
	public GameBot getGamebot()
	{
		return myBot;
	}
	
	public GameView getGameView()
	{
		return myDisplay;
	}
	
	public GameFrame getBaseFrame()
	{
		return baseFrame;
	}
}
