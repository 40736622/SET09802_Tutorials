package unit04;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		final int TOTAL_MARKS = 10;
		int[] marks = new int[TOTAL_MARKS];
		String output = "";
		int totalAs = 0, totalBs = 0, totalCs = 0, totalFs = 0;
		
		for (int i = 0; i < marks.length; i++) {
			int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter a student's mark between 0 and 100."));
			
			while ( mark < 0 || mark > 100) {
				mark = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Enter a student's mark between 0 and 100."));
			}
			
			marks[i] = mark;
		}
		
		for (int i = 0; i < marks.length; i++) {
			char grade = 0;
			
			if (marks[i] >= 75 && marks[i] <= 100) {
				grade = 'A';
				totalAs++;
			} else if (marks[i] >= 60 && marks[i] <= 74) {
				grade = 'B';
				totalBs++;
			} else if (marks[i] >= 50 && marks[i] <= 59) {
				grade = 'C';
				totalCs++;
			} else if (marks[i] < 50) {
				grade = 'F';
				totalFs++;
			}
			
			output += String.format("Mark %d: %d, Grade: %c\n", i + 1, marks[i], grade);
		}

		output += String.format("A: %d, B:%d, C: %d, F: %d", totalAs, totalBs, totalCs, totalFs);

		JOptionPane.showMessageDialog(null, output, "Grades", JOptionPane.PLAIN_MESSAGE);
		
	}

}
