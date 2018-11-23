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
        assertEquals(12, (theCalculator.sum(5, 7)));
        assertEquals(12, (theCalculator.sum(7, 5)));
    }

    //Example ->
    @Test
    public void testGetSumNegativeValue() {
        assertEquals(2, (theCalculator.sum(-5, 7)));
        assertEquals(-2, (theCalculator.sum(-7, 5)));
    }

    public void testGetSubtractPositiveValue() {
        assertEquals(35, (theCalculator.subtract(45, 10)));
        assertEquals(-35, (theCalculator.subtract(10, 45)));
    }

    public void testGetSubtractNegativeValue() {
        assertEquals(-55, (theCalculator.subtract(-45, 10)));
        assertEquals(-35, (theCalculator.subtract(-45, -10)));
        assertEquals(55, (theCalculator.subtract(45, -10)));
    }
    public void testGetMultiplyPositiveValue() {
        assertEquals(20, (theCalculator.multiply(4,5)));
        assertEquals(20, (theCalculator.multiply(5,4)));
    }
    public void testGetMultiplyNegativeValue() {
        assertEquals(-20, (theCalculator.multiply(-4,5)));
        assertEquals(-20, (theCalculator.multiply(4,-5)));
        assertEquals(20, (theCalculator.multiply(-4,-5)));
    }
    public void testGetDivisionPositiveValue() {
        assertEquals(5, (theCalculator.divide(100, 20)));
        assertEquals(0, 2, (theCalculator.divide(20, 100)));
    }
    public void testGetDivisionNegativeValue() {
       assertEquals(-5, (theCalculator.divide(100, -20)));
       assertEquals(-5, (theCalculator.divide(-100, 20)));
       assertEquals(5, (theCalculator.divide(-100,-20)));
       assertEquals(-0,2, (theCalculator.divide(-20,100)));
       assertEquals(0,2, (theCalculator.divide(-20,-100)));
    }
}

