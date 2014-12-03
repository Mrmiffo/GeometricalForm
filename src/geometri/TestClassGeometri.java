package geometri;

import java.awt.Color;

public class TestClassGeometri {

	public static void main(String[] args) throws IllegalPositionException {
		Circle a = new Circle(20,40,100,Color.RED);
		Circle b = new Circle(0,0,100,Color.RED);
		
		Rectangle c = new Rectangle(0,0,20,20,Color.BLACK);
		Square d = new Square(5,10,20,Color.CYAN);
		
		Point test1 = new Point(0,0,Color.BLACK);
		Point test2 = new Point(500,500,Color.WHITE);
		Point test3 = new Point(30,30, Color.BLACK);
		Point test4 = new Point(test1,Color.BLACK);
		
		Line q = new Line(a,b,Color.RED);
		Line w = new Line (20,40,0,0,Color.RED);
		
		System.out.println(q.getGradient()+","+w.getGradient());
		
		System.out.println(q.equals(w));
		System.out.println(q.getWidth() + " " + q.getHeight());
		System.out.println(w.getWidth() + " " + w.getHeight());
	}

}
