/**
 * 
 */
package zoo;

/**
 * 
 */
public class Animal {

	private String name;
	private String eyeColour;
	private String noise;
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
	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}
	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}
	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public void makeNoise() {
		System.out.println("Animal noise: "+this.noise);
	}
	
}
