package unit03;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Question2 {

	public static void main(String[] args) {
		int fails = 0, passes = 0, count = 0;
		int[] marks = new int[10];
		
		do {
			int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter a student's mark"));
			marks[count] = mark;
			
			if (mark >= 50) {
				passes++;
			} else {
				fails++;
			}
			
			count++;
			
		} while (count <= 9);
		
		String message = String.format("%s\n Passes: %d, Fails: %d", Arrays.toString(marks), passes, fails);
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
