package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        try {
            ta.validateUser("Ivan");
        } catch (Exception e) {
            ta.catchExeption();
        } finally {
            catchExeption();
        }
        catchMe(4, 2);
        //catchMe(4, 0);
    }

    static void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        for (int i = 0; i < validUsers.length; i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }
        if (flag == 0) System.out.println("Access Denied!");
        else {
            System.out.println("Access Granted!");
        }
    }

    static void catchMe(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("The result is: " + result);
        try {
            result = num1 / num2;
        } catch (ArithmeticException e){

        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}

