/**
 * Calculator class operates the four fundamental arithmetic operations and return the operated value. <br>
 * This class is for testing JUnit test program.
 * @author Juhwan Park
 */

public class Calculator {
	
	/**
	 * Default Answer Value 
	 */
	private static double answer = 0;

	/**
	 * Add Operation
	 * @param n Desired value which user inputs for adding to current value
	 * @return The final value
	 */
	public double add(double n) {
		answer += n;
		return answer;
	}
	
	/**
	 * Subtract Operation
	 * @param n Desired value which user inputs for subtracting from current value
	 * @return The final value
	 */
	public double subtract(double n) {
		answer -= n;
		return answer;
	}
	
	/**
	 * Multiplication Operation
	 * @param n Desired value which user inputs for multiplying to current value
	 * @return The final value
	 */
	public double multiplication(double n) {
		answer *= n;
		return answer;
	}
	
	/**
	 * Division Operation
	 * @param n Desired value which user inputs for dividing from current value
	 * @return The final value
	 */
	public double division(double n) {
		answer /= n;
		return answer;
	}
	
	/**
	 * This method clears current value and set the value as zero again
	 */
	public void clear() {
		answer = 0;
	}
	
	/**
	 * getCurrentValue Method
	 * 
	 * @return The current value
	 */
	public double getCurrentValue(){
		return answer;
	}

}
