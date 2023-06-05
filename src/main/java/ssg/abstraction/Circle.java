package ssg.abstraction;
public class Circle extends Shapes{
    double radius;
    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        System.out.println("Inside the Circle constructor");
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Name of the shape: " + nameOfShape + " and the area is: " + calculateArea();
    }
}
