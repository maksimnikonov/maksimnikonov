package sef.ATestTask.SecondActivity;
// Complete Code

	public class SecondActivity {

		public static void main(String[] args) {
			SecondActivity calculator = new SecondActivity();


			//TODO Use the calculator to calculate different values
			//Example ->
			int result = calculator.sum(10, 5);
			System.out.println("10 + 5 = " + result);

			result =calculator.divide(100, 33);
			System.out.println("100 / 33 = " + result);

			result =calculator.substract(32, 23);
			System.out.println("32 - 23 = " + result);

			result =calculator.multiply(22, 87);
			System.out.println("22 * 87 = " + result);
		}

		public int sum(int a, int b) {
			return a + b;
		}

		public int substract(int a, int b) {
			return a - b;
		}

		public int multiply(int a, int b) {
			return a * b;
		}

		public int divide(int a, int b) {
			if (a == 0 || b == 0)
				return 0;
			else
				return a / b;
		}

		//TODO create the Calculator (here or in additional class)

	}


	//TODO create the Calculator (here or in additional class)

}
