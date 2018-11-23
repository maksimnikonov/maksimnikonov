package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testAddPositiveValues() {
		assertEquals(30.5, (theCalculator.add(10, 20.5)), 0);
		assertEquals(30.5, (theCalculator.add(20.5, 10)), 0);
	}

	//Example ->
	@Test
	public void testAddOneNegativeValue() {
		assertEquals(90, (theCalculator.add(-10, 100)), 0);
		assertEquals(90, (theCalculator.add(100, -10)), 0);
	}

	@Test
	public void testAddNegativeValues() {
		assertEquals(-25.5, (theCalculator.add(-10, -15.5)), 0);
		assertEquals(-25.5, (theCalculator.add(-15.5, -10)), 0);
	}

	@Test
	public void testSubtractPositiveValues() {
		assertEquals(9.5, (theCalculator.subtract(15, 5.5)), 0);
		assertEquals(-9.5, (theCalculator.subtract(5.5, 15)), 0);
	}

	@Test
	public void testSubtractOneNegativeValue() {
		assertEquals(-11, (theCalculator.subtract(-10, 1)), 0);
		assertEquals(11, (theCalculator.subtract(1, -10)), 0);
	}

	@Test
	public void testSubtractNegativeValues() {
		assertEquals(5.5, (theCalculator.subtract(-10, -15.5)), 0);
		assertEquals(-5.5, (theCalculator.subtract(-15.5, -10)), 0);
	}

	@Test
	public void testMultiplyPositiveValues() {
		assertEquals(2.5, (theCalculator.multiply(5, 0.5)), 0);
		assertEquals(2.5, (theCalculator.multiply(0.5, 5)), 0);
	}

	@Test
	public void testMultiplyOneNegativeValue() {
		assertEquals(-10, (theCalculator.multiply(-10, 1)), 0);
		assertEquals(-10, (theCalculator.multiply(1, -10)), 0);
	}

	@Test
	public void testMultiplyNegativeValues() {
		assertEquals(35, (theCalculator.multiply(-7, -5)), 0);
		assertEquals(35, (theCalculator.multiply(-5, -7)), 0);
	}

	@Test
	public void testDividePositiveValues() {
		assertEquals(10, (theCalculator.divide(20, 2)), 0);
		assertEquals(0.1, (theCalculator.divide(2, 20)), 0);
	}

	@Test
	public void testDivideOneNegativeValue() {
		assertEquals(-5, (theCalculator.divide(-50, 10)), 0);
		assertEquals(-0.2, (theCalculator.divide(10, -50)), 0);
	}

	@Test
	public void testDivideNegativeValues() {
		assertEquals(5, (theCalculator.divide(-25, -5)), 0);
		assertEquals(0.2, (theCalculator.divide(-5, -25)), 0);
	}

	@Test
	public void testDivideByZero() {
		assertEquals(0, (theCalculator.divide(0, 10)), 0);
		assertEquals(0, (theCalculator.divide(10, 0)), 0);


	}


	public void testTryCatch() {

		try {

			new SecondActivity();
			theCalculator.add(10, 7);
			theCalculator.subtract(3.3, 8);
			theCalculator.multiply(12, 25);
			theCalculator.divide(57, 0);


		} catch (Exception e) {
			fail();

		}

	}
}




