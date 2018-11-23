package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println("Addition is: " + calculator.add(34.5, 20));
		System.out.println("Subtraction is: " + calculator.subtract(12.5, -7));
		System.out.println("Multiply is: " + calculator.multiply(9, 9));
		System.out.println("Divide is: " + calculator.divide(54, 2));

	}

	//TODO create the Calculator (here or in additional class)

	public static double add(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public static double subtract(double x, double y) {
		double sub = x - y;
		return sub;
	}

	public static double multiply(double x, double y) {
		double mul = x * y;
		return mul;

	}

	public static double divide(double x, double y) {
		double div = 0;
		if (y == 0) {
			System.out.println("Not allowed divide by zero");
		} else {
			div = x / y;
		}
		return div;

	}

}


