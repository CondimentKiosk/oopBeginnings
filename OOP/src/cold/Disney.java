/**
 * 
 */
package cold;

/**
 * 
 */
public class Disney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Snowman snowman1 = new Snowman();
		snowman1.setName("Frosty");
		System.out.println(snowman1.getName());

		
		Snowman snowman2 = new Snowman("Jack");
		System.out.println(snowman2.getName());
	}

}
