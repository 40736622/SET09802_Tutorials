package unit05;

import javax.swing.JOptionPane;
import java.util.Random;

public class Question5 {

	public static void main(String[] args) {
		String[] coinSides = {"heads", "tails"};
		String output = String.format("Coin toss result: %s", tossCoin(coinSides));
		JOptionPane.showMessageDialog(null, output, "Coin toss", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	public static String tossCoin(String[] coin) {
		Random random = new Random();
		return coin[random.nextInt(coin.length)];
	}

}
