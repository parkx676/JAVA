import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

/**
 * This class is for testing Calculator class.
 * To test with JUnit, one must import org.junit.Test; and static org.junit.Assert.*;<br>
 * This will tests alphabetically ascending order for each test cases.
 * @author Juhwan Park
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // This line makes JUnit to perform alphabetically ascending order for test cases.
public class CalculatorTest {
	
	Calculator c = new Calculator(); // Initializing Calculator class before 
	/**
	 * testAdd Method is to check whether Calculator's add method properly works or not. <br>
	 * Using previously initialized Calculator class variable c, 
	 * one uses add method to add double value 50 here.<br><br>
	 * To perform the test to see if it correctly works, one must put assertEquals(expected, actual, delta) to see
	 * if it correctly works. <br><br>
	 * The result should be 50.
	 * @return True
	 */
	@Test
	public void a_testAdd() {
		double result = c.add(50);
		assertEquals(50, result, 0);
	}

	/**
	 * testSubtract Method is to check whether Calculator's subtract method properly works or not. <br>
	 * Using previously initialized Calculator class variable c, 
	 * one uses subtract method to subtract double value 40 to current value here.<br><br>
	 * To perform the test to see if it correctly works, one must put assertEquals(expected, actual, delta) to see
	 * if it correctly works.<br><br>
	 * The result should be 10. <br>
	 * 
	 * @return True
	 */
	@Test
	public void b_testSubtract() {
		double result = c.subtract(40);
		assertEquals(10, result, 0);
	}
	
	/**
	 * testMultiplication Method is to check whether Calculator's multiplication method properly works or not. <br>
	 * Using previously initialized Calculator class variable c, 
	 * one uses multiplication method to multiply double value 10 to current value here.<br><br>
	 * To perform the test to see if it correctly works, one must put assertEquals(expected, actual, delta) to see
	 * if it correctly works.<br><br>
	 * The result should be 100.
	 * @return True
	 */
	@Test
	public void c_testMultiplication() {
		double result = c.multiplication(10);
		assertEquals(100, result, 0);
	}
	
	/**
	 * testDivision Method is to check whether Calculator's division method properly works or not. <br>
	 * Using previously initialized Calculator class variable c, 
	 * one uses division method to divide double value 5 to current value here.<br><br>
	 * To perform the test to see if it correctly works, one must put assertEquals(expected, actual, delta) to see
	 * if it correctly works. <br><br>
	 * the result should be 20.
	 * @return True
	 */
	@Test
	public void d_testDivision() {
		double result = c.division(5);
		assertEquals(20, result, 0);
	}
	
	/**
	 * testClear method is to check whether Calculator's clear method properly works or not. <br>
	 * One needs to use clear method to set the final value as zero first,
	 *  and need to use getCurrentValue method to return the final value to check with assertEquals method in JUnit.<br>
	 *  <br>
	 *  The result should be 0, if clear method works properly.
	 *  @return True
	 */
	@Test
	public void e_testClear() {
		c.clear();
		double result = c.getCurrentValue();
		assertEquals(0, result, 0);
	}
}
