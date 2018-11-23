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

	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.sum(5, 10)));
		assertEquals(15, (theCalculator.sum(10, 5)));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, 10)));
		assertEquals(-5, (theCalculator.sum(5, -10)));
	}
	@Test
	public void testGetSubtractPositiveValue() {
		assertEquals(12, (theCalculator.subtract(20, 8)));
		assertEquals(12, (theCalculator.subtract(8, 20)));
	}
	@Test
	public void testGetSubtractNegativeValue() {
		assertEquals(0, (theCalculator.subtract(-20, -20)));
		assertEquals(28, (theCalculator.subtract(-8, 20)));
	}
	@Test
	public void testGetMultiplyPositiveValue() {
		assertEquals(16, (theCalculator.multiply(4, 4)));
		assertEquals(33, (theCalculator.multiply(3, 11)));
	}
	@Test
	public void testGetMultiplyNegativeValue() {
		assertEquals(-16, (theCalculator.multiply(4, -4)));
		assertEquals(33, (theCalculator.multiply(-3, -11)));
	}
	@Test
	public void testGetDividePositiveValue() {
		assertEquals(5, (theCalculator.divide(50, 10)));
		assertEquals(1, (theCalculator.divide(15, 15)));
	}
	@Test
	public void testGetDivideNegativeValue() {
		assertEquals(-5, (theCalculator.divide(50, -10)));
		assertEquals(1, (theCalculator.divide(-15, -15)));
	}
	@Test
	public void testGetDivideZeroValue() {
		assertEquals(0, (theCalculator.divide(50, 0)));
	}
	@Test
	public void testGetModuloValue() {
		assertEquals(1, (theCalculator.modulo(9, 2)));
		assertEquals(1, (theCalculator.modulo(9, -2)));
	}
	@Test
	public void testGetModuloZeroValue() {
		assertEquals(0, (theCalculator.modulo(9, 0)));
	}

}

