package sef.module6.activity;

public class Rectangle extends Shape {

    //attributes
    private double sideA;
    private double sideB;

    //constructor
    Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
        this.setName("rectangle");
    }

    // getters and setters

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        double area;
        area = sideA * sideB;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
