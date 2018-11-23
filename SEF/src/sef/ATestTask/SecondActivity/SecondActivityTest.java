package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


    //TODO try to achieve 100% of test coverage

    private SecondActivity theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new SecondActivity();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Example ->

    public void testGetSumPositiveValue() {
        assertEquals(15, (theCalculator.sum(5, 10)));
        assertEquals(15, (theCalculator.sum(10, 5)));
    }

    //Example ->

    public void testGetSumNegativeValue() {
        assertEquals(5, (theCalculator.sum(-5, 10)));
        assertEquals(-5, (theCalculator.sum(5, -10)));
    }

    public void testGetSubtractPositiveValue() {
        assertEquals(45, (theCalculator.subtract(55, 10)));
        assertEquals(45, (theCalculator.subtract(10, 55)));
    }

    public void testGetSubtractNegativeValue() {
        assertEquals(30, (theCalculator.subtract(-40, 10)));
        assertEquals(30, (theCalculator.subtract(-40, -10)));
        assertEquals(30, (theCalculator.subtract(40, -10)));
    }

    public void testGetMultiplyPositiveValue() {
        assertEquals(50, (theCalculator.multiply(10, 5)));
        assertEquals(50, (theCalculator.multiply(5, 10)));
    }

    public void testGetMultiplyNegativeValue() {
        assertEquals(-20, (theCalculator.multiply(-4, 5)));
        assertEquals(-20, (theCalculator.multiply(4, -5)));
        assertEquals(20, (theCalculator.multiply(-4, -5)));
    }

    public void testGetDivisionPositiveValue() {
        assertEquals(5, (theCalculator.divide(100, 20)));
        assertEquals(0.2, (theCalculator.divide(20, 100)));
    }

    public void testGetDivisionNegativeValue() {
        assertEquals(-5, (theCalculator.divide(100, -20)));
        assertEquals(-5, (theCalculator.divide(-100, 20)));
        assertEquals(5, (theCalculator.divide(-100, -20)));
        assertEquals(0.2, (theCalculator.divide(-20, 100)));
        assertEquals(0.2, (theCalculator.divide(-20, -100)));
    }
}

