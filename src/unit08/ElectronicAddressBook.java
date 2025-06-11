package unit08;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class ElectronicAddressBook {
	TreeMap<String, String> addressBook = new TreeMap<String, String>();
	
	public ElectronicAddressBook() {}
	
	public void addEntry() {
		String name = JOptionPane.showInputDialog("Input your name.");
		String address = JOptionPane.showInputDialog("Input your address.");
		addEntry(name, address);
	}
	
	public void addEntry(String name, String address) {
		this.addressBook.put(name, address);
	}
	
	public void deleteEntry() {
		String name = JOptionPane.showInputDialog("Input a person's name to remove an entry.\n" + toString());
		deleteEntry(name);
	}
	
	public void deleteEntry(String key) {
		this.addressBook.remove(key);
	}
	
	@Override
	public String toString() {
		String output = "This address book contains the following entries:\n";
		
		for (Map.Entry<String, String> entry : addressBook.entrySet()) {
			output += String.format("%s - %s\n", entry.getKey(), entry.getValue());
		}
		
		return output;
	}
	
	public void displayContents() {
		JOptionPane.showMessageDialog(null, toString(), "Address Book", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void go() {
		int option;
		String output = "Choose one option:\n";
		output += "1. Add entry\n";
		output += "2. Delete entry\n";
		output += "3. View entries\n";
		output += "4. Exit";

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(output));
			
			switch(option) {
				case 1:
					addEntry();
					break;
				case 2:
					deleteEntry();
					break;
				case 3:
					displayContents();
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid input. Choose an exisitng option.",
							"Warning", JOptionPane.WARNING_MESSAGE);
					break;
			
			}
			
		} while (option != 4);
	}
	
}
