/**
 * 
 */
package polymorphism.Overloading;

/**
 * 
 */
public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		addNumbers(2, 8);
		addNumbers(3, 4, 5);
	
		System.out.println();
	}
	
	
	public static void addNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
