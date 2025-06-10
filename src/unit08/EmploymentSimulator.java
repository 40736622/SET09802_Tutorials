package unit08;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class EmploymentSimulator {
	private LinkedList<Person> employees = new LinkedList<Person>();
	
	public EmploymentSimulator() {}
	
	public void employee(Person person) {
		this.employees.addLast(person);
	}
	
	public void makeRedundant() {
		this.employees.removeLast();	
	}
	
	public void printNextForTheChop() {
		Person employee = this.employees.peekLast();
		String output = String.format("Employee next for the chop:\n%s", employee.getName());
		JOptionPane.showMessageDialog(null, output, "Next for the Chop", JOptionPane.PLAIN_MESSAGE);
	}
	
	public int companySize() {
		return this.employees.size();
	}
	
	public void printEmployees() {
		String output = "The remaining employees:\n";
		
		for (Person employee : employees) {
			output += String.format("%s\n", employee.getName());
		}
		
		JOptionPane.showMessageDialog(null, output, "Employees", JOptionPane.PLAIN_MESSAGE);
	}
}
