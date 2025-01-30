/**
 * 
 */
package inheritance;

/**
 * 
 */
public class Janitor extends StaffMember {

	// Our variables set for Janitors for encapsulation
	private String hospitalSection;
	private int employeeNumber;

	// This is the getter for the hospital section that the Janitor is responsible
	// for cleaning
	public String getHospitalSection() {
		return hospitalSection;
	}

	// This sets the section of the hospital the Janitor cleans
	public void setHospitalSection(String hospitalSection) {
		this.hospitalSection = hospitalSection;
	}

	// This gets the Janitors employees number
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	// This i sets the Employee's Number
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "Janitor [Hospital Section = " + hospitalSection + ", First Name = " + getFirstName() + ", Last Name = " + getLastName() + "]";
	}

}
