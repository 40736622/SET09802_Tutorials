package unit05;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter in a student's mark between 0 and 100"));
		
		while (mark < 0 || mark > 100) {
			mark = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Enter in a student's mark between 0 and 100"));
		}
		
		String output = String.format("Mark: %d, Grade: %c", mark, calculateGrade(mark));
		
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static char calculateGrade(int mark) {
		char grade = 0;
		
		if (mark >= 75 && mark <= 100) {
			grade = 'A';
		} else if (mark >= 60 && mark <= 74) {
			grade = 'B';
		} else if (mark >= 50 && mark <= 59) {
			grade = 'C';
		} else if (mark >= 0 && mark < 50) {
			grade = 'F';
		}
		
		return grade;
	}

}
