/**
 * 
 */
package geography;

import java.util.ArrayList;

/**
 * 
 */
public class MountainSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Mountain m1 = new Mountain("Everest", 929);
		Mountain m2 = new Mountain("Slieve Donard", 50);
		
		ArrayList<Mountain> mountains = new ArrayList<Mountain>();
		
		mountains.add(m1);
		mountains.add(m2);
		
		System.out.println(mountains.size());
		
		displayAllMountainDetails(mountains);
	}

	
	/**
	 * displays all details of mountains in mountain arraylist
	 * @param mountains
	 */
	public static void displayAllMountainDetails(ArrayList<Mountain> mountains) {
		
		for (Mountain mountain : mountains) {
			System.out.println(mountain.getName()+ " is "+mountain.getHeight() +"km high");
			
		}
	}
}
