package unit07;

public class Question7 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setHeight(20);
		rec.setWidth(10);
		System.out.println(rec.isSquare());
		
		// Test isSquare() 
		Rectangle rec2 = new Rectangle();
		rec2.setHeight(10);
		rec2.setWidth(10);
		System.out.println(rec2.isSquare());
		
		rec.displayDetails();
		
		// Test increaseHeightBy() method
		rec.increaseHeightBy(5);
		rec.displayDetails();
		
		// Test increaseWidthBy() method
		rec.increaseWidthBy(2);
		rec.displayDetails();
		
		// Test increaseBy() method
		rec.increaseBy(10);
		rec.displayDetails();
	}

}
