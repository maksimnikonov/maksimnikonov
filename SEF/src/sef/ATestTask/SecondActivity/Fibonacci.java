package sef.ATestTask.SecondActivity;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        int count, num1 = 0, num2 = 1;
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
                }
            }
        }


