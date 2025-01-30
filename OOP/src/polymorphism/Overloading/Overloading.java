/**
 * 
 */
package polymorphism.Overloading;

/**
 * 
 */
public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		square(5);
		square(2.5);
		
	}

	public static void square(int a) {
		System.out.println(a*a);
	}
	
	public static void square(double d) {
		System.out.println(d*d);
	}
	
}
