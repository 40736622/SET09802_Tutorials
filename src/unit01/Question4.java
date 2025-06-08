package unit01;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		String name;
		int age;
		
		name = JOptionPane.showInputDialog("Please enter your name.");
		age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
		
		String message = String.format("Hello %s, you will be %d on your next birthday.", name, ++age);
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
	}

}
