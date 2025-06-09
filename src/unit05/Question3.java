package unit05;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		int num;
		String output;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		output = String.format("Num: %d, Result: %d", num, addFiveToInteger(num));
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static int addFiveToInteger(int num) {
		return num + 5;
	}

}
