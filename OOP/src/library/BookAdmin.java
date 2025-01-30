/**
 * 
 */
package library;

/**
 * 
 */
public class BookAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Book b1 = new Book();
		b1.settitle("To Kill a Mockingbird");
		System.out.println(b1.toString());
		
		Book b2 = new Book();
		b2.settitle("Catch 22");
		System.out.println(b2.toString());
		
		Book b3 = new Book("Dracula");
		System.out.println(b3);
		Book b4 = new Book("Java in a nutshell");
		System.out.println(b4);
	}

}
