/**
 * 
 */
package inheritance;

/**
 * 
 */
public class Programmer extends StaffMember {

	private String language;


	public Programmer() {
		
	}

	public Programmer(String firstName, String lastName, String language) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.language = language;
		
	}
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "Programmer [Language = " + language + ", First Name = " + getFirstName() + ", Last Name = "
				+ getLastName() + "]";
	}
}
