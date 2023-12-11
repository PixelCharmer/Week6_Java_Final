package warGame;

// importing collections from the java collections framework package
// the packages allow for managing a dynamic list of cards and for shuffling the deck 

import java.util.ArrayList;
import java.util.Collections;

// importing from the card.java class

import warGame.Card.Suits;
import warGame.Card.Values;

public class Deck {

	// Field 
	// represents the deck of cards as an ArrayList of Card objects
	
	private ArrayList<Card> cardDeck;

	// Constructor
	// initializes the cardDeck and uses nested loops to  iterate through all possible combinations of suits and values, creating a standard deck of 52    	cards and adding them to the cardDeck
	
	public Deck() {
		cardDeck = new ArrayList<Card>();
		for (Suits suit : Suits.values()) {
			for (Values value : Values.values()) {
				cardDeck.add(new Card(suit, value));
			}
		}
	}

	// Methods
	// method to shuffling the deck
	
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}

	// method for dealing the cards between the two players 
	
	public Card deal() {
		Card dealCard = cardDeck.get(0);
		cardDeck.remove(0);
		return dealCard;

	}

}
