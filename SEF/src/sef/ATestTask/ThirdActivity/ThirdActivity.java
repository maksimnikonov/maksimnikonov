package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import sun.security.x509.Extension;

public class ThirdActivity extends Throwable {


        public static void main (String[]args){
        ThirdActivity ta = new ThirdActivity();
        divide(10, 2);
        assert divide(15, 6) == 2.5;
        //1 handle exception on proper way

        try {
            ta.validateUser("Ivan");
        } catch (ThirdActiviryExeption thirdActivity) {
            //thirdActivity.printStackTrace();
            System.out.println("You are not allowed");
        }
        try {
            ta.catchExeption();
        } catch (Exception e) {
            //thirdActivity.printStackTrace();
            System.out.println("You have some exception");
        }
    }


        void catchExeption () {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i < 10; i++)
                System.out.println(arr[i]);
        } catch (Exception e) {
            System.out.println("Here is a problem");
            System.out.println(e.toString());
            System.out.println("This should get printed even if there is an exception");
        } finally {
            System.out.println("final");
        }
    }

        void validateUser (String name) throws ThirdActiviryExeption {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy", "Ivan"};
        int flag = 0;
        for (int i = 0; i < validUsers.length; i++)
            if (validUsers[i].equals(name)) {
                flag = 1;
                System.out.println("Welcome to the program, all is ok");
            }
        if (flag == 0)
            throw new ThirdActiviryExeption();
    }


        static double divide ( double num1, int num2){
        double result = 0;
        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException a) {
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Exception!");

        }
        System.out.println("but this is ok");
        return result;
    }
    {
        System.out.println( "Thank you for using this program.");
    }

}
    // 2 if name in a list -> set flag=1


      // if at the end flag=0 -> throw the exeption



//           //T 3 Catch exeption
//           int result = num1 / num2;
//          System.out.println("The result is :" + result);

//           // 4 prints a message "Thank you for using this program." always
///           System.out.println("Thank you for using this program.");
//