package game.model;

import java.util.ArrayList;

public class GameBot
{
	private ArrayList<String> gameList;
	private String userName;
	
	public GameBot(String userName)
	{
		this.userName = userName;
		this.gameList = new ArrayList<String>();
		
		buildGameList();
	}
	
	private void buildGameList()
	{
		this.gameList.add("Rock");
		this.gameList.add("Paper");
		this.gameList.add("Scissors");
	}
	
	public boolean rockChecker(String currentInput)
	{
		boolean hasRock = false;
		if(currentInput == "Rock")
		{
			hasRock = true;
		}
		
		return hasRock;
	}
	
	public boolean scissorsChecker(String currentInput)
	{
		boolean hasScissors = false;
		if(currentInput == "Scissors")
		{
			hasScissors = true;
		}
		
		return hasScissors;
	}
	
	public boolean paperChecker(String currentInput)
	{
		boolean hasPaper = false;
		if(currentInput == "Paper")
		{
			hasPaper = true;
		}
		
		return hasPaper;
	}
	
	public String processChoice(String currentInput)
	{
		String nextConversation = "Let's play rock paper scissors!";
		int randomTopic = (int) (Math.random()*5); 
		
		if(rockChecker(currentInput))
		{
			return "I don't understand your keyboard mash, please write some real words.";
		}
		switch (randomTopic)
		{
		case 0:
			if(paperChecker(currentInput))
			{
				nextConversation = "That is a very popular meme this year.  What else are you " + "wanting to talk about?";
			}
			break;
		case 1:
			if(scissorsChecker(currentInput))
			{
				nextConversation = "Politics are cool, but is there anything else you want to talk about?";
			}
			break;
		case 2:
			if(rockChecker(currentInput))
			{
				nextConversation = "I don't understand your keyboard mash, please write some real words.";
			}
		}	
					
		return nextConversation;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public ArrayList<String> getGameList()
	{
		return gameList;
	}
}
