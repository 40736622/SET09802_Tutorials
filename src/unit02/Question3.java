package unit02;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		String output;
		String charAsString;
		char theChar;

		charAsString = JOptionPane.showInputDialog("Please enter a character.");
		theChar = charAsString.charAt(0);
		
		if (theChar == 'a' || theChar == 'e' || theChar == 'i' || theChar == 'o' || theChar == 'u') {
			output = "This character is a vowel";
		} else {
			output = "This character is not a vowel.";
		}
		
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.PLAIN_MESSAGE);

	}

}
