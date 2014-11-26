package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeometricalShapes {
	/**
	 * gradientLine is set to an int to avoid issues which might occur with
	 * accuracy when using double.
	 */

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
		super(x1, y1, x2 - x1, y2 - y1, c);
		
	}

	/**
	 * Creates
	 * 
	 * @param f1
	 * @param f2
	 * @param c
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		super();
		xCoord = f1.getX();
		yCoord = f1.getY();
		width = f2.getX() - f1.getX();
		height = f2.getY() - f1.getY();
		color = c;
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
		// TODO Auto-generated method stub

	}

	@Override
	public int getPerimeter() {
		return (int) (Math.sqrt(width * width + height * height));
	}
}
