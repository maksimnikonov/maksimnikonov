package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {

		theCalculator = new SecondActivity();
	}

	// ADD
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.add(5, 10)));
		assertEquals(15, (theCalculator.add(10, 5)));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.add(-5, 10)));
		assertEquals(-5, (theCalculator.add(5, -10)));
	}

	// SUBTRACT
	@Test
	public void testGetSubtractPositiveResult() {
		assertEquals(15, (theCalculator.subtract(20, 5)));
	}

	@Test
	public void testGetSubtractNegativeResult() {
		assertEquals(-15, (theCalculator.subtract(15, 30)));
	}

	// MULTIPLY
	@Test
	public void testGetMultiplyPositiveResult() {
		assertEquals(6, (theCalculator.multiply(2, 3)));
	}

	@Test
	public void testGetMultiplyNegativeResult() {
		assertEquals(-6, (theCalculator.multiply(-2, 3)));
	}

	// DIVIDE
	@Test
	public void testGetDividePositiveResult() {
		assertEquals(6, (theCalculator.divide(12, 2)));
	}

	@Test
	public void testGetDivideNegativeResult() {
		assertEquals(-6, (theCalculator.divide(-12, 2)));
	}

	@Test
	public void testGetDivideByZero() {
		assertEquals(0, (theCalculator.divide(0, 2)));
	}
}

