/**
 * 
 */
package arsenal;

/**
 * 
 */
public class ClubAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// first footballer object
		Footballer f1 = new Footballer();
		System.out.println();
		f1.setFirstName("Katie");
		f1.setLastName("McCabe");
		f1.setPlayerNumber(35);
		f1.setEmployeeNumber(123456);

		System.out.println(f1.getFirstName());
		System.out.println(f1.getLastName());
		System.out.println(f1.getPlayerNumber());
		System.out.println(f1.getEmployeeNumber());

		System.out.println(f1.toString());

		Footballer f2 = new Footballer("George","Best", 12, 34);
		System.out.println(f2.toString());
		
	}

}
