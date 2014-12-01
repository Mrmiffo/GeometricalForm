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

	}

	/**
	 * Creates a line based on the two positions given by two GeometricalForm objects and forwards everything to super
	 * 
	 * @param f1 Takes in geometricalForm as input
	 * @param f2 Takes in geometricalForm as input
	 * @param c Takes in a color that will be the color of the Line
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		
	}

	/**
	 * Will return the gradient of the line as an int.
	 * 
	 * @return The gradient of the line as an int.
	 */
	
	public int getGradient() {
		

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
		return false;

	}

	@Override
	public int getArea() {

		return 0;
	}

	@Override
	public void fill(Graphics g) {


	}

	@Override
	public int getPerimeter() {
		return 0;
	}
	@Override
	public int hashCode(){
		return 0;
	}
}
