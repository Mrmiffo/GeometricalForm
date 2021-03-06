package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GeometricalShapes{
	/**
	 * Creates an oval at the given coordinates.
	 * @param x X coordinate.
	 * @param y Y coordinate.
	 * @param width Width of the oval.
	 * @param height Height of the oval.
	 * @param c Color of the oval.
	 * @throws IllegalPositionException Is thrown if any of the X or Y coordinates are negative.
	 */
	
	private final double PI_CONSTANT = 3.14;
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,width,height,c);
		
	}
	/**
	 * Creates an oval at the same place as another GeometricalForm.
	 * @param f Other GemoetricalForm.
	 * @param width Width of the oval.
	 * @param height Height of the oval.
	 * @param c COlor of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		super(f,width,height,c);
	}


	@Override
	public int getArea() {
		
		return (int) (PI_CONSTANT*(getWidth()/2.0)*(getHeight()/2.0));
	}
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	@Override
	public int getPerimeter() {
		
		return (int)(PI_CONSTANT*(3*(getWidth()/2.0 + getHeight()/2.0)-Math.sqrt((3*(getWidth()/2.0+getHeight()/2.0)*(getWidth()/2.0+3*(getHeight()/2.0))))));
	}
	@Override
	public int hashCode(){
		return super.hashCode()*1597;
	}
}
