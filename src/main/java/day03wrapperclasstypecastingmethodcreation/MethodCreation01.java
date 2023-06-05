package day03wrapperclasstypecastingmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(multiply(2,10, 5));
        System.out.println(getPerimeterOfRectangle(2.4,5));
    // using a method inside a main method is called "Method Call"
        //When you call a method you give actual values
        // Variables created in method parenthesis they are called "parameter"
        System.out.println(getSurfaceAreaOfARectangularPrism(3.2,5,4));

        printNameWithExclamationMark("Tom");
        System.out.println(calculateTheAreaOfARectangle(3.7,5.6));

    }

    public static int add(int a, int b){
        return a+b;
    }
    //create a method that multiplies three given integers

    public static int multiply (int a, int b, int c) {
        return a*b*c;

    }
    //Create a method that calculates the perimeter of a calculator:

    public static double getPerimeterOfRectangle(double a, double b) {
        return 2*a+2*b;
    }

    //Example3: Create a method to calculate the surface area of a rectangular prism?
    //
    public static double getSurfaceAreaOfARectangularPrism (double a, double b, double c) {
        return 2*a*b+2*a*c+2*b*c;

    }
    //Ex: Create a method prints the given name on the console with ! at the end

    public static void printNameWithExclamationMark(String name){
        System.out.println(name + "!");
    }

    //If a method  only prints smt on the console just use void as the return type
    //as it does not give you a new data, you don't need anything else.

    public static double calculateTheAreaOfARectangle(double a, double b) {
        return a*b;
    }
}



