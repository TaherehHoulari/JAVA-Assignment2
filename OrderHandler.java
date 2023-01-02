import java.io.IOException;

/**
* Assignment 2
* @author SeyedehTahereh Houlari 
* @see IOException
* @version 1.0
* @since 11
*/

public class OrderHandler {
	
	/**
	 * Main method of the OrderHandler class
	 * @param args are not used
	 */
	public static void main(String[] args) {
		
		Exception obj1 = new Exception();
		IOException obj2 = new IOException();
		
		try {
			throw new IOException();
		}
		catch (IOException exception) {
			System.out.println(exception.getClass());
		} catch (Exception exception) {
			System.err.println(exception.getClass());
		}
	}
	
}
