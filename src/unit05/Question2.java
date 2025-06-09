package unit05;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		printInteger(23);
	}
	
	public static void printInteger(int num) {
		String message = String.format("Num: %d", num);
		JOptionPane.showMessageDialog(null, message, "Integer", JOptionPane.PLAIN_MESSAGE);
	}

}
