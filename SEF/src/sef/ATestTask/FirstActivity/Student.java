package sef.ATestTask.FirstActivity;


public class Student extends Person {


    public Student(){}

    private String name = "Alina";
    private int age = 16;
    private String schoolName = "Skola";
    public String  announce () {
        return "I am study in university" + schoolName + " and my name is " + name + " and my age is " + age;
    }
}
