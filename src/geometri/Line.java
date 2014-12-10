package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeometricalShapes {
	private int gradient;
	/**
	 * Creates a line between two coordinates.
	 * 
	 * @param x1
	 *            X coordinate of first point.
	 * @param y1
	 *            Y coordinate of first point.
	 * @param x2
	 *            X coordinate of second point.
	 * @param y2
	 *            Y coordinate of second point.
	 * @param c
	 *            Color of the line.
	 * @throws IllegalPositionException
	 *             Is thrown
	 */
	
	public Line(int x1, int y1, int x2, int y2, Color c)
			throws IllegalPositionException {
		super(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), c);

		gradient = (y2-y1)/(x2-x1);
	}

	public int getGradient(){
		return gradient;
	}
	/**
	 * Creates a line based on the two positions given by two GeometricalForm objects and forwards everything to super
	 * 
	 * @param f1 Takes in geometricalForm as input
	 * @param f2 Takes in geometricalForm as input
	 * @param c Takes in a color that will be the color of the Line
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		super(f1, f2, c);
		
		gradient = (f2.getY()-f1.getY())/(f2.getX()-f1.getX());
		
	}

	/**
	 * Will return true if the line "points" up and false if "down"
	 * 
	 * @return The gradient of the line as a boolean.
	 */
	


	/**
	 * The equals method decides if the two objects are equal
	 * 
	 * @param An object to compare with.
	 * @return Returns true if the two objects have the same width, height and
	 *         type.
	 */
	@Override
	public boolean equals(Object o) {
		if (super.equals(o)) {
			Line temp = (Line) o;
			return temp.getGradient() == this.getGradient();
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
		if(getGradient() < 0){
			
			g.drawLine(getX(), getY()+getHeight(), getX()+getWidth(), getY());
		}else{
		
			g.drawLine(getX(), getY(), getX()+getWidth(), getY()+getHeight());
		}


	}
	@Override
	public int getPerimeter() {
		return (int) (Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight()));
	}
	@Override
	public int hashCode(){
		return super.hashCode() + gradient * 577;
	}
}
