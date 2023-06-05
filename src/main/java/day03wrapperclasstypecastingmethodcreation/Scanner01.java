package day03wrapperclasstypecastingmethodcreation;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //How to create an Object in a class?
        // 1. Class Name
        //2. Object name
        //3. Assignment Operator
        //4. "new" keyword
        //5. Constructor - some use parameter some don't

        //Java creates perfect templates

        Scanner input = new Scanner(System.in); // this is how we create an object

        System.out.println("hey user enter your first name...");

        String name = input.next();
        System.out.println("Your name is " + name);

        System.out.println("how are you?");
        String mood = input.next();
        System.out.println("You are "+ mood);

    }
}
