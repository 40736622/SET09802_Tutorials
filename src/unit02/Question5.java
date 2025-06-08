package unit02;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		int totalNewspapers, pay;
		
		totalNewspapers = Integer.parseInt(JOptionPane.showInputDialog("Enter the total newspapers delivered."));
		
		if (totalNewspapers > 150) {
			pay = (100 * 10) + (50 * 15) + ((totalNewspapers - 150) * 20);
		} else if (totalNewspapers > 100) {
			pay = (100 * 10) + ((totalNewspapers - 100) * 15);
		} else {
			pay = totalNewspapers * 10;
		}
		
		String message = String.format("Your pay is %d pence.", pay);
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
