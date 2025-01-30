/**
 * 
 */
package zoo;

/**
 * 
 */
public class ZooManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		
		Animal animal = new Animal();
		animal.setName("Clifford");
		animal.setEyeColour("Black");
		animal.setNoise("Bark");
		animal.makeNoise();
		

		Tiger tiger = new Tiger();
		tiger.setName("Raul");
		tiger.setNoise("Rar");
		tiger.setStripeNumber(60);
		tiger.makeNoise();
		
		Flamingo flamingo = new Flamingo();
		flamingo.setName("Tam");
		flamingo.setNoise("SQuah");
		flamingo.setColour("Pink");
		flamingo.makeNoise();
		
		
		
	}

}
