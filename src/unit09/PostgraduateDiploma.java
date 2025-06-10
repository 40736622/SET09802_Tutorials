package unit09;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PostgraduateDiploma {
	String name;
	ArrayList<Module> modules = new ArrayList<Module>();
	
	public PostgraduateDiploma(String name, ArrayList<Module> modules) {
		this.name = name;
		this.modules = modules;
	}
	
	public PostgraduateDiploma(String name) {
		this(name, new ArrayList<Module>());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addModule(Module module) {
		this.modules.add(module);
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
