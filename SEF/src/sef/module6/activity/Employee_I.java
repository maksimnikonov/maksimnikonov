package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {

    //Attributes
    private double salary;
    private String title;

    //Constraction
    Employee_I() {
        this.salary = 0;
        this.title = "Unknown";
    }

    Employee_I(String fName, String sName, int age, String title, double salary) {
        super(fName, sName, age);
        this.salary = salary;
        this.title = title;
    }

    //Getters
    public double getSalary() {
        return this.salary;
    }

    public String getTitle() {
        return this.title;
    }

    //Setters
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void announce() {
        super.announce();
        System.out.println("My salary is " + salary + " and my title is " + title + ".");
    }
    //Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
}

    // write getter for int salary


    // write setter for int salary


    // write getter for String title


    // write setter for String title


