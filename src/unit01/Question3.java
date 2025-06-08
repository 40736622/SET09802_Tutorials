package unit01;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		float num;
		
		num = Float.parseFloat(JOptionPane.showInputDialog("Please enter a real number."));
				
		String result = String.format("%f", num / 2);
		
		JOptionPane.showMessageDialog(null, result, 
				"Result", JOptionPane.PLAIN_MESSAGE);
	}

}
