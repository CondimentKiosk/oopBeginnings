/**
 * 
 */
package library;

/**
 * 
 */
public class Book {

	private String title;
	
	/**
	 * default constructor
	 */
	public Book() {
		System.out.println("Creating book object");
	}
	
	/**
	 * creates a book
	 * @param title
	 */
	public Book(String title) {
		this.title = title;
	}
	

	/**
	 * @return the bookTitle
	 */
	public String gettitle() {
		return title;
	}

	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void settitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
}
