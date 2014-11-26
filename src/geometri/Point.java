package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends GeometricalShapes{
	/**
	 * Creates a point at a given coordinate.
	 * @param x X coordinate.
	 * @param y Y coordinate.
	 * @param c Color of the point.
	 * @throws IllegalPositionException Thrown if the X or Y coordinates are negative.
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{
		
	}
	/**
	 * Creates a point at the same place as another GeometricalForm.
	 * @param f Other geometricalForm.
	 * @param c The color of the point.
	 */
	public Point(GeometricalForm f, Color c){
		
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
		return 0;
	}
	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getPerimeter() {
		return 0;
	}
}
