package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		System.out.println(calculator.Sum(16 , 6));
		System.out.println(calculator.divide(100, 33));
		calculator.subtract(16,5);
		calculator.multiply(10 , 7);

		// and more

	}

	//TODO create the Calculator (here or in additional class)

	public static double Sum(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public static double subtract(double x, double y) {
		double diff = 0;
		if (x > y) {
			diff = x - y ;
		}  else  {
			diff = y-x ;
		}

		return diff;
	}

	public static double  multiply(double x , double y) {
		double temp = 0;

		temp = x * y ;

		return temp;

	}

	public static double divide(double x, double y) {
		double divValue = 0;
		if ( y == 0) {
			System.out.println(" You are not allowed to divide By 0");

		} else {
			divValue = x / y ;
		}
		return divValue;

	}

}
