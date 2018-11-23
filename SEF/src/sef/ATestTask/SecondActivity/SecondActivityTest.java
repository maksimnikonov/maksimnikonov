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
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.getSum(5, 10)));
		assertEquals(15, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumOneNegativeValue() {
		assertEquals(5, (theCalculator.getSum(-5, 10)));
		assertEquals(-5, (theCalculator.getSum(5, -10)));
	}

	@Test
	public void testGetSumAllNegativeValues() {
		assertEquals(-15, (theCalculator.getSum(-5, -10)));
		assertEquals(-15, (theCalculator.getSum(-10, -5)));
	}

	@Test
	public void testGetDifferencePositiveValues() {
		assertEquals(-5, (theCalculator.getDifference(5, 10)));
		assertEquals(5, (theCalculator.getDifference(10, 5)));
	}

	@Test
	public void testGetDifferenceOneNegativeValue() {
		assertEquals(15, (theCalculator.getDifference(5, -10)));
		assertEquals(-15, (theCalculator.getDifference(-10, 5)));
	}

	@Test
	public void testGetDifferenceAllNegativeValues() {
		assertEquals(5, (theCalculator.getDifference(-5, -10)));
		assertEquals(-5, (theCalculator.getDifference(-10, -5)));
	}

	public void testGetProductPositiveValues() {
		assertEquals(12.0, (theCalculator.getProduct(6.0, 2.0)));
		assertEquals(12.0, (theCalculator.getProduct(2.0, 6.0)));
	}

	public void testGetProductOneNegativeValue() {
		assertEquals(-12.0, (theCalculator.getProduct(-6.0, 2.0)));
		assertEquals(-12.0, (theCalculator.getProduct(2.0, -6.0)));
	}
	public void testGetProductAllNegativeValues() {
		assertEquals(12.0, (theCalculator.getProduct(-6.0, -2.0)));
		assertEquals(12.0, (theCalculator.getProduct(2.0, 6.0)));
	}
	public void testGetQuotientPositiveValues() {
		assertEquals(3.0, (theCalculator.getQuotient(6.0, 2.0)));
		assertEquals(0.3333333333333333, (theCalculator.getQuotient(2.0, 6.0)));
	}
	public void testGetQuotientOneNegativeValues() {
		assertEquals(-3.0, (theCalculator.getQuotient(6.0, -2.0)));
		assertEquals(-0.3333333333333333, (theCalculator.getQuotient(-2.0, 6.0)));
	}
	public void testGetQuotientAllNegativeValues() {
		assertEquals(3.0, (theCalculator.getQuotient(-6.0, -2.0)));
		assertEquals(0.3333333333333333, (theCalculator.getQuotient(-2.0, -6.0)));
	}
}