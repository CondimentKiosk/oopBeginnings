/**
 * 
 */
package firstOOP;

/**
 * 
 */
public class ChatBot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Chatbot starting up.");

		MessageGenie messageGenie = new MessageGenie();
		messageGenie.morningGreeting();
		messageGenie.afternoonGreeting();
		messageGenie.eveningGreeting();
		messageGenie.goodnightGreeting();
		
		
		System.out.println("Chatbot shutting down.");
		
	}

}
