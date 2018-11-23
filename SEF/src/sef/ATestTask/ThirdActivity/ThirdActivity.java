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
        } catch (CustomException e) {
            e.printStackTrace();
        }
        ta.catchExeption();
        ta.catchMe(10, 0);
    }

    void catchExeption() {
        int [] arr={0,1,2,3,4,5,6,7,8,9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.print( "  \t "+ arr[i]);
            }

        }catch(Exception e ){

            System.out.println("\t"+ e.toString());
        }finally {
            System.out.println("This should get printed even if there is an exception");

        }

    }

    void validateUser(String name) throws CustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO 2 if name in a list -> set flag=1


        for(int i=0;i<4;i++)
        {

            if  (validUsers[i].equals(name) ) flag = 1 ;

        }
// if at the end flag=0 -> throw the exeption
        if( flag == 0)
            throw new CustomException();

        }


    // Catch Me If You Can

    void catchMe(int num1, int num2)
    {

        try {
                int result = num1 / num2;
                System.out.println("The result is :" + result);
        }catch (Exception e) {
                System.out.println(" You Can Not divide on 0  ");

        }finally {
                System.out.println("Thank you for using this program.");
        }
    }
}

 class CustomException extends Exception {


    public String getMessage() {
        //3 - Enter a message in it and return the same

        return " You are not allowed ";
    }
}



