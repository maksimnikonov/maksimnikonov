package sef.module6.activity;

public abstract class Shape {
    // Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double


    //attributes
    private String color;
    private String name;


    //constructor
    public Shape() {
    }


    //getters
    public String getColor() {
        return color;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double calculateArea ();
    abstract public double calculatePerimeter ();
}
