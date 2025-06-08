package unit01;

import javax.swing.JOptionPane;

public class Question6 {
	
	static double celsiusToFahrenheit(float temperature) {
		return temperature * (9.0 / 5.0) + 32;
	}

	public static void main(String[] args) {
		float temperature;
		
		temperature = Float.parseFloat(JOptionPane.showInputDialog("Enter a temperature in Celsius."));
		
		String result = String.format("%.2f\u00B0 Celsius converted to Fahrenheit is %.2f\u00B0.", 
				temperature, celsiusToFahrenheit(temperature));
		
		JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.PLAIN_MESSAGE);
	}

}
