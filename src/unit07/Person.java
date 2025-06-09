package unit07;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person() {
		this("unknown", 0, "unknown");
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Person(String name, int age) {
		this(name, age, "unknown");
	}
	
	public Person (String name, String address) {
		this(name, 0, address);
	}
	
	public Person(int age) {
		this("unkown", age, "unknown");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String toString() {
		return String.format("My name is %s and I am %d years old. I live in %s.", 
				this.name, this.age, this.address);
	}
	
	public void printDetails() {
		JOptionPane.showMessageDialog(null, this.toString(), 
				"Details", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void happyBirthday() {
		this.age++;
	}
}
