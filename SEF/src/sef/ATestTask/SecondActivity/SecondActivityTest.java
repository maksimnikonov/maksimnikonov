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
		assertEquals(15.0, (theCalculator.Sum(5, 10)));
		assertEquals(15.0, (theCalculator.Sum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.Sum(-5, 10)));
		assertEquals(-5.0, (theCalculator.Sum(5, -10)));
	}

	public void testGetProduct() {

		double a = 5;
		double b = 10;
		//	Checks the product of two (2) positive values
		assertEquals(50.0, (theCalculator.multiply(a, b)));
		assertEquals(50.0, (theCalculator.multiply(b , a)),0);

		a = -5;
		b = 10;
		//	Checks the product of a postive value and a negative value
		assertEquals(-50.0, (theCalculator.multiply(a,b)),0);
		assertEquals(-50.0, (theCalculator.multiply(b,a)),0);

		a = -3;
		b = -10;
		//	Checks the product of two (2) negative values
		assertEquals(30.0, (theCalculator.multiply(a,b)),0);
		assertEquals(30.0, (theCalculator.multiply(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;
		//	Checks if b is lesser than a
		assertEquals(2.0, (theCalculator.divide(a,b)),0);
		//	Checks if b is greater than a
		assertEquals(0.5, (theCalculator.divide(b,a)),0);

		a = 9;	b = -3;
		//	Checks if positive value is divided with negative value
		assertEquals(-3.0, (theCalculator.divide(a,b)),0);
		//	Checks if negative value is divided with positive value
		assertEquals(-0.33, (theCalculator.divide(b,a)),0.007);

		a = -10;	b = -5;
		//	Checks if negative value is divided with negative value: a > b
		assertEquals(2.0, (theCalculator.divide(a,b)),0);
		//	Checks if negative value is divided with negative value: b < a
		assertEquals(0.5, (theCalculator.divide(b,a)),0);

		a = 5 ; b = 0;
		assertEquals(0.0, (theCalculator.divide(a,b)),0);
	}


	// by the way this Test Is running Correctly  i just have a condidtion
	// on Substracing so the Value should always be positive

	public void testGetSubstract() {

		double a = 5;
		double b = 10;
		//	Checks the product of two (2) positive values
		assertEquals(5.0, (theCalculator.subtract(a, b)));
		assertEquals(5.0, (theCalculator.subtract(b , a)),0);

		a = -5;
		b = 10;
		//	Checks the product of a postive value and a negative value
		assertEquals(15.0, (theCalculator.subtract(a,b)),0);
		assertEquals(15.0, (theCalculator.subtract(b,a)),0);

		a = -3;
		b = -10;
		//	Checks the product of two (2) negative values
		assertEquals(7.0, (theCalculator.subtract(a,b)),0);
		assertEquals(7.0, (theCalculator.subtract(b,a)),0);
	}




}

