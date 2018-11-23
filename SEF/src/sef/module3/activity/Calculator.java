/**
 *
 */
package sef.module3.activity;

/**
 * @author
 */
public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));
        System.out.println("Divide - " + divide(10, 0));
    }

    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        if (x > y) return x - y;
        else if (x < y) return y - x;
        else return 0;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (y == 0) {
            System.out.println("It is not allowed to divide on 0!");
        }
        else {
            divValue = x / y;
        }
        return divValue;
    }
}

