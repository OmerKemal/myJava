package day24inheritance;

public class Vehicle {

    /*
    1) Every class except the "Object Class" has a parent class
    2) Object Class is the parent class of all classes in Java
    3) only "Object Class" does not have a parent class
    4) Java executes constructors from top to bottom
    5) To be able to execute constructors from top to the bottom Java goes to the Object Class first by the help of the "super()"
    6) super is for calling constructor from the first level parent class
    7)super() is located by Java into every constructor but it is invisible to us,
    8)if you want you can type super explicitly
    9) when you type super() explicitly, you have to type it to the first line of the constructor body.
    10)"this()" is for calling constructors from the class itself
    11)When you type "this()", you have to type it in the first line of constructor body.
    12) "this()" and "super()" cannot be used in the same constructor together, because if you put anyone of them in the
    first line the other one cannot be put in the first line
     */

    public void move(){
        System.out.println("All the vehicles move");
    }

    public void pricing(){
        System.out.println("To buy a vehicle, you should pay the price");
    }

    public Vehicle() {
        super();
       System.out.println("Vehicle constructor.");

    }
    public Vehicle (String name) {
        this();
        System.out.println("Vehicle constructor with string parameter...");

    }
}
