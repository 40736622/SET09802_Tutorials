package unit07;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("John", 22, "Edinburgh");
				
		// happyBirthday method implementation (Question 3)
		p1.happyBirthday();
		p1.printDetails();
		
		// Array that holds 3 Person objects (Question 4)
		Person[] persons = new Person[3];
		
		persons[0] = new Person("Howard", 32, "Barcelona");
		persons[1] = new Person("Jane", 25, "Arizona");
		persons[2] = new Person("Jeff", 34, "Mexico city");
		
		for (int i = 0; i < persons.length; i++) {
			persons[i].printDetails();
		}
		
		// Constructor with name and age (Question 5)
		Person p2 = new Person("Tom", 23);
		p2.printDetails();
		
		// Constructor with name and address (Question 5)
		Person p3 = new Person("Chuck", "New Mexico");
		p3.printDetails();
		
		// Constructor with age (Question 5)
		Person p4 = new Person(43);
		p4.printDetails();
		
		// Constructor with no parameters (Question 6)
		Person p5 = new Person();
		p5.printDetails();
	}

}
