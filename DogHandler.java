import java.io.IOException;

/**
* Assignment 2
* @author SeyedehTahereh Houlari 
* @see IOException
* @version 1.0
* @since 11
*/
public class DogHandler {
	public static class ExceptionDog extends Exception {
	}
	public static class ExceptionPuppy extends ExceptionDog {
	}
	/**
	 * Main method of the DogHandler class
	 * @param args are not used
	 */
	public static void main(String[] args) {
		try {
			throw new ExceptionDog();
		} catch (Exception exception) {
			System.err.println("" + exception.getClass());
			// e.printStackTrace();
		}
		try {
			throw new ExceptionPuppy();
		} catch (ExceptionDog exception) {
			System.err.println("" + exception.getClass());
			// e.printStackTrace();
		}
		try {
			throw new NullPointerException();
		} catch (NullPointerException exception) {
			System.err.println("" + exception.getClass());
			// e.printStackTrace();
		}

		try {
			throw new IOException();
		} catch (IOException exception) {
			System.err.println("" + exception.getClass());
			// e.printStackTrace();
		}

	}
}
