package unit05;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		welcome();
	}
	
	public static void welcome() {
		String output = "Welcome to my program.";
		JOptionPane.showMessageDialog(null, output, "Welcome", JOptionPane.PLAIN_MESSAGE);
	}

}
