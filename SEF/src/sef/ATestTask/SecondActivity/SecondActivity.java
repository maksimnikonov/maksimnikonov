package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();

        calculator.sum(22.2, 34.2);
        calculator.subtract(12.6, 12.1);
        calculator.multiply(4, 10.25);
        calculator.divide(10, 0);
        calculator.divide(10, 4);
        calculator.square(10);
        calculator.change(10.33);
        calculator.change(-3.2);

    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Can not divide with 0!");
            return 0;
        } else {
            return x / y;
        }
    }

    public double square(double x) {
        return x * x;
    }

    public double change(double x){
        return -x;
    }
}
