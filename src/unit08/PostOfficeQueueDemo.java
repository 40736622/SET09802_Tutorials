package unit08;

import javax.swing.JOptionPane;

public class PostOfficeQueueDemo {

	public static void main(String[] args) {
		PostOfficeQueueSimulator postOfficeQueue = new PostOfficeQueueSimulator();
		
		Person p1 = new Person("James", 23, "Mexico city");
		Person p2 = new Person("Norm", 54, "Arizona");
		Person p3 = new Person("Saul", 34, "New Mexico");
		Person p4 = new Person("Kim", 32, "New Mexico");
		
		postOfficeQueue.add(p1);
		postOfficeQueue.add(p2);
		postOfficeQueue.add(p3);
		postOfficeQueue.add(p4);
		
		postOfficeQueue.printQueue();
		postOfficeQueue.whoseAtFront();
		postOfficeQueue.whoseAt(2);
		
		postOfficeQueue.serve();
		JOptionPane.showMessageDialog(null, "Number of people left: " + postOfficeQueue.queueLength(), 
				"Remaining people", JOptionPane.INFORMATION_MESSAGE);
		postOfficeQueue.printQueue();
		postOfficeQueue.whoseAtFront();
	}

}
