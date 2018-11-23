package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO 1 handle exception on proper way

        try {
            ta.validateUser("Ivan");
            ta.catchExeption();
        } catch (Exception e) {
            System.out.println("Warning: Some  exception");
        }
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
        } finally {
            System.out.println("This should get printed even if there is an exception");

        }
    }
        void validateUser (String name)  throws Exception {
            String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
            int flag = 0;
            if (flag == 0) throw new Exception();
            //TODO 2 if name in a list -> set flag=1
            // if at the end flag=0 -> throw the exeption
        }

        void catchMe ( int num1, int num2){
            //TODO 3 Catch exeption
            int result = num1 / num2;
            try {
            System.out.println("The result is :" + result);}
            catch (ArithmeticException ae) {
                System.out.println("Division by zero is not allowed");
            }

            //TODO 4 prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

        }
    }

