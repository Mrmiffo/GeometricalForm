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
	/**
	 * Constructor which will create a GeometricalForm at the same position as another GeometricalForm.
	 * @param gf Other geometricalForm
	 * @param width Width of the new form.
	 * @param height Height of the new form.
	 * @param color Color of the new form.
	 */
	protected GeometricalShapes(GeometricalForm gf, int width, int height, Color color) {
		this.xCoord = gf.getX();
		this.yCoord = gf.getY();
		this.width = width;
		this.height = height;
		this.color = new Color(color.getRed(),color.getGreen(),color.getBlue());
	}
	
	/**
	 * Constructor which will create a GeometricalForm with the width set to the difference in X coordinates between two other shapes, and the height set to the difference in Y coordinates between the two shapes.
	 * X and Y coordinates will be the same as of the first GeometricalForm.
	 * @param f1 First GeometricalForm.
	 * @param f2 Second GeometricalForm
	 * @param color Color of the new form.
	 */
	public GeometricalShapes(GeometricalForm f1, GeometricalForm f2, Color color){
		xCoord = f1.getX();
		yCoord = f1.getY();
		width = Math.abs(f1.getX()-f2.getX());
		height = Math.abs(f1.getY()-f2.getY());
		this.color = new Color(color.getRed(),color.getGreen(),color.getBlue());

	}
	
	@Override
	public abstract int getArea();
	
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
	
	@Override
	public abstract void fill(Graphics g);
	
	@Override
	public Color getColor() {
		return new Color(color.getRed(), color.getGreen(),color.getBlue());
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	
	@Override
	public int getHeight() {
		return height;
	}
	
	@Override
	public int getX() {
		return xCoord;
	}
	
	@Override
	public int getY() {
		return yCoord;
	}
	
	@Override
	public void move(int dx, int dy) throws IllegalPositionException {
		if (xCoord +dx < 0 || yCoord + dy < 0){
			throw new IllegalPositionException("New X or Y coordinates are less than 0");
		} else {
			xCoord += dx;
			yCoord += dy;
		}
		
	}
	
	@Override
	public abstract int getPerimeter();
	
	@Override
	public void place(int x, int y) throws IllegalPositionException {
		if (x < 0 || y < 0){
			throw new IllegalPositionException("X or Y value less than 0");
		} else {
			xCoord = x;
			yCoord = y;
		}
	}
	@Override
	public int hashCode(){
		return xCoord*1523 + yCoord*1531 + width*1543 + height*1553+ color.hashCode()*1559;
	}

	@Override
	public boolean equals(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof GeometricalShapes){
			GeometricalShapes temp = (GeometricalShapes) o;
			return (temp.getWidth() == this.getWidth() && temp.getHeight() == this.getHeight())
					&& o.getClass() == this.getClass() && temp.getColor().equals(this.getColor());
			
		} else {
			return false;
		}
	}
}
