package unit02;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		int totalNewspapers, pay;
		
		totalNewspapers = Integer.parseInt(JOptionPane.showInputDialog("Enter the total newspapers delivered."));
		
		if (totalNewspapers > 100) {
			pay = (100 * 10) + ((totalNewspapers - 100) * 15);
		} else {
			pay = totalNewspapers * 10;
		}
		
		String message = String.format("Your pay is %d pence.", pay);
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
		
	}

}
