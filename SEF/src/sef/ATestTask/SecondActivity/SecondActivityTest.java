package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;
	private SecondActivity theCalculator1;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
		theCalculator1 = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->


	@Test
	public void testsetSumPositiveValue() {
		theCalculator.setSubstraction(5, 10);
		theCalculator1.setSubstraction(5, 10);

		assertEquals(15, (theCalculator.getSum()));
		assertEquals(15, (theCalculator1.getSum()));
	}

	//Example ->
@Test
	public void testsetSumNegativeValue() {
		theCalculator.setSum(-5, 10);
		theCalculator1.setSum(5, -10);

		assertEquals(5, (theCalculator.getSum()));
		assertEquals(-5, (theCalculator1.getSum()));
	}
	@Test
	public void testsetSubstractionPositiveValue() {
		theCalculator.setSubstraction(5, 10);
		theCalculator1.setSubstraction(5, 10);

		assertEquals(5, (theCalculator.getSubstract()));
		assertEquals(5, (theCalculator1.getSubstract()));
	}

	@Test
	public void testsetSubstractionNegativeValue() {
		theCalculator.setSubstraction(-5, 10);
		theCalculator1.setSubstraction(5, -10);

		assertEquals(15, (theCalculator.getSubstract()));
		assertEquals(15, (theCalculator1.getSubstract()));
	}


	@Test
	public void testsetmultiplypositiveValue() {
		theCalculator.setMultiply(5, 10);
		theCalculator1.setMultiply(5, 10);

		assertEquals(50, (theCalculator.getMultiply()));
		assertEquals(50, (theCalculator1.getMultiply()));
	}

	@Test
	public void testsetmultiplynegativeValue() {
		theCalculator.setMultiply(-5, 10);
		theCalculator1.setMultiply(5, -10);

		assertEquals(-50, (theCalculator.getMultiply()));
		assertEquals(-50, (theCalculator1.getMultiply()));
	}
	@Test
	public void testsetdividepositiveValue() {
		theCalculator.setDivide(10, 5);
		theCalculator1.setDivide(5, 10);

		assertEquals(2, (theCalculator.getDivide()));
		assertEquals(0, (theCalculator1.getDivide()));
	}

	@Test
	public void testsetdividenegativeValue() {
		theCalculator.setDivide(-5, 10);
		theCalculator1.setDivide(10, -5);

		assertEquals(0, (theCalculator.getDivide()));
		assertEquals(-2, (theCalculator1.getDivide()));
	}

}


