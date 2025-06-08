package unit03;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Question3 {

	public static void main(String[] args) {
		int fails = 0, passes = 0;
		int[] marks = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter a student's mark between 0 and 100."));
			
			while (mark < 1 || mark > 100) {
				mark = Integer.parseInt(JOptionPane.showInputDialog("Invalid Input!\n Enter a student's mark between 0 and 100."));
			}
			
			marks[i] = mark;
			
			if (mark >= 50) {
				passes++;
			} else {
				fails++;
			}
		}
		
		String message = String.format("%s\n Passes: %d, Fails: %d", Arrays.toString(marks), passes, fails);
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
