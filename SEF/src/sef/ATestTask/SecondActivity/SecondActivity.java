package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {


    int a;
    int b;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error!Dividing by zero is not allowed");
            return 0;
        } else {
            return a / b;
        }
    }


        public int module (int a, int b){
            if (b == 0) {
                System.out.println("Error! Dividing by zero is not allowed");
                return 0;
            } else {
                return a * b;
            }
        }


        public static void main (String[]args){
            SecondActivity myCalculator = new SecondActivity();

            System.out.println("Result of addition = " + myCalculator.sum(5, 7));
            System.out.println("Result of subtraction =" + myCalculator.subtract(45, 10));
            System.out.println("Result of multiplication =" + myCalculator.multiply(4, 5));
            System.out.println("Result of division = " + myCalculator.divide(100, 20));
            System.out.println("Result of module = " + myCalculator.module(9, 4));
}
    }




