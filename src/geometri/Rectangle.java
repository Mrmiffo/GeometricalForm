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
		super(x,y,width,height,c);
	}
	/**
	 * Create a rectangle at the same place as another geometricalForm.
	 * @param f Other geometricalForm.
	 * @param width Width of the rectangle.
	 * @param height Height of the rectangle.
	 * @param c Color of the rectangle.
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f.getX(), f.getY(), width, height, c);
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
			Rectangle temp = (Rectangle)o;
			return 	(temp.getHeight() == this.getHeight() && temp.getWidth() == this.getWidth()) 
					|| 
					(temp.getHeight() == this.getWidth() && temp.getWidth() == this.getHeight());
		} else {
			return false;
		}
	}
	@Override
	public int getArea() {
		return getWidth() * getHeight();
	}
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	@Override
	public int getPerimeter() {
		return 2 * (getWidth() * getHeight());
	}
}
