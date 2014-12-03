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
		super(f, width, height, c);
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
		return 2 * (getWidth() + getHeight());
	}
	@Override
	public int hashCode(){
		return super.hashCode()*1607;
	}
}
