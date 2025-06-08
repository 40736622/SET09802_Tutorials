package unit02;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Question6 {

	public static void main(String[] args) {
		int max, min;
		int[] nums = new int[10];
		
		nums[0] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		max = nums[0];
		min = nums[0];
		
		for (int i = 1; i < 10; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			nums[i] = num;
			
			if (num > max) {
				max = num;
			}
			
			if (num < min) {
				min = num;
			}
		}
		
		String message = String.format("%s\n Max: %d, Min: %d", Arrays.toString(nums), max, min);
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
