package unit07;

import javax.swing.JOptionPane;

public class Question9 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(20, 10);
		Rectangle rec2 = new Rectangle(5, 2);
		Rectangle rec3 = new Rectangle(56, 21);
		Rectangle rec4 = new Rectangle(26, 23);
		Rectangle rec5 = new Rectangle();
		
		String output = String.format("Rectangles created: %d", Rectangle.getNumOfInstances());
		JOptionPane.showMessageDialog(null, output, "Rectangle", JOptionPane.PLAIN_MESSAGE);
	}

}
