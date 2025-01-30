/**
 * 
 */
package uni;

/**
 * 
 */
public class Student {

	//instance vars here
	private String name;
	private int age;
	private String address;
	private int studentNumber;
	private boolean nerdStatus;
	//constructors here
	
	
	//methods here
	
	
	//getters and setters

	/**
	 * gets the student name 
	 * @return - the name of the student
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * sets the name of the student
	 * name in this.name refers to instance var
	 * @param name - name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * gets the age of a student
	 * @return - the student's age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * sets the age of a student
	 * @param age - the age of the student
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Gets the address of the student
	 * @return - the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * Sets the address of the student
	 * @param address - the student's address
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}


	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}


	/**
	 * @return the nerdStatus
	 */
	public boolean isNerdStatus() {
		return nerdStatus;
	}


	/**
	 * @param nerdStatus the nerdStatus to set
	 */
	public void setNerdStatus(boolean nerdStatus) {
		this.nerdStatus = nerdStatus;
	}
	
}
