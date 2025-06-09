package unit05;

import javax.swing.JOptionPane;

public class Question7 {

	public static void main(String[] args) {
		int num1 = 6, num2 = 2, num3 = 5;
		double db1 = 4.32, db2 = 3.54, db3 = 5.43;
		String msg1 = "Hello,", msg2 = "my name is", msg3 = "John.";
		
		JOptionPane.showMessageDialog(null, String.format("Total: %d", addTogether(num1, num2, num3)), "Integer", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, String.format("Total: %.2f", addTogether(db1, db2, db3)), "Double", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, String.format("Message: %s", addTogether(msg1, msg2, msg3)), "String", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static int addTogether(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double addTogether(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public static String addTogether(String msg1, String msg2, String msg3) {
		return String.format("%s %s %s", msg1, msg2, msg3);
	}

}
