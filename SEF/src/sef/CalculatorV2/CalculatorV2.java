/**
 *
 */
package sef.CalculatorV2;

/**
 * @author
 */
public class CalculatorV2 {


    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public CalculatorV2() {
    }

    // Parameterized constructor
    public CalculatorV2(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract
    public int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }

    // Multiply
    public int multiply(int x, int y) {
        int multi = x * y;
        return multi;
    }

    // Divide
    public int divide(int x, int y) {
        int divValue = 0;
        if (y == 0) {
            System.out.println("Can't divide with 0!");
        } else {
            divValue = x / y;
        }
        return divValue;
    }

    // Square
    public int square(int x) {
        int sqr = x * x;
        return sqr;
    }
}
