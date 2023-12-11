package warGame;

public class App {

	public static void main(String[] args) {

		// these are the main methods
		// defines the two players of the game

		Player player1 = new Player("Loretta Lynn");
		Player player2 = new Player("Conway Twitty");

		// creating the deck and shuffling it

		Deck playerDeck = new Deck();
		playerDeck.shuffle();

		// looping through the deck to deal 26 cards to each player

		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player1.deal(playerDeck);
			} else {
				player2.deal(playerDeck);
			}
		}
		System.out.println("------------");

		// this loop simulates 26 rounds of the game
		// each player flips a card per round

		for (int i = 1; i <= 26; i++) {
			System.out.println("Round " + i + "\n------------");
			System.out.println(player1.getPlayerName() + " flipped over: ");
			Card player1card = player1.flip();
			player1card.describe();

			System.out.println(player2.getPlayerName() + " flipped over: ");
			Card player2card = player2.flip();
			player2card.describe();

			System.out.println();

			// the played cards are then compared with conditional if/else to determine the
			// round winner and increments the winners score by 1

			if (cardRound(player1card, player2card) == 1) {
				player1.incrementScore();
				System.out.println(player1.getPlayerName() + " wins this round\n");
			} else if (cardRound(player1card, player2card) == 2) {
				player2.incrementScore();
				System.out.println(player2.getPlayerName() + " wins this round\n");
			} else {
				System.out.println("DRAW - No point awarded\n"); // no score is given in the case of a tie
			}
			System.out.println("------------");
		}
		// after all rounds, it displays the players' scores then determines and
		// announces the winner
		System.out.println("The player scores are: ");
		System.out.println(player1.getPlayerName() + ": " + player1.getPlayerScore());
		System.out.println(player2.getPlayerName() + ": " + player2.getPlayerScore());

		System.out.println();
		System.out.println("The winner is: ");

		if (player1.getPlayerScore() > player2.getPlayerScore()) {
			System.out.println(player1.getPlayerName());
		} else if (player2.getPlayerScore() > player1.getPlayerScore()) {
			System.out.println(player2.getPlayerName());
		} else {
			System.out.println("It's a Draw!");
		}

	}

	// helper method converts the values a card to an integer for comparison

	public static int switchtoInt(Card card) {
		switch (card.getValue()) {
		case TWO:
			return 2;
		case THREE:
			return 3;
		case FOUR:
			return 4;
		case FIVE:
			return 5;
		case SIX:
			return 6;
		case SEVEN:
			return 7;
		case EIGHT:
			return 8;
		case NINE:
			return 9;
		case TEN:
			return 10;
		case JACK:
			return 11;
		case QUEEN:
			return 12;
		case KING:
			return 13;
		default:
			return 14;

		}
	}

	// compares the values of two cards using the switchtoInt method

	public static int cardRound(Card player1card, Card player2card) {
		if (switchtoInt(player1card) > switchtoInt(player2card)) {
			return 1;
		} else if (switchtoInt(player1card) < switchtoInt(player2card)) {
			return 2;
		} else {
			return 3;
		}
	}

}