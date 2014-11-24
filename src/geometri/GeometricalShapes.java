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
	protect int buttinthefuck;
	protected int xCoord;
	/**
	 * yCoord is the y coordinate of the GeometricalShape.
	 */
	protected int yCoord;
	/**
	 * The width of the GeometricalShape.
	 */
	protected int width;
	/**
	 * The height of the GeometricalShape.
	 */
	protected int height;
	/**
	 * The color of the GeometricalShape.
	 */
	protected Color color;
	
	/**
	 * Constructor to set the protected variables xCoord, yCoord, width, height and color.
	 * @param xCoord
	 * @param yCoord
	 * @param width
	 * @param height
	 * @param color
	 */
	protected GeometricalShapes(int xCoord, int yCoord, int width, int height, Color color){
		
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract int getArea();
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(GeometricalForm f) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract void fill(Graphics g);
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void move(int dx, int dy) throws IllegalPositionException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract int getPerimeter();
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void place(int x, int y) throws IllegalPositionException {
		// TODO Auto-generated method stub
		
	}

}
