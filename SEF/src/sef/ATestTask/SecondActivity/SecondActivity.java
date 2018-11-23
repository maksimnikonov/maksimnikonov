package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	int a;
	int b;

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtract (int a, int b) {
		int diff = 0;
		if (a > b) {
			diff = a - b;
		} else {
			diff = b - a;
		}
		return diff;
	}

	public int multiply (int a, int b) {
		return a * b;
	}

	public int divide (int a, int b) {
		if (b == 0) {
			System.out.println("Error! Dividing by zero is not allowed");
			return 0;
		}
		else {
			return a / b;
		}
	}

	public int modulo (int a, int b) {
		if (b == 0) {
			System.out.println("Error! Dividing by zero is not allowed");
			return 0;
		}
		else {
			return a % b;
		}
	}

	public static void main(String[] args) {
		SecondActivity myCalculator = new SecondActivity();

		System.out.println("Result of addition = " +myCalculator.sum(5,7));
		System.out.println("Result of subtraction = " +myCalculator.subtract(45,11));
		System.out.println("Result of multiplication = " +myCalculator.multiply(4,4));
		System.out.println("Result of dividion = " +myCalculator.divide(100,10));
		System.out.println("Result of modulo = " +myCalculator.modulo(9,2));


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}



}
