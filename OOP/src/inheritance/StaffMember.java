/**
 * 
 */
package inheritance;

/**
 * 
 */
public class StaffMember {

	private String firstName;
	private String lastName;
	
	
	/**
	 * default constructor
	 */
	public StaffMember() {
		System.out.println("Entering In Staff Details");
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public StaffMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "StaffMember [First Name = " + firstName + ", Last Name = " + lastName + "]";
	}
	
	
	
	
	
	
	
	
}
