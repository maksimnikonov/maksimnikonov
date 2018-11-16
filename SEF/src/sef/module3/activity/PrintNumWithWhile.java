/**
 *
 */
package sef.module3.activity;

/**
 * @author
 */
public class PrintNumWithWhile {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Even numbers: ");
        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("Odd numbers: ");
        // write code to Print all odd numbers less than 100
        int j = 1;
        while (j<100) {
            System.out.println(j);
            j = j + 2;
        }
    }
}
