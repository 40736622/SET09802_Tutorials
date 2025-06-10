package unit09;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Module {
	private String name;
	private ArrayList<Lecture> lectures = new ArrayList<Lecture>();
	private final int MAX_NUMBER_OF_LECTURES = 10;
	
	public Module(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addLecture(Lecture lecture) {
		if (this.lectures.size() < MAX_NUMBER_OF_LECTURES) {
			this.lectures.add(lecture);	
		} else {
			String message = String.format("%s has reached its max lecture limit.", this.name);
			JOptionPane.showMessageDialog(null, message, "Lecture Limit", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	@Override
	public String toString() {
		String output = String.format("%s consists of the following lectures:\n", getName());
		
		for (Lecture lecture : this.lectures) {
			output += String.format("%s\n", lecture.getName());
		}
		
		return output;
	}
	
	public void displayDetails() {
		JOptionPane.showMessageDialog(null, toString(), "Module", JOptionPane.PLAIN_MESSAGE);
	}
}
