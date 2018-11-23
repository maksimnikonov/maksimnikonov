package sef.ATestTask.SecondActivity;

import java.util.Scanner;

// Complete Code
public class SecondActivity extends Operations{

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->

		double result = 0;
		result = calculator.sum(10, 5);
		System.out.println(result);
		result = calculator.divide(100, 33);
		System.out.println(result);
		result = calculator.substract(-8, 5);
		System.out.println(result);
		result = calculator.multiply(100, 100);
		System.out.println(result);
		// and more
        int num1, num2;
		char operator;
		System.out.println("Enter 1st value - >");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter 2nd value - >");
		num2 = sc.nextInt();
		System.out.println("choose calculation - + - / *");
		operator = sc.next().charAt(0);
		int calculation;
		switch (operator) {
			case '+':
				calculation = num1 + num2;
				break;
			case '-':
				calculation = num1 - num2;
				break;
			case '*':
				calculation = num1 * num2;
				break;
			case '/':
				calculation = num1 / num2;
				break;
			default:
				System.out.print("Error! operator is not correct");
				return;


		}
        System.out.println(calculation);
	}

	//TODO create the Calculator (here or in additional class)


}
