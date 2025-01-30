package bookclub;

public class Book {

	private String name;
	private Genre genre;

	// default constructor
	public Book() {

	}

	/**
	 * @param name
	 * @param genre
	 */
	public Book(String name, Genre genre) {
		this.name = name;
		this.genre = genre;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
