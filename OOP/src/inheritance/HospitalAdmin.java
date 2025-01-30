/**
 * 
 */
package inheritance;

/**
 * 
 */
public class HospitalAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Creating a staff member");
		StaffMember staffMember = new StaffMember();
		staffMember.setFirstName("Mr");
		staffMember.setLastName("White");
		System.out.println(staffMember.toString());
		
		Doctor doctor = new Doctor();
		doctor.setWard(5);
		doctor.setLastName("Doom");
		doctor.setFirstName("Dr");
		System.out.println(doctor.toString());
		
		Programmer programmer = new Programmer();
		programmer.setFirstName("Name.");
		programmer.setLastName("newName");
		programmer.setLanguage("Java");
		System.out.println(programmer.toString());
		
		Nurse nurse = new Nurse();
		nurse.setFirstName("Nurse");
		nurse.setLastName("Night");
		nurse.setSpecialNursingUnit("Hearts");
		System.out.println(nurse.toString());
		
		Janitor janitor = new Janitor();
		janitor.setFirstName("Jim");
		janitor.setLastName("Kewn");
		janitor.setHospitalSection("First Floor");
		janitor.setEmployeeNumber(1983);
		System.out.println(janitor.toString());
		
		StaffMember staffMember2 = new StaffMember("Finn", "Garbuckle");
		System.out.println(staffMember2.toString());
		
		Programmer programmer2 = new Programmer("B", "G", "Python");
		System.out.println(programmer2.toString());
		
		Doctor doctor2 = new Doctor("Dr", "Death", 20);
		System.out.println(doctor2.toString());
		
	}

}
