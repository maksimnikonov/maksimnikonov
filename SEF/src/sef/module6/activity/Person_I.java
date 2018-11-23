package sef.module6.activity;

/* Person_I class is the superclass
 * Attributes : name, age
 */
public class Person_I {

    //Attributes
    private String firstName;
    private String secondName;
    private int age;

    //Constraction
    Person_I() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    Person_I(String fName, String sName, int age) {
        this.firstName = fName;
        this.secondName = sName;
        this.age = age;
    }

    //Getters
    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public void announce() {
        System.out.println("My name is " + firstName + " " + secondName + " and my age is " + age + ".");
    }

    //Behavior - write default constructor. Print 'I'm Person_I constructor'


    //Behavior - write parameterized constructor


    // write getter for String name


    // write setter for String name


    // write getter for int age


    // write setter for int age

}

