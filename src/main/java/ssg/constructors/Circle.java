package ssg.constructors;
/*
    Design a class named Circle.
    Construct three circle objects with radius 2.0, 12 and 24
    and display the radius and area of each.
    A no-arg constructor sets the default value of radius to 1.
    A getArea() method is used to return the area of circle.
     */

public class Circle {

    double radius;
    public double getArea(double radius){
        double area= radius*3.14;
        return area;
    }

    Circle(){
        radius=radius/radius;
    }

    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1.radius);
        circle1.getArea(2.0);
        Circle circle2=new Circle();
        Circle circle3=new Circle();
    }

}
