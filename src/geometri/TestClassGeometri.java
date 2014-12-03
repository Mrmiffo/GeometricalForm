package geometri;

import java.awt.Color;

public class TestClassGeometri {

	public static void main(String[] args) throws IllegalPositionException {
		Circle a = new Circle(20,40,100,Color.RED);
		Circle b = new Circle(0,0,100,Color.RED);
		
		Rectangle c = new Rectangle(0,0,20,20,Color.BLACK);
		Square d = new Square(5,10,20,Color.CYAN);
		
		System.out.println(a.equals(b));
	}

}
