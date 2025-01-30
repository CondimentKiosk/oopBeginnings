/**
 * 
 */
package payroll;

/**
 * 
 */
public class PayrollManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//Staff staff = new Staff();
		Lecturer lecturer = new Lecturer("BOB");
		
		//Staff lecturer2 = lecturer;
		// lecturer2 is staff reference rather than lecturer (UPCAST)
		
		//Lecturer lecturer3 = (Lecturer) lecturer2;
		//turning lecturer back into the lecturer class to access lecturer pay (DOWNCAST)
		
		Staff s1 = new Staff();
		Lecturer l1 = new Lecturer("Liz");
		Professor p1 = new Professor();
		Administrator a1 = new Administrator();
		
		Staff[] allStaff = { s1, l1, p1, a1, lecturer};
		
		payAll(allStaff);
		
		
		
	}

	public static void payAll(Staff[] staff) {
		
		System.out.println("Paying all");
		
		for (Staff s : staff) {
			s.payUp();
			
			if(s instanceof Lecturer) {
				System.out.println("Lecturer pay incoming");
				Lecturer newLecturer = (Lecturer)s;
				System.out.println(newLecturer.getName()+" has been paid");
			} else {
				
			}
		}
		
		System.out.println("Paid all");
	}
	
}


// the idea that multiple objects, with different properties, can be classified under one overall object. e.g. football, rugby, hockey. ALl sports but use different balls
// different team sizes. Can all be instantiated as sports but classified as different objects.
// compile - overloaded methods
// e.g. system.out.println() is an overloaded method - can print multiple different value types
// runtime - dynamic method dispatch 