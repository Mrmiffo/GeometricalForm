package geometri;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Lab 2 Part 1. Headers for all classes, methods and variables. 
 * @author Anton Strandman && Maxim Goretskyy
 *
 */
public abstract class GeometricalShapes implements GeometricalForm {
	/**
	 * xCoord is the x coordinate of the GeometricalShape.
	 */
	private int xCoord;
	/**
	 * yCoord is the y coordinate of the GeometricalShape.
	 */
	private int yCoord;
	/**
	 * The width of the GeometricalShape.
	 */
	private int width;
	/**
	 * The height of the GeometricalShape.
	 */
	private int height;
	/**
	 * The color of the GeometricalShape.
	 */
	private Color color;
	
	/**
	 * Constructor to set the protected variables xCoord, yCoord, width, height and color.
	 * @param xCoord
	 * @param yCoord
	 * @param width
	 * @param height
	 * @param color
	 */
	protected GeometricalShapes(int xCoord, int yCoord, int width, int height, Color color) throws IllegalPositionException{

	}
	/**
	 * Constructor which will create a GeometricalForm at the same position as another GeometricalForm.
	 * @param gf Other geometricalForm
	 * @param width Width of the new form.
	 * @param height Height of the new form.
	 * @param color Color of the new form.
	 */
	protected GeometricalShapes(GeometricalForm gf, int width, int height, Color color) {

	}
	
	/**
	 * Constructor which will create a GeometricalForm with the width set to the difference in X coordinates between two other shapes, and the height set to the difference in Y coordinates between the two shapes.
	 * @param f1 First GeometricalForm.
	 * @param f2 Second GeometricalForm
	 * @param color Color of the new form.
	 */
	public GeometricalShapes(GeometricalForm f1, GeometricalForm f2, Color color){

	}
	
	@Override
	public abstract int getArea();
	
	@Override
	public int compareTo(GeometricalForm f) {
		return 0;
	}
	
	@Override
	public abstract void fill(Graphics g);
	
	@Override
	public Color getColor() {
		return color;
	}
	
	@Override
	public int getWidth() {
		return 0;
	}
	
	@Override
	public int getHeight() {
		return 0;
	}
	
	@Override
	public int getX() {
		return 0;
	}
	
	@Override
	public int getY() {
		return 0;
	}
	
	@Override
	public void move(int dx, int dy) throws IllegalPositionException {

	}
	
	@Override
	public abstract int getPerimeter();
	
	@Override
	public void place(int x, int y) throws IllegalPositionException {

	}
	@Override
	public int hashCode(){
		return 0;
	}

	@Override
	public boolean equals(Object o){
		return false;
	}
}
