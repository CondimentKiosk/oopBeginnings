/**
 * 
 */
package bookclub;

import java.util.ArrayList;

/**
 * 
 */
public class BookclubSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book b1 = new Book("Catch 22", Genre.HUMOUR);
		Book b2 = new Book("Catcher in the rye", Genre.THRILLER );
		Book b3 = new Book("Peter Kay", Genre.HUMOUR);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		searchByGenre(books, Genre.HUMOUR);
		
	}
	
	
	public static void searchByGenre(ArrayList<Book> books, Genre genre) {
		
		for (Book book : books) {
			
			if (book.getGenre()==genre) {
				System.out.println(book.getName());
			}
		}
		
	}

}
