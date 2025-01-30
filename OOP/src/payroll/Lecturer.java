/**
 * 
 */
package payroll;

/**
 * 
 */
public class Lecturer extends Staff {

	
	private String name;
	
	/**
	 * @param name
	 */
	public Lecturer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void payUp() {
		System.out.println("Lecturer getting £30/hr");
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

	
	
}
