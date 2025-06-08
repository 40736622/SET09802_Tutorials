package unit03;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		int min, max, count = 1;
		int[] nums = new int[10];
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		nums[0] = num;
		max = num;
		min = num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			nums[count] = num;
			
			if (num > max) {
				max = num;
			}
			
			if (num < min) {
				min = num;
			}
			
			count++;
			
		} while (count <= 9);

		String message = String.format("%s\n Max: %d, Min: %d", Arrays.toString(nums), max, min);
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
