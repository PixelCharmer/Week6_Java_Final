package warGame;

//importing collections from the java collections framework package

 

import java.util.ArrayList;

public class Player {

	// Fields
	// array list with card objects that represents the player's hand

	private ArrayList<Card> playerHand;
	private int playerScore;
	private String playerName;

	// Constructor
	// initializes the players name and set their score to 0 and creates an empty
	// array to hold the players cards
	public Player(String name) {
		this.playerName = name;
		playerScore = 0;
		playerHand = new ArrayList<Card>();
	}

	// Methods
	// print lines about the player - their name, score, and the cards in their hand
	public void playerDescribe() {
		System.out.println("Player Name: " + playerName);
		System.out.println("Score: " + playerScore);
		System.out.println("Player hand:");
		for (Card card : playerHand) {
			card.describe();
		}

	}

	// method that involves dealing the cards between the two plaayers
	public void deal(Deck deck) {
		playerHand.add(deck.deal());
	}

	// this action of a player playing a card during the game
	public Card flip() {
		Card cardFlips = playerHand.get(0);
		playerHand.remove(0);
		return cardFlips;
	}

	// running total to hold the players score
	public void incrementScore() {
		playerScore++;
	}

	// Getters and Setters
	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(ArrayList<Card> playerHand) {
		this.playerHand = playerHand;
	}

	// returning the player score and sets it
	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	// retuning the players name and sets it
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
