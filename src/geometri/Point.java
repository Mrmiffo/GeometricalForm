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
	@Override
	public int hashCode(){
		return super.hashCode()*1601;
	}
}
