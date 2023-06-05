package day27encapsulationabstraction;

        /*
               1) Method without body is called abstract method;
               2) Sometimes no child uses the body of a method in the parent class so no need to put body for the method
               if you do not have a bdy for the method, it means you are creating an abstract method
               3) To create an abstract method;
                    i)Do not type the body of the method.
                    ii)Use "abstract" keyword between class modifier and return type.
                    iii) Make the class abstract
               4) What is the difference btw abstract methods and regular (concrete) methods;
                    i)abstract methods focus on what to do; concrete - what and how;
               5) Abstract classes must be overridden by the child classes,
               6) An abstract class can have abstract methods, can an abstract class have concrete method?
                    Abstract class can have both abstract methods and concrete methods
               7) "Concrete methods" are not mandatory for the child class to override.
               8) abstract methods must be overridden by the concrete child classes.
                    if the child class is abstract it is optional to override abstract methods.
               9) Abstract methods cannot be private because they must be overridden by the child classes
               10) Abstract methods cannot be final
               11) Abstract methods have abstract methods,
               abstract methods do not have a body it means abstract methods are uncompleted methods
               Because of that Java does not let us create objects from abstract classes.
               12)"Abstract Class" is a class that is why it has a constructor but the constructor cannot create an object
         */

public abstract class Courses {
    public abstract void math();

    public void art(){

        System.out.println("Learn painting");

    }
}
