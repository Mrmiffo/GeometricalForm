package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends GeometricalShapes{

	/**
	 * Creates a Square at the given coordinates with the given color and size.
	 * @param x X coordinate.
	 * @param y Y coordinate
	 * @param side Size.
	 * @param c Color.
	 * @throws IllegalPositionException Is thrown if any of the X or Y coordinates are negative.
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException{
		super(x,y,side,side,c);
		
	}
	/**
	 * Creates a square at the same position as another GeometrialForm.
	 * @param f Other geometricalForm
	 * @param side Size of the square.
	 * @param c Color of the square.
	 */
	public Square(GeometricalForm f, int side, Color c){
		super(f, side, side, c);
	}

	
	/** 
	 * The equals method decides if the two objects are equal
	 * @param An object to compare with.
	 * @return Returns true if the two objects have the same width, height and type.
	 */
	@Override
	public boolean equals(Object o){
		if (o == this){
			return true;
		} else if (o == null){
			return false;
		} else if (o.getClass() == this.getClass()) {
			Square temp = (Square)o;
			return 	(temp.getHeight() == this.getHeight() && temp.getWidth() == this.getWidth()) 
					|| 
					(temp.getHeight() == this.getWidth() && temp.getWidth() == this.getHeight());
		} else {
			return false;
		}
		
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
		return 2 * (getWidth() * getHeight());
	}

}
