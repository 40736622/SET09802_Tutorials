package unit05;

import javax.swing.JOptionPane;

public class Question9 {
	public static void main(String[] args) {
		//declare variables
		String output;
		int passes, fails;
		
		displayMessage("Hello how are you?", "Hello"); // Welcome Dialog
		
		//initialize
		int numberOfStudents = 3;
		int passMark = 10;
		int minMark = 0;
		int maxMark = 100;
	
		
		int[] passesAndFails = calculatePassesAndFails(numberOfStudents, passMark, minMark, maxMark);
		passes = passesAndFails[0];
		fails = passesAndFails[1];
		
		// construct output
		output = formatOutput(passes, fails);
		
		displayMessage(output, "Output"); // Display result dialog
		
	}//end main

	public static void displayMessage(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int getInput(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public static String formatOutput(int passes, int fails) {
		return String.format("The number of passes is %d.\n The number of fails is %d.", passes, fails);
	}
	
	public static int[] calculatePassesAndFails(int numberOfStudents, int passMark, int minMark, int maxMark) {
		int passes = 0, fails = 0, student = 1;

		//main loop to read in marks      
		do {
			//read in marks
			String message = "please enter a mark";
	   	   	int mark = getInput(message);

	   	   	//validate mark
	   	   	while (mark < minMark || mark  > maxMark) {
		   	 	message = String.format("Please enter a mark between %d and %d", minMark, maxMark);
				mark = getInput(message);
		   	}
	   	   	  
		   	  //check if mark is a pass or fail
		   	  if (mark >= passMark) {
		   		  passes++;
		   	  }
		   	  else {
		   		  fails++;
		   	  }
		   	  //increment counter
		   	student++;
		} while(student <= numberOfStudents); 
		
		int[] passesAndFails = {passes, fails};
		
		return passesAndFails;
	}
	
}//end class

