package unit09;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Module {
	private String name;
	private ArrayList<Lecture> lectures = new ArrayList<Lecture>();
	
	public Module(String name, ArrayList<Lecture> lectures) {
		this.name = name;
		this.lectures = lectures;
	}
	
	public Module(String name) {
		this(name, new ArrayList<Lecture>());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addLecture(Lecture lecture) {
		this.lectures.add(lecture);
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
