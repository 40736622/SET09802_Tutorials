package unit09;

import javax.swing.JOptionPane;

public class Lecture {
	private String name;
	
	public Lecture(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return String.format("The name of this lecture is %s", this.name);
	}
	
	public void displayDetails() {
		JOptionPane.showMessageDialog(null, toString(), "Lecture", JOptionPane.PLAIN_MESSAGE);
	}

}
