package unit02;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));
		
		String message = num % 2 == 0 ? "Even" : "Odd";
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
	}

}
