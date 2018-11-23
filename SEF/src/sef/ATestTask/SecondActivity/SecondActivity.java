package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();

        double x = 10.0;
        double y = 2.0;

//TODO Use the calculator to calculate different values
//Example ->
//calculator.sum(10.2, 5);
//calculator.divide(100, 33);
// and more

        System.out.println("Sum - " + sum(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiplication - " + multiply(x, y));
        System.out.println("Division - " + divide(x, y));
    }

    private static double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    private static double subtract(double x, double y) {
        double sub = x - y;
        return sub;
    }

    private static double multiply(double x, double y) {
        double multi = x * y;
        return multi;
    }

    private static double divide(double x, double y) {
        double divideNumber = 0;
        if (y == 0) {
            System.out.println("You can't divide on 0!!!");
        } else {
            divideNumber = x / y;
        }
        return divideNumber;
    }

//TODO create the Calculator (here or in additional class)

    public double getSum(double x, double y) {
        return sum(x, y);
    }

    public double getSubtraction(double x, double y) {
        return subtract(x, y);
    }

    public double getMultiplication(double x, double y) {
        return multiply(x, y);
    }

    public double getDivision(double x, double y) {
        return divide(x, y);
    }
}

