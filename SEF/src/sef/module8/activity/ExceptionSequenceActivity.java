package sef.module8.activity;

//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
    public static void main(String[] args) {
        divide(10, 0);
        assert divide(10, 5) == 2;
        assert divide(0, 2) == 12;
    }

    static double divide(int num1, int num2) {
        double result = 0;
        try {
            result =  num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException a) {
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }
        return result;
    }
}
