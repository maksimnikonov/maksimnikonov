package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {


	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		// Use the calculator to calculate different values

		calculator.sum(10.3, 5.0);
		calculator.divide(100.0, 33.0);
		calculator.subtract(100.0, 45.7);
		calculator.multiply(10.3,33.6);


	}

	// create the Calculator (here or in additional class)
	//public class Calculator {


		// Add


		public double sum(double x, double y) {
			double sum = x + y;
			return sum;
		}


		// Subtract
		public double subtract(double x, double y) {

			return x-y;
		}

		// Multiply
		public double multiply(double x, double y) {
			double multiply = x*y;
			return multiply;

		}

		// Divide
		public double divide(double x, double y) {
			double divValue = 0.0;
			if (x == 0.0 || y == 0.0) {
				divValue = 0.0;
			} else {
				divValue = x / y;
			}
			return divValue;

		}

}