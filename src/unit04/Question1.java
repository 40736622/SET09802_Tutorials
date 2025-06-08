package unit04;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 5;
		int[] nums = new int[ARRAY_SIZE];
		String output = "";
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));			
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 10) {
				output += nums[i] + "  ";
			}
		}
		
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.PLAIN_MESSAGE);
	}

}
