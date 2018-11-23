package sef.ATestTask.SecondActivity;


	// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

	public class SecondActivityTest extends TestCase {


		//try to achieve 100% of test coverage

		private SecondActivity theCalculator;

		protected void setUp() throws Exception {
			super.setUp();
			// Initialize variables to be used here
			theCalculator = new SecondActivity();
		}

		protected void tearDown() throws Exception {
			super.tearDown();
		}

		//Example ->
		@Test
		public void testGetSumPositiveValue() {
			assertEquals(15, (theCalculator.sum(5, 10)));
			assertEquals(15, (theCalculator.sum(10, 5)));
		}

		//Example ->
		@Test
		public void testGetSumNegativeValue() {
			assertEquals(5, (theCalculator.sum(-5, 10)));
			assertEquals(-5, (theCalculator.sum(5, -10)));
		}

		//Example ->
		@Test
		public void testGetSubstractPositiveValue() {
			assertEquals(5, (theCalculator.substract(10, 5)));
			assertEquals(15, (theCalculator.substract(5, -10)));
		}

		//Example ->
		@Test
		public void testGetSubstractNegativeValue() {
			assertEquals(-5, (theCalculator.substract(5, 10)));
			assertEquals(-15, (theCalculator.substract(-10, 5)));
		}

		//Example ->
		@Test
		public void testGetDivideCorrectValue() {
			assertEquals(2, (theCalculator.divide(10, 5)));
			assertEquals(5, (theCalculator.divide(10, 2)));
		}


		//Example ->
		@Test
		public void testGetMultiplyCorrectValue() {
			assertEquals(10, (theCalculator.multiply(5, 2)));
			assertEquals(6, (theCalculator.multiply(3, 2)));
		}
	}
