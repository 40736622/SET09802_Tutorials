package unit01;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a whole number."));
				
		String result = String.format("%d", num / 2);
		
		JOptionPane.showMessageDialog(null, result, 
				"Result", JOptionPane.PLAIN_MESSAGE);
	}

}
