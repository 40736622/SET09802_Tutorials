package unit07;

import javax.swing.JOptionPane;

public class Rectangle {
	private int height;
	private int width;
	private static int numOfInstances = 0;
	
	public Rectangle() {
		this(1, 1);
	}
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		numOfInstances++;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public static int getNumOfInstances() {
		return numOfInstances;
	}
	
	public boolean isSquare() {
		return this.height == this.width;
	}
	
	public void increaseHeightBy(int aY) {
		this.height += aY;
	}
	
	public void increaseWidthBy(int anX) {
		this.width += anX;
	}
	
	public void increaseBy(int aValue) {
		increaseHeightBy(aValue);
		increaseWidthBy(aValue);
	}
	
	public int getPerimeter() {
		return 2 * (this.height + this.width);
	}
	
	public int getArea() {
		return this.height * this.width;
	}
	
	public void displayDetails() {
		String details = String.format("This rectangle has an area of %d and a perimeter of %d.", 
				getArea(), getPerimeter());
		
		JOptionPane.showMessageDialog(null, details, "Rectangle", JOptionPane.PLAIN_MESSAGE);
	}
	
}
