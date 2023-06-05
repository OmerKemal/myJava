package day02variables;

public class Variables02 {

    //Non-primitive data types:

    // they can be created by Java and by developers

    /* Java, String, Scanner, Arrays
    Developers; valuables 02, .... every data type can be one
    Non-primitive data types are infinitely many.
    String is for multiple characters - put the value between double quotes
     */
    public String nameOfStudent = "Tom Hanks";

    // What is the difference btw primitive and non-primitive?

    /* Primitive data types are produced by Java, non-primitive can be produced by both
    2) Non-primitive start with an Upper Case
    3) primitive are only eight and non-primitive are infinitely many
    4) Primitive data types will be put into Stack - small memory and
    when you create a non-primitive data type it will be put in Heap memory - big memory
    when Java puts a non-primitive data into a Heap memory, it creates an address and puts it into Stack
    like the code we use at large parking places
    5) *** Non-primitive data types have a method with them; unlike the primitive data types,
    which have just value
     */
    /* main method - works first in an application, like an engine of a car.
    Every application needs a main method, without a main method it cannot run
     */

    //How to create a method:
    //
    // A) methods producing new data - and B) not producing new data (void)
    //    // Void is a return type method; If a method does not produce new data, use "return type" void.
    public static void main(String[] args) {
        String countryName = "Germany";
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.length());

    }
}


