/**
 * 
 */
package geography;

/**
 * 
 */
public class Lough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LoughDetails lough1 = new LoughDetails();
		lough1.setName("Lough Neagh");
		lough1.setArea(392.6);
		lough1.setVolume(3);
		System.out.println("Name: "+lough1.getName());
		System.out.println("Area: "+lough1.getArea()+" km2");
		System.out.println("Volume "+lough1.getVolume()+" km3");
		
		System.out.println();
		
		LoughDetails lough2 = new LoughDetails();
		lough2.setName("Lough Beg");
		lough2.setArea(23.2);
		lough2.setVolume(1);
		System.out.println("Name: "+lough2.getName());
		System.out.println("Area: "+lough2.getArea()+" km2");
		System.out.println("Volume "+lough2.getVolume()+" km3");
	}

}
