/**
 * 
 */
package zoo;

/**
 * 
 */
public class Tiger extends Animal {

	private int stripeNumber;

	/**
	 * @return the stripeNumber
	 */
	public int getStripeNumber() {
		return stripeNumber;
	}

	/**
	 * @param stripeNumber the stripeNumber to set
	 */
	public void setStripeNumber(int stripeNumber) {
		this.stripeNumber = stripeNumber;
	}
	
	
	@Override
	public void makeNoise() {
		System.out.println("Tiger Noise: "+this.getNoise());
	}
	
	
}
