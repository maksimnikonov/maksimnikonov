package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        ta.validateUser("Ivan");
        ta.catchExeption();
        //TODO 1 handle exception on proper way
        try {
            ta.validateUser("Ivan");
        } catch (Exception e) {
            ta.catchExeption();
        } finally {
            catchExeption();
        }
        catchMe(10, 5);
    }

        static void catchExeption () {
            try {
                int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

                for (int i = 0; i <= 10; i++) {
                    System.out.println(arr[i]);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                System.out.println("This should get printed even if there is an exception");
            }
        }


        void validateUser (String name){
            String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
            int flag = 0;
            //TODO 2 if name in a list -> set flag=1
            for (int i = 0; i < validUsers.length; i++) {
                if (validUsers[i].equals(name)) {
                    flag = 1;
                }
            }
            // if at the end flag=0 -> throw the exeption

            if (flag == 0) {
                System.out.println("You are not allowed to use this program");
            } else {
                System.out.println("You are allowed to use this program");
            }
        }

        static void catchMe ( int num1, int num2){
            //TODO 3 Catch exeption
            int result = num1 / num2;
            System.out.println("The result is :" + result);

            try {
                result = num1 / num2;
            } catch (ArithmeticException ae) {
            } finally {
                //TODO 4 prints a message "Thank you for using this program." always
                System.out.println("Thank you for using this program.");

            }

        }
    }


