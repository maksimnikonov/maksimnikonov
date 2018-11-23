package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {


    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();


        //TODO Use the calculator to calculate different values
        //Example ->
        System.out.println(calculator.sum(16, 6));
        System.out.println(calculator.divide(100, 33));
        calculator.subtract(16, 5);
        calculator.multiply(10, 7);


    }

    // Add
    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
    // Subtract
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }
    // Multiply
    public int multiply(int x, int y) {

        return x * y;
    }
    // Divide
    public double divide(int x, int y) {
        double divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;
    }
}
