package unit05;

import javax.swing.JOptionPane;
import java.util.Random;

public class Question6 {

	public static void main(String[] args) {
		int numOfHeads = 0, numOfTails = 0;
		String[] coinSides = {"heads", "tails"};
		
		for (int i = 1; i <= 1000; i++) {
			String result = tossCoin(coinSides);
			
			if (result == "heads") {
				numOfHeads++;
			} else {
				numOfTails++;
			}
		}
		
		String output = String.format("Heads: %d, Tails: %d", numOfHeads, numOfTails);
		JOptionPane.showMessageDialog(null, output, "Coin toss", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	public static String tossCoin(String[] coin) {
		Random random = new Random();
		return coin[random.nextInt(coin.length)];
	}

}
