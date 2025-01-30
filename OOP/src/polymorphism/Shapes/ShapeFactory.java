/**
 * 
 */
package polymorphism.Shapes;

/**
 * 
 */
public class ShapeFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Circle c1 = new Circle();
		c1.setRadius(5);
		Rectangle r1 = new Rectangle(5, 10);
	
		
		Shape[] allShapes = { c1, r1 };
		
		calculateShapeAreas(allShapes);
	}

	
	
	/**
	 * Takes each shape in the array and prints out the area of the shape(s)
	 * @param shapes
	 */
	public static void calculateShapeAreas(Shape[] shapes) {

		for (Shape shape : shapes) {
			shape.area();
		}
	}

}
