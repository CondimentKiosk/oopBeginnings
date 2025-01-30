/**
 * 
 */
package zoo;

/**
 * 
 */
public class Flamingo extends Animal {

	private String colour;

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Flamingo Noise: "+this.getNoise());
	}
	
}
