package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();
        int x = 8;
        int y = 10;

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(x, y));
        System.out.println("Divide - " + divide(x, y));
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int subtract(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    public static int multiply(int x, int y) {
        int multy = x*y;
        return multy;
    }


    public static int divide(int x, int y) {
        int divValue = 0;
        if (y == 0) {
            System.out.println("Cannot be divided by 0");
        }
        else if ( x == 0 ) {
            return 0;
        }
        else divValue = x/y;
        return divValue;
    }

        //public static int divide(int x, int y) {

        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more


        //TODO create the Calculator (here or in additional class)




    public int getSum(int a, int b) {

        return a + b;
    }

    public int getDifference(int a, int b){
        return a - b;
    }

    public double getProduct(double a, double b){
        return a * b;
    }

    public double getQuotient(double a, double b){
        return a / b;
    }
}

