package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO 1 handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 9; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("This should get printed even if there is an exception");

    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy" };
        int flag = 0;
        //TODO 2 if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }

        if ((flag) == 0) try {
            throw new CustomExceptionActivity();
        } catch (CustomExceptionActivity customExceptionActivity) {
            //customExceptionActivity.printStackTrace();
        }
        else {
            System.out.println(("Welcome to payroll"));
        }
    }


    void catchMe(int num1, int num2) {
        {
            //TODO 3 Catch exeption
            try {
                int result = num1 / num2;
                System.out.println("The result is :" + result);
            } catch (ArithmeticException ae) {
            } finally {
            }

            //TODO 4 prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }

            }

        }
