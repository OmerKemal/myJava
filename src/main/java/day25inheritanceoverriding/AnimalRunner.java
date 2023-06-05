package day25inheritanceoverriding;

public class AnimalRunner {
    /*
        1)If a variable exists in a class Java uses the variable from the class itself
        2)If a class does not have the requested variable in it Java looks for the variable from the parent classes
        3)If you use "this" inside the constructor, it means you are calling a variable from the same class
        4)If you use "super" inside the constructor, it means you are calling a variable from the first level parent class

        ***What is the difference between "this()" and "super()"?
                    this() is used to call constructors from the class itself
                    super() is used to call constructors from the first level parent class

        ***What is the difference between "this" and "this()"?
        "this()" is used to call constructors from the class itself
            "this" for is calling a variable from the same class

       ***What is the difference between "super" and "super()"?

       "super()" is for calling constructors from the first level parent class
       "super" is for calling variables from the first level parent class

         */


    public static void main(String[] args) {
        Cat myCat=new Cat(); // here first it will go to the constructors, don't forget that // 14 and 6
        System.out.println("myCat.initial = " + myCat.initial); //'A' ---> Cat class goes to the parent class for the initial
        System.out.println(myCat.age); // 14


        // When you create an object you can select the data type of the object from the class itself, from any parent class:
        // when you select a variable, focus on the data type of the object
        // the variable will be first determined by the class used for the data type of the object, like "Mammals class";

        Animal cat1=new Cat(); //14 - 6
        Mammals cat2=new Cat(); // 14 - 6
        Object cat0=new Cat(); // 14 - 6
        Cat cat3=new Cat();  //14 - 6

        System.out.println("cat3.age = " + cat3.age);
        System.out.println("cat2.age = " + cat2.age); // even if it is a cat object; the variables depend on the mammals class;
        System.out.println(cat2.name); // "Doggy"
    }


}
