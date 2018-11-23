package sef.ATestTask.SecondActivity;
public class SecondActivity {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		System.out.println("10) substr result is " + calculator.sum(10.2,5));
		System.out.println("20) Multiplication result is " + calculator.multiply(12,25));
		System.out.println("30) divide result is " + calculator.divide(100,33));



	}

	//TODO create the Calculator (here or in additional class)
	public static class Calculator {


		private String calculator;


		// Default constructor
		public Calculator() {
		}

		// Parameterized constructor
		public Calculator(String calculatorType) {
			this.calculator = calculator;
		}

		// Getter for CalculatorType
		public String getCalculatorType() {
			return calculator;
		}

		// Setter for CalculatorType
		public void setCalculatorType(String calculator) {
			this.calculator = calculator;
		}

		// Add
		public double sum(double x, double y) {
			double sum = x + y;
			return sum;
		}

		// Subtract
		public int subtract(int x, int y) {
			int diff = 0;
			if (x > y) {
				diff = x - y;
			} else {
				diff = y - x;
			}

			return diff;
		}

		// Multiply
		public int multiply(int x, int y) {
			int multiply = x * y;
			return multiply;

		}

		// Divide
		public int divide(int x, int y) {
			int divValue = 0;
			if (x == 0 || y == 0) {
				divValue = 0;
			} else {
				divValue = x / y;
			}
			return divValue;

		}


	}


