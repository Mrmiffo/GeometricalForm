package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GeometricalShapes{

	/**
	 * Creates a rectangle at the given coordinates.
	 * @param x X coordinate.
	 * @param y Y coordinate.
	 * @param width Width of the rectangle.
	 * @param height Height of the rectangle.
	 * @param c Color of the rectangle.
	 * @throws IllegalPositionException Is thrown if any of the X or Y coordinates are negative.
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		
	}
	/**
	 * Create a rectangle at the same place as another geometricalForm.
	 * @param f Other geometricalForm.
	 * @param width Width of the rectangle.
	 * @param height Height of the rectangle.
	 * @param c Color of the rectangle.
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		
	}
	
	/** 
	 * The equals method decides if the two objects are equal
	 * @param An object to compare with.
	 * @return Returns true if the two objects have the same width, height and type.
	 */
	@Override
	public boolean equals(Object o){
		return false;
		
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
