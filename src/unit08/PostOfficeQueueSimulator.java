package unit08;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class PostOfficeQueueSimulator {
	private LinkedList<Person> postOfficeQueue = new LinkedList<Person>();
	
	public PostOfficeQueueSimulator() {}
	
	public void add(Person person) {
		this.postOfficeQueue.addLast(person);
	}
	
	public void serve() {
		this.postOfficeQueue.removeFirst();
	}
	
	public int queueLength() {
		return this.postOfficeQueue.size();
	}
	
	public void printQueue() {
		String output = "People currently in the queue:\n";
		for (Person person : postOfficeQueue) {
			output += String.format("%s\n", person.getName());
		}
		
		JOptionPane.showMessageDialog(null, output, "Queue", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void whoseAt(int index) {
		Person personAt = this.postOfficeQueue.get(index);
		String output = String.format("This person at position %d is %s", index, personAt.getName());
		JOptionPane.showMessageDialog(null, output, "Person At", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void whoseAtFront() {
		Person personAtFront = this.postOfficeQueue.peekFirst();
		String output = String.format("This person at the front is %s", personAtFront.getName());
		JOptionPane.showMessageDialog(null, output, "Person At Front", JOptionPane.INFORMATION_MESSAGE);
	}
}
