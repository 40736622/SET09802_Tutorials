package unit02;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Question7 {

	public static void main(String[] args) {
		int fails = 0, passes = 0;
		int[] marks = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter a student's mark"));
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
