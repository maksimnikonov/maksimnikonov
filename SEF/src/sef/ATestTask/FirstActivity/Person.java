package sef.ATestTask.FirstActivity;


import sef.ATestTask.ThirdActivity.CustomExceptionActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

private String firstName;
private String secondName;
private int age;

    //Behavior - default constructor
    public Person() {

    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    // getter & setter for String firstName
    public String getFirstName() {
        return firstName;
    }

// 8) Task for 1.5 point - when set firstName and secondName, check no numbers there. ->
//setName("Ivan3") should throw the exception




    public void setFirstName(String firstName) throws CustomExceptionActivity {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(firstName);

        if(m.matches()) {
            throw new CustomExceptionActivity();
        } else {
            this.firstName = firstName;
        }
    }


    // getter & setter for String secondName
        public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    // getter & setter for int age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //TODO 2 add all person info into announce() method
    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + " and I am" + getAge() + " years old";
    }
}

