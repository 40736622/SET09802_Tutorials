package unit06;

import javax.swing.JOptionPane;

public class BlackJackv2 {
	public static void main(String[] args) {

		String windowTitle = "Black Jack";
		String output = "";
		String card;
		String[][] packOfCards = { { "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC" },
				{ "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD" },
				{ "AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH" },
				{ "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS" } };
		// define constants
		final int NUMBER_OF_SUITS = 4;
		final int CARDS_PER_SUIT = 13;

		// select 10 cards
		for (int loop = 0; loop < 10; loop++) {
			card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
			output = output + card + "  ";
		}

		// display selected cards
		JOptionPane.showMessageDialog(null, output, windowTitle, JOptionPane.INFORMATION_MESSAGE);

		// display pack
		printPack(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);

	}

	public static void printPack(String[][] thePack, int numberSuits, int cardsPerSuit) {
		String output = "";

		for (int suitloop = 0; suitloop < numberSuits; suitloop++) {
			for (int cardloop = 0; cardloop < cardsPerSuit; cardloop++) {
				output = output + thePack[suitloop][cardloop] + "  ";
			}
			output = output + "\n";
		}
		// display cards
		JOptionPane.showMessageDialog(null, output, "All Cards", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String pickACard(String[][] thePack, int numberSuits, int cardsPerSuit) {

		String theCard;
		int suit, cardNumber;
		// define constant
		final String EMPTY_VALUE = "empty";

		do {
			suit = (int) (Math.random() * numberSuits);
			cardNumber = (int) (Math.random() * cardsPerSuit);

			theCard = thePack[suit][cardNumber];
		} while (theCard == EMPTY_VALUE);

		// remove card from pack
		thePack[suit][cardNumber] = EMPTY_VALUE;

		return theCard;
	} // end pickACard()

} // end class
