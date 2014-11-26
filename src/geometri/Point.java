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
		super(x,y,0,0,c);
	}
	/**
	 * Creates a point at the same place as another GeometricalForm.
	 * @param f Other geometricalForm.
	 * @param c The color of the point.
	 */
	public Point(GeometricalForm f, Color c){
		super(f,0,0,c);
		
	}
	
	/** 
	 * The equals method decides if the two objects are equal
	 * @param An object to compare with.
	 * @return Returns true if the two objects have the same width, height and type.
	 */
	@Override
	public boolean equals(Object o){
		if (o == this){
			return true;
		} else if (o == null){
			return false;
		} else if (o.getClass() == this.getClass()) {
			Point temp = (Point)o;
			return 	(temp.getX() == this.getX() && temp.getY() == temp.getY());
		} else {
			return false;
		}
		
	}
	@Override
	public int getArea() {
		return 0;
	}
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	@Override
	public int getPerimeter() {
		return 0;
	}
}
