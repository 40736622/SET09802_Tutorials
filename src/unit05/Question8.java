package unit05;

import javax.swing.JOptionPane;

public class Question8 {

	public static void main(String[] args) {
		String name = "John Doe", address = "Edinburgh";
		Integer age = 30;
		
		printDetails(name, address, age);
		printDetails(name, address);
		printDetails(name, age);
	}
	
	public static void printDetails(String name, String address, Integer age) {
		String output = "";
		
		if (name != null) {
			output += String.format("Name: %s\n", name);
		}
		
		if (address != null) {
			output += String.format("Address: %s\n", address);
		}
		
		if (age != null) {
			output += String.format("Age: %d", age);
		}
		
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void printDetails(String name, String address) {
		printDetails(name, address, null);
	}
	
	public static void printDetails(String name, Integer age) {
		printDetails(name, null, age);
	}

}
