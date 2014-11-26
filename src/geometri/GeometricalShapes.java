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
	protected GeometricalShapes(int xCoord, int yCoord, int width, int height, Color color) throws IllegalPositionException{
		if (xCoord < 0 || yCoord < 0){
			throw new IllegalPositionException("X or Y coordinates are less than 0");
		} else {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
			this.width = width;
			this.height = height;
			this.color = new Color(color.getRed(),color.getGreen(),color.getBlue());
		}
	}
	
	protected GeometricalShapes(GeometricalForm gf, int width, int height, Color color) {
		this.xCoord = gf.getX();
		this.yCoord = gf.getY();
		this.width = width;
		this.height = height;
		this.color = new Color(color.getRed(),color.getGreen(),color.getBlue());
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
		if (this.getArea() == f.getArea() && this.getPerimeter() == f.getPerimeter()){
			return 0;
		} else if (this.getArea() == f.getArea()){
			return this.getPerimeter() - f.getPerimeter();
		} else {
			return this.getArea() - f.getArea();
		}
		
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
		return new Color(color.getRed(), color.getGreen(),color.getBlue());
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getWidth() {
		return width;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getHeight() {
		return height;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		return xCoord;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		return yCoord;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void move(int dx, int dy) throws IllegalPositionException {
		if (xCoord +dx < 0 || yCoord + dy < 0){
			throw new IllegalPositionException("New X or Y coordinates are less than 0");
		} else {
			xCoord += dx;
			yCoord += dy;
		}
		
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
		if (x < 0 || y < 0){
			throw new IllegalPositionException("X or Y value less than 0");
		} else {
			xCoord = x;
			yCoord = y;
		}
	}

}
