package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

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
    public void testSumPositiveValue() {
        assertEquals(15.0, (theCalculator.sum(5, 10)));
        assertEquals(15.0, (theCalculator.sum(10, 5)));
    }

    //Example ->
    @Test
    public void testSumNegativeValue() {
        assertEquals(5.0, (theCalculator.sum(-5, 10)));
        assertEquals(-5.0, (theCalculator.sum(5, -10)));
    }

    @Test
    public void testSubtractPositiveValue() {
        assertEquals(5.0, (theCalculator.subtract(10, 5)));
        assertEquals(-5.0, (theCalculator.subtract(5, 10)));
    }

    @Test
    public void testSubtractNegativeValue() {
        assertEquals(15.0, (theCalculator.subtract(10, -5)));
        assertEquals(-15.0, (theCalculator.subtract(-5, 10)));
    }

    @Test
    public void testMultiplyPositiveValue() {
        assertEquals(15.0, (theCalculator.multiply(5, 3)));
        assertEquals(15.0, (theCalculator.multiply(3, 5)));
    }

    @Test
    public void testMultiplyNegativeValue() {
        assertEquals(-15.0, (theCalculator.multiply(5, -3)));
        assertEquals(-15.0, (theCalculator.multiply(-3, 5)));
    }

    @Test
    public void testDividePositiveValue() {
        assertEquals(5.0, (theCalculator.divide(20, 4)));
        assertEquals(0.2, (theCalculator.divide(4, 20)));
    }

    @Test
    public void testDivideNegativeValue() {
        assertEquals(-5.0, (theCalculator.divide(20, -4)));
        assertEquals(-0.2, (theCalculator.divide(-4, 20)));
    }

    @Test
    public void testDivideWithZero() {
        assertEquals(0.0, (theCalculator.divide(20, 0)));
    }

    @Test
    public void testPositiveSquare() {
        assertEquals(100.0, (theCalculator.square(10)));
    }

    @Test
    public void testNegativeSquare() {
        assertEquals(100.0, (theCalculator.square(-10)));
    }

    @Test
    public void testPositiveChange() {
        assertEquals(-10.0, (theCalculator.change(10)));
    }

    @Test
    public void testNegativeChange() {
        assertEquals(10.0, (theCalculator.change(-10)));
    }

    @Test
    public void testThrowException() {
        try {

            new SecondActivityTest();
            theCalculator.sum(22.2, 34.2);
            theCalculator.subtract(12.6, 12.1);
            theCalculator.multiply(4, 10.25);
            theCalculator.divide(10, 0);
            theCalculator.divide(10, 4);
            theCalculator.square(10);
            theCalculator.change(10.33);
            theCalculator.change(-3.2);

        } catch (Exception e) {
            fail();
        }
    }
}

