package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String args[]) {
        Shape shape;
        shape = new Square(8);
        shape.setColor("RED");

        getShapeInfo(new Square(8));
        getShapeInfo(new Rectangle(2, 3));

    }

    public static void getShapeInfo(Shape s) {
        System.out.println("The " + s.getName() + " area of shape = " + s.calculateArea());
        System.out.println("The " + s.getName() + " perimeter of shape = " + s.calculatePerimeter());
        System.out.println("--------------------------------------");
    }
}
