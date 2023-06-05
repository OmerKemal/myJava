package practice03;

import java.util.Scanner;

public class q02_DoWhileGuessGame {
    public static void main(String[] args) {
        ///*
        //    Write a game that finds random numbers between 0 and 100.
        //    Hint: If the number you entered is less than randomNumber print ==> Enter a larger number.
        //    If the number you entered is greater than randomNumber print  ==> Enter a smaller number.
        //    If the number you entered is equal to randomNumber print  ==> Congratulations!!!  You found the number.
        //     */

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Enter a number between 0 and 100:");

        int guessNumber = 10;
        do {
            int number = scanner.nextInt();
            guessNumber--;
            if (number < randomNumber) {
                System.out.println("Enter a larger Number");
                System.out.println("You have" + guessNumber + "guess(es)");
            } else if (number > randomNumber) {
                System.out.println("Enter a smaller number");
                System.out.println("You have" + guessNumber + "guess(es)");
            } else {
                System.out.println("Congratulations!!! You Won!!!");
                System.out.println("You found the number in " + (10 - guessNumber) + "guess(es)");
                System.out.println("Your point is :" + ((guessNumber + 1) * 10));
                break;
            }

            if (guessNumber == 0) {
                System.out.println("You failed");
                System.out.println("Continue: y/N");
                String condition = scanner.next();
                if (condition.equalsIgnoreCase("Y")) {
                    System.out.println("Enter a number between 0 and 100:");
                    guessNumber = 10;
                    randomNumber = (int) (Math.random() * 101);
                } else {
                    break;
                }
            }

        } while (true);

        System.out.println("Good By!!!");


    }
}
