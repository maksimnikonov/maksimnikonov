package sef.CalculatorV2;

import java.util.Scanner;

/**
 * @author
 */
public class CalculatorClientV2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */

        //THIS WAS MADE BECAUSE I GOT BORED IN MY FREE TIME! IT MIGHT NOT BE FINISHED!

        CalculatorV2 normalCalc = new CalculatorV2(CalculatorV2.CALC_TYPE_BASIC);
        Scanner scanner = new Scanner(System.in);
        int result; // result of the equation
        int x; // variable 1
        int y; // variable 2
        int opt;
        int again = 0;

        do {
            System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");
            System.out.println("Please choose what option would you like to perform:");
            System.out.println("1) x+y | 2) x-y | 3) x*y | 4) x/y | 5) x^2\n");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    // Add
                    System.out.println("Input first variable");
                    x = scanner.nextInt();
                    System.out.println("Input second variable");
                    y = scanner.nextInt();
                    result = normalCalc.add(x, y);
                    System.out.println(x + " + " + y + " = " + result);
                    break;
                case 2:
                    // Subtract
                    System.out.println("Input first variable");
                    x = scanner.nextInt();
                    System.out.println("Input second variable");
                    y = scanner.nextInt();
                    result = normalCalc.subtract(x, y);
                    System.out.println(x + " - " + y + " = " + result + "\n");
                    break;
                case 3:
                    // Multiply
                    System.out.println("Input first variable");
                    x = scanner.nextInt();
                    System.out.println("Input second variable");
                    y = scanner.nextInt();
                    result = normalCalc.multiply(x, y);
                    System.out.println(x + " * " + y + " = " + result + "\n");
                    break;
                case 4:
                    // Divide
                    System.out.println("Input first variable");
                    x = scanner.nextInt();
                    System.out.println("Input second variable");
                    y = scanner.nextInt();
                    if (y == 0) {
                        System.out.println("Can not divide with 0!");
                    } else {
                        result = normalCalc.divide(x, y);
                        System.out.println(x + " / " + y + " = " + result + "\n");
                    }
                    break;
                case 5:
                    //Squared
                    System.out.println("Input variable to square");
                    x = scanner.nextInt();
                    result = normalCalc.square(x);
                    System.out.println(x + "^2 = " + result);
                    break;
                default:
                    System.out.println("No option was selected!");
                    break;
            }

            System.out.println("Would you like to repeat [1] or end [0]?");
            again = scanner.nextInt();
        } while (again == 1);
    }
}
