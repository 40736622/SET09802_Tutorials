package unit04;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		final int numberOfSalaries = 5;
		final float taxRate = (float) 0.25;
		float[] salaries = new float[numberOfSalaries];
		String output = "";
		
		for (int i = 0; i < salaries.length; i++) {
			salaries[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter an employee's salary."));
		}
		
		for (int i = 0; i < salaries.length; i++) {
			float taxToBePaid = salaries[i] * taxRate;
			output += String.format("Salary %d: %.2f, Tax Paid: %.2f \n", i + 1, salaries[i], taxToBePaid);
		}
		
		JOptionPane.showMessageDialog(null, output, "Salaries", JOptionPane.PLAIN_MESSAGE);
	}

}
