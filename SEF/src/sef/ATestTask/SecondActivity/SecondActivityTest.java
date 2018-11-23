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

	public void testGetSum() {

		double a = 5.0;
		double b = 10.0;
		//	Checks the sum of two (2) positive values
		assertEquals(15.0, (theCalculator.sum(a,b)));
		assertEquals(15.0, (theCalculator.sum(b,a)));

		a = -5.0;
		b = 10.0;
		//	Checks the sum of a postive value and a negative value
		assertEquals(5.0, (theCalculator.sum(a,b)));
		assertEquals(5.0, (theCalculator.sum(b,a)));

		a = -5.0;
		b = -10.0;
		//	Checks the sum of two (2) negative values
		assertEquals(-15.0, (theCalculator.sum(a,b)));
		assertEquals(-15.0, (theCalculator.sum(b,a)));
	}

	public void testSubtract() {

		double a = 3.0;
		double b = 2.0;
		//	Checks if b is lesser than a
		assertEquals(1.0, (theCalculator.subtract(a,b)));
		//	Checks if b is greater than a
		assertEquals(-1.0, (theCalculator.subtract(b,a)));

		a = 5.0;
		b = -4.0;
		//	Checks if negative value is subtracted from positive value
		assertEquals(9.0, (theCalculator.subtract(a,b)));
		//	Checks if positive value is subtracted from negative value
		assertEquals(-9.0, (theCalculator.subtract(b,a)),0);

		a = -10.0;
		b = -5.0;
		//	Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5.0, (theCalculator.subtract(a,b)),0);
		//	Checks if negative value is subtracted from negative value: b < a
		assertEquals(5.0, (theCalculator.subtract(b,a)),0);
	}

	public void testMultiply() {

		double a = 5.0;
		double b = 10.0;
		//	Checks the product of two (2) positive values
		assertEquals(50.0, (theCalculator.multiply(a,b)),0);
		assertEquals(50.0, (theCalculator.multiply(b,a)),0);

		a = -5.0;
		b = 10.0;
		//	Checks the product of a postive value and a negative value
		assertEquals(-50.0, (theCalculator.multiply(a,b)),0);
		assertEquals(-50.0, (theCalculator.multiply(b,a)),0);

		a = -3.0;
		b = -10.0;
		//	Checks the product of two (2) negative values
		assertEquals(30.0, (theCalculator.multiply(a,b)),0);
		assertEquals(30.0, (theCalculator.multiply(b,a)),0);
	}
	public void testDivide() {

		double a = 10.0;	double b = 5.0;

		assertEquals(2.0, (theCalculator.divide(a,b)),0);
		assertEquals(0.5, (theCalculator.divide(b,a)),0);

		a = 9.0;	b = -3.0;
		assertEquals(-3.0, (theCalculator.divide(a,b)),0);
		assertEquals(-0.33, (theCalculator.divide(b,a)),0.007);

		a = -10.0;	b = -5.0;
		assertEquals(2.0, (theCalculator.divide(a,b)),0);
		assertEquals(0.5, (theCalculator.divide(b,a)),0);
	}
}
