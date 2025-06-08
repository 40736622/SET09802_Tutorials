package unit02;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a whole number."));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a whole number."));

		int sum = num1 + num2;
		int product = num1 * num2;
		
		String message = String.format("Addition: %d, Multiplication: %d\n", sum, product);
		
		if (sum > product) {
			message += String.format("%d > %d", sum, product);
		} else if (product > sum) {
			message += String.format("%d > %d", product, sum);
		} else {
			message += String.format("%d == %d", sum, product);
		}
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
	}

}
