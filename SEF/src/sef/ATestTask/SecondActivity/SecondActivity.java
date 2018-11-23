package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract
    public int subtract(int x, int y) {
        int diff = x- y;
        return diff;
    }

    // Multiply
    public int multiply(int x, int y) {

        int mult = x * y;
        return mult;

    }

    // Divide
    public int divide(int x, int y) {

        int divValue = 0;
        if (x == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;
    }

}