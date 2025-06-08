package unit01;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		float num;
		
		num = Float.parseFloat(JOptionPane.showInputDialog("Enter a number."));
		
		String result = String.format("%.2f", num * 1.25);
		
		JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.PLAIN_MESSAGE);
	}

}
