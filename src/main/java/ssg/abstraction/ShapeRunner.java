package ssg.abstraction;

public class ShapeRunner {

    public static void main(String[] args) {
        // Shapes shapes = new Shapes() // we cannot create an object from an abstract class


        Circle circle = new Circle("Circle", 3);
        System.out.println(circle);

        circle.getNameOfShape();


        Shapes circle2=new Circle("Circle", 4);
        System.out.println(circle2);
    }
}
