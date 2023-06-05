package Practices01;

import java.util.Scanner;

public class Q02Scanner {
    public static void main(String[] args) {

        // Ask user to enter his/her first name last name age height and weight

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name, last name age height weight");

        String name = input.next();
        System.out.println("Please enter your last name:");
        String lastName = input.next();
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Please enter your height:");
        double height = input.nextDouble();
        System.out.println("Please enter your weight");
        double weight = input.nextDouble();
        System.out.println("First Name: " + name + "\n" + "Last Name: " + lastName + "\n" + "Age: " +
                age + "\n" + "Height: " + height + "\n" + "Weight: " + weight);

    }
}
