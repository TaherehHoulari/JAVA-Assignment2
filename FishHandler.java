import java.io.IOException;
/**
* Assignment 2
* @author SeyedehTahereh Houlari 
* * @see IOException
* @version 1.0
* @since 11
*/
public class FishHandler {
/**
 * Method easterEnding() 
 * @throws Exception throws new Exception
 */
	public static void easterEnding() throws Exception {
		throw new Exception("Exception thrown in easterEnding");
	}
	/**
	 * Method easterStarting() 
	 * @throws Exception throws Exception
	 */
	public void easterStarting() throws Exception {

		try {
			easterEnding();
		} catch (Exception exception) {
			throw exception;
		}
	}
	/**
	 * Main method of the FishHandler class
	 * @param args are not used
	 */
	public static void main(String[] args) {
		try {
			FishHandler fish = new FishHandler();
			fish.easterStarting();
		} catch (Exception exception) {
			System.err.printf("%s%n%n ", exception.getMessage());
			exception.printStackTrace();

		}

	}
}
