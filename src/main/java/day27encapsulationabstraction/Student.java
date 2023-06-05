package day27encapsulationabstraction;

public class Student {
    /*
    1) What is encapsulation?
        Data hiding
    2) How to hide a data?
        By using private access modifier
    3)Why do we need encapsulation
        i) to protect data from outside affects
    4) Can you read encapsulated data if you need?
        by get method
    5) Can you update
        Yes, with set method
    6) By using set methods, we are able to work with fewer objects
        After creating an object, we update it and use it as a different object
        Instead of creating 4 objects for Math, Science, Art, English, teachers, we create just a single teacher object
        and set it to Math teacher object or others whenever we need.

    7) set methods update object not the template

    Interview question:
        i)method overriding needs inheritance but method overloading doesn't
        ii)"method overriding" does not change the method signature; but method overloading does
        ii) Method overriding changes the method body; method overloading changes the parameter
        ii)private methods cannot be overridden but can be overloaded
        iv)static method's cannot be overridden can be overloaded
            Because static methods are common for all objects, if you change the implementation by using a simple object,
            other objects will be effected as well. This can create problems in our application. That is why Java
            does not let us override static methods.


            Note 1: Other name of "Method Overloading" is "Static Polymorphism"
                    Other name of "Method Overriding" is "Dynamic Polymorphism"
            Note 2: Could you explain "final" keyword.
                    Final keyword can be used for i) Variables ii)Methods iii)Classes
                    i) if you use final keyword for a variable
                        a) You have to initialise (assign value) the variable ,
                        b) You cannot change the initial value
                    ii)if you use the final keyword for a method, its body cannot be updated.
                        Because of that "final methods" cannot be overridden.
                    iii)if you use the final keyword for a class, the class cannot have a child class.
                        "Final class" can be a child class, but it cannot have a child class.

        v) final method cannot be overridden but can be overloaded
        Because, in overriding we change the method body, but final method do not let us change the method body.
     */
        private String stdID= "TH2023FL";
        boolean success = true;

        // getter method to open the capsule
        public String getStdID(){

            return stdID;
        }
        //set method to update the value of stdID
        public void setStdID (String stdID){
            this.stdID = stdID;
        }

        // how to type set method by the help of the intellij

    // right button - generate - setter - choose the variable name - ok

        // if the data type of encapsulated data is boolean, getter method name starts with "is" rather than get
        public boolean isSuccess (){
           return success;

        }




}
