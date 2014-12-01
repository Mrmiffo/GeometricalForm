package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GeometricalShapes {

	private final double PI_CONSTANT = 3.14;
	/**
	 * Created a filled circle with the given diameter at the specific coordinates.
	 * @param x X coordinates
	 * @param y Y coordinates
	 * @param diameter Size of the circle.
	 * @param c Color of the circle.
	 * @throws IllegalPositionException Is thrown if any of the coordinates X or Y are negative.
	 */
	

	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException{
		
	}
	 
	/**
	 * Creates a filled circle with the given diameter at the same place as another GeometricalForm.
	 * @param f Other GeometricalForm which will define the position of the circle.
	 * @param diameter The diameter of the circle
	 * @param c Color of the circle.
	 */
	public Circle(GeometricalForm f, int diameter, Color c){
		
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
