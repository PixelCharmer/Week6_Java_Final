package warGame;

public class Card {

	// Enumerations | Fields
	// enumeration representing the cards within the card deck

	public enum Suits {
		HEARTS, DIAMONDS, CLUBS, SPADES
	}

	public enum Values {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	// Member variables
	// private variables representing the cards and their value and rank

	private Suits suit;
	private Values value;
	private String cardName;

	// Constructor
	// this takes the suit and value as arguments and initializes the corresponding member variables
	// it also constructs the cardName by concatenating the value and suit strings

	public Card(Suits suit, Values value) {
		this.suit = suit;
		this.value = value;
		cardName = value + " of " + suit;
	}

	// Methods
	// prints to the console the full name of the card

	public void describe() {
		System.out.println(cardName);
	}

	// Getters and Setters
	// returning the suit of the card to set the suit

	public Suits getSuit() {
		return suit;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	// returns the value of the card to set the value

	public Values getValue() {
		return value;
	}

	public void setValue(Values value) {
		this.value = value;
	}

}
