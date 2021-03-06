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
		return 2 * (getWidth() + getHeight());
	}
	@Override
	public int hashCode(){
		return super.hashCode()*1609;
	}

}
