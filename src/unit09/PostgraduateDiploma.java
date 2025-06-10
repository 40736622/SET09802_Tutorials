package unit09;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PostgraduateDiploma {
	String name;
	ArrayList<Module> modules = new ArrayList<Module>();
	private final int MAX_NUMBER_OF_MODULES = 6;
	
	public PostgraduateDiploma(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addModule(Module module) {
		if (this.modules.size() < MAX_NUMBER_OF_MODULES) {
			this.modules.add(module);			
		} else {
			String message = String.format("%s has reached its max module limit.", this.name);
			JOptionPane.showMessageDialog(null, message, "Module Limit", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	@Override
	public String toString() {
		String output = String.format("%s consists of the following modules:\n", getName());
		
		for (Module module : this.modules) {
			output += String.format("%s\n", module.getName());
		}
		
		return output;
	}
	
	public void displayDetails() {
		JOptionPane.showMessageDialog(null, toString(), "Postgraduate Diploma", JOptionPane.PLAIN_MESSAGE);
	}
}
