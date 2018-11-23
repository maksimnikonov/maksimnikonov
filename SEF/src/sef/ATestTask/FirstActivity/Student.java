package sef.ATestTask.FirstActivity;



public class Student extends Person {


    public Student(){}

    private String name = "mahdi ";
    private int age = 16;

    public String  announce () {
        return "I am study in university" + " and my name is " + name + " and my age is " + age;
    }
}