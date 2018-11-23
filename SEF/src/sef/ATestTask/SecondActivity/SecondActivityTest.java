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
    public void testGetSumPositiveValue() {
        assertEquals(15.0, (theCalculator.getSum(5.0, 10.0)));
        assertEquals(15.0, (theCalculator.getSum(10.0, 5.0)));
    }

    //Example ->
    public void testGetSumWithOneNegativeValue() {
        assertEquals(5.0, (theCalculator.getSum(-5.0, 10.0)));
        assertEquals(-5.0, (theCalculator.getSum(5.0, -10.0)));
    }

    public void testGetSumWithBothNegativeValues() {
        assertEquals(-15.0, (theCalculator.getSum(-5.0, -10.0)));
        assertEquals(-15.0, (theCalculator.getSum(-10.0, -5.0)));
    }

    public void testGetSubtractionPositiveValue() {
        assertEquals(5.0, (theCalculator.getSubtraction(10.0, 5.0)));
        assertEquals(-5.0, (theCalculator.getSubtraction(5.0, 10.0)));
    }

    public void testGetSubtractionOneNegativeValue() {
        assertEquals(15.0, (theCalculator.getSubtraction(5.0, -10.0)));
        assertEquals(-15.0, (theCalculator.getSubtraction(-10.0, 5.0)));
    }

    public void testGetSubstractionBothNegativeValues(){
        assertEquals(5.0, (theCalculator.getSubtraction(-5.0, -10.0)));
        assertEquals(-5.0, (theCalculator.getSubtraction(-10.0, -5.0)));
    }

    public void testGetMultiplicationPositiveValue() {
        assertEquals(50.0, (theCalculator.getMultiplication(5.0, 10.0)));
        assertEquals(50.0, (theCalculator.getMultiplication(10.0, 5.0)));
    }

    public void testGetMultiplicationOneNegativeValue() {
        assertEquals(-50.0, (theCalculator.getMultiplication(5.0, -10.0)));
        assertEquals(-50.0, (theCalculator.getMultiplication(-10.0, 5.0)));
    }

    public void testGetMultiplicationBothNegativeValues() {
        assertEquals(50.0, (theCalculator.getMultiplication(-5.0, -10.0)));
        assertEquals(50.0, (theCalculator.getMultiplication(-10.0, -5.0)));
    }

    public void testGetDivisionPositiveValue() {
        assertEquals(2.0, (theCalculator.getDivision(10.0, 5.0)));
        assertEquals(0.5, (theCalculator.getDivision(5.0, 10.0)));
    }

    public void testGetDivisionOneNegativeValue() {
        assertEquals(-2.0, (theCalculator.getDivision(-10.0, 5.0)));
        assertEquals(-0.5, (theCalculator.getDivision(5.0, -10.0)));
    }

    public void getDivisionBothNegativeValues() {
        assertEquals(2.0, (theCalculator.getDivision(-10.0, -5.0)));
        assertEquals(0.5, (theCalculator.getDivision(-5.0, -10.0)));
    }

    public void testThrowsException(){
        try {
            theCalculator.getSum(2, 3);
            theCalculator.getSubtraction(6, 3);
            theCalculator.getMultiplication(6, 2);
            theCalculator.getDivision(15, 3);
        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }
    }
}

