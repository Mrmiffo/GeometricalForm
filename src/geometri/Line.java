package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeometricalShapes {
	/**
	 * gradientLine is set to an int to avoid issues which might occur with
	 * accuracy when using double.
	 */
private int x1, y1, x2, y2;
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
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * Creates
	 * 
	 * @param f1
	 * @param f2
	 * @param c
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		super(f1, f2, c);
	}

	/**
	 * Will return the gradient of the line as an int.
	 * 
	 * @return The gradient of the line as an int.
	 */
	
	public int getGradient() {
		return (int) (getHeight() / getWidth());

	}

	/**
	 * The equals method decides if the two objects are equal
	 * 
	 * @param An
	 *            object to compare with.
	 * @return Returns true if the two objects have the same width, height and
	 *         type.
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (o == null) {
			return false;
		} else if (o.getClass() == this.getClass()) {
			Line temp = (Line) o;
			return (temp.getGradient() == this.getGradient() && temp.getPerimeter() == this.getPerimeter());
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
		g.drawLine(x1,y1, x2,y2);

	}

	@Override
	public int getPerimeter() {
		return (int) (Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight()));
	}
}
