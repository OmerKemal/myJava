package day04scannerclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {

    // next() method is just for getting a word from the user
    //nextLine() is a method to get a full line of answer
    //nextInt is to get an integer from the user
    //nextDouble()
    //nextBoolean()

    public static void main(String[] args) {
        //example 1: Ask user to enter full name ii) Age iii) Height iv) Marital Status
        //then print them on the console in different lines with label:

        //1: Step: Create Scanner Object
        Scanner input = new Scanner(System.in);


        //Step 2: Give message to user about what todo:

        System.out.println("Please enter your full name");

        // Step3: Use appropriate method to get data from the user:

        String fullName = input.nextLine();

        System.out.println("Your full name is " + fullName);

        // Step 4:

        System.out.println("How old are you?");

        int age = input.nextInt();

        System.out.println("Your age is " + age);

        System.out.println("Please enter your height.");

        double height= input.nextDouble();

        System.out.println("Your height is " + height);

        System.out.println("Please tell me if you are married?");

        boolean isMarried = input.nextBoolean();

        System.out.println("Is married?" + isMarried);

        System.out.println("How many books do you have?");
        int bookAmount=input.nextInt();
        System.out.println("You have "+ bookAmount + " books");

        System.out.println("how much water do you drink in a single day");
        String waterAmount=input.nextLine();
        System.out.println("you drink " + waterAmount);

    }
}
