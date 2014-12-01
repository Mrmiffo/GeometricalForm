package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GeometricalShapes{
	private final double PI_CONSTANT = 3.14;
	/**
	 * Creates an oval at the given coordinates.
	 * @param x X coordinate.
	 * @param y Y coordinate.
	 * @param width Width of the oval.
	 * @param height Height of the oval.
	 * @param c Color of the oval.
	 * @throws IllegalPositionException Is thrown if any of the X or Y coordinates are negative.
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		
		
	}
	/**
	 * Creates an oval at the same place as another GeometricalForm.
	 * @param f Other GemoetricalForm.
	 * @param width Width of the oval.
	 * @param height Height of the oval.
	 * @param c COlor of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		
	}

	/** 
	 * The equals method decides if the two objects are equal
	 * @param An object to compare with.
	 * @return Returns true if the two objects have the same width, height and type.
	 */
	@Override
	public boolean equals(Object o){

			return false;
		}
		
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
