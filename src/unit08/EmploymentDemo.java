package unit08;

import javax.swing.JOptionPane;

public class EmploymentDemo {

	public static void main(String[] args) {
		EmploymentSimulator es = new EmploymentSimulator();
		
		Person p1 = new Person("James", 23, "Mexico city");
		Person p2 = new Person("Norm", 54, "Arizona");
		Person p3 = new Person("Saul", 34, "New Mexico");
		Person p4 = new Person("Kim", 32, "New Mexico");
		
		es.employee(p1);
		es.employee(p2);
		es.employee(p3);
		es.employee(p4);
		
		es.printEmployees();
		es.printNextForTheChop();
		JOptionPane.showMessageDialog(null, "Company size: " + es.companySize(), "Size", JOptionPane.PLAIN_MESSAGE);
		
		es.makeRedundant();
		es.printEmployees();
		es.printNextForTheChop();
		JOptionPane.showMessageDialog(null, "Company size: " + es.companySize(), "Size", JOptionPane.PLAIN_MESSAGE);

	}

}
