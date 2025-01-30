/**
 * 
 */
package inheritance;

/**
 * 
 */
public class Nurse extends StaffMember {

	
	private String specialNursingUnit;

	/**
	 * @return the specialNursingUnit
	 */
	public String getSpecialNursingUnit() {
		return specialNursingUnit;
	}

	/**
	 * @param specialNursingUnit the specialNursingUnit to set
	 */
	public void setSpecialNursingUnit(String specialNursingUnit) {
		this.specialNursingUnit = specialNursingUnit;
	}

	@Override
	public String toString() {
		return "Nurse [Special Nursing Unit = " + specialNursingUnit + ", First Name = " + getFirstName()
				+ ", Last Name = " + getLastName() + "]";
	}
	
	
}
