package day04scannerclass;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Example 1: Ask user to enter two numbers then do addition and
        //multiplication operations
        //Create a Scanner object
        Scanner input=new Scanner(System.in);

        //Step 2: Gİve message to user about what to do:
        System.out.println("Enter first number");

        // Step 3: Select appropriate method and get the data from the user:

        double num1 = input.nextDouble();
        System.out.println("Enter second number");
        double num2 = input.nextDouble();
        System.out.println("The sum is " + (num1+num2));
        System.out.println("The multiplication is " + num1*num2);
    }
}
