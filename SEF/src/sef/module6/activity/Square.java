package sef.module6.activity;

public class Square extends Shape {

    //attributes
    private double side;

    //constructor
    Square(double side) {
        this.side = side;
        this.setName("square");
    }

    //getters and setters

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area;
        area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
