package ssg.abstraction;
public abstract class Shapes {
    /*
    Task 1:
Create an abstract class called Shapes with a field called nameOfShape and 2 abstract methods
calculateArea() to calculate area for each subclass
toString() to print the values on the console
Create circle, square, rectangle etc. objects
     */
    String nameOfShape;
    // constructor
    public Shapes(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }
    // getter
    public String getNameOfShape() {
        return nameOfShape;
    }
    // abstract methods
    public abstract double calculateArea();
    public abstract String toString();
}