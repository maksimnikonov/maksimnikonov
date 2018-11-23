package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {


    public static void main(String[] args) {
		Calculator calculator = new Calculator();

		//TODO Use the calculator to calculate different values
		//Example ->
		calculator.sum(10.2, 5);
		calculator.divide(100, 33);
		calculator.subtract(100, 33);
		calculator.multiply(100, 33);
		// and more

	}

    public int getSum(int i, int i1) {
        return  i + i1;
    }

    public int getSubtract(int i, int i1) { return i - i1; }

    public int getMultiply(int i, int i1) {
	    return i * i1;
    }



    //TODO create the Calculator (here or in additional class)
}

class Calculator {

	public double sum (double a, double b) {
		return  a + b;
	}

	public double subtract (double a, double b) {
		return  a - b;
	}

	public double divide (double a, double b) {
		return  a / b;
	}

	public double multiply (double a, double b) {
		return  a * b;
	}

}
