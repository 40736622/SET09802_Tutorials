package unit01;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Please input a whole number."));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Please input a whole number."));
		
		String result = String.format("%d", num1 - num2);
				
		JOptionPane.showMessageDialog(null, result, 
				"Result", JOptionPane.PLAIN_MESSAGE);
	}
	
}
