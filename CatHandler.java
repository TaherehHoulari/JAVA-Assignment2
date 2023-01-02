
/**
* Assignment 2
* @author SeyedehTahereh Houlari 
* @version 1.0
* @since 11
*/

public class CatHandler {
	public static class ExceptionAlpha extends Exception {
	}
	public static class ExceptionBeta extends ExceptionAlpha {
	}
	public static class ExceptionGammer extends ExceptionBeta {
	}
	
	/**
	 * Main method of the CatHandler class
	 * @param args are not used
	 */
	public static void main(String[] args) {
		
		try {

			throw new ExceptionBeta();
		} catch (ExceptionAlpha exception) {
			System.err.println("Class: " + exception.getClass().getSimpleName());

		}
		try {
			throw new ExceptionGammer();

		} catch (ExceptionAlpha exception) {
			System.err.println("Class: " + exception.getClass().getSimpleName());

		}
	}
}