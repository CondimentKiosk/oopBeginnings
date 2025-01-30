/**
 * 
 */
package arsenal;

/**
 * represents a footballer 
 */
public class Footballer {
	
	//instance vars
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private int playerNumber;
	
	
	//constructors
	
	/**
	 * default constructor
	 */
	public Footballer() {
		System.out.println("In the constructor making a footballer");
		
	}
	
	
	
	/**
	 * creates a footballer with given values
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param playerNumber
	 */
	public Footballer(String firstName, String lastName, int employeeNumber, int playerNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.setPlayerNumber(playerNumber);
	}



	//methods
	
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
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	/**
	 * @return the playerNumber
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}
	/**
	 * @param playerNumber the playerNumber to set
	 */
	public void setPlayerNumber(int playerNumber) {
		if(playerNumber >=0 && playerNumber <=32) {
		this.playerNumber = playerNumber;
		} else {
			System.out.println("Player Number outside operating range, default set to -1");
			this.playerNumber = -1;
		}
	}


	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", playerNumber=" + playerNumber + "]";
	}
	
	
	
	
	

}
