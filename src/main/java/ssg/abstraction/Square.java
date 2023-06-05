package ssg.abstraction;
public class Square extends Shapes{
    double length;
    public Square(String nameOfShape, double length) {
        super(nameOfShape);
        System.out.println("Inside Square class");
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return length*length;
    }
    @Override
    public String toString() {
        return "Name of the shape: " + nameOfShape + " and its area is: " + calculateArea();
    }
}
