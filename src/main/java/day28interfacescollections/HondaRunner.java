package day28interfacescollections;

/*
        What is the difference between abstract classes and interface;
        1) Interface can have just abstract methods, but abstract class can have both abstract and concrete methods.
            In Java 8, Java lets us create methods with body by using default and static keywords
            In Java 9, Java lets us create methods with private keyword
        2)Interfaces have public static and final variables, but abstract classes can have every type of variables
        3) A class can have just a single "abstract" class parent, but a class can have many interface parents.
        4) Both abstract class and interface cannot give you an object,
            but abstract class has a constructor while the interface doesn't.
        5) To make an interface parent of a class we use the keyword "implement" rather than "extends"

 */

public class HondaRunner {
    public static void main(String[] args) {
        System.out.println(Engine.volume);

        Honda myHonda= new Honda();
        myHonda.eco(); // to use a default method from an interface you have to create an object first.
            // when you run myHonda.eco(); it gives you Honda Engines are economic and Honda uses hybrid eco engines
            // the second part of the result comes from a hidden method inside eco() method

        Brake.secure();
    }
}
