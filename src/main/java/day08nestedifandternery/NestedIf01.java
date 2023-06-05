package day08nestedifandternery;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Note: Nested Structure in Java needs too much time to be executed, that is why if it is not mandatory
              we do not use Nested Structures
        Note: If something needs too much time in Java it is called "Time Consuming".
     */

        /*
            Ask user to enter a password
            If the initial of the password is uppercase
                Check if it is ‘A’ or not.
                If it is ‘A’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
            If the initial of the password is lowercase
                Check if it is ‘z’ or not.
                If it is ‘z’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password:");

        char password = input.nextLine().charAt(0);

        if (password >= 'A' && password <= 'Z') {
            if (password == 'A') {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }else if(password>='a'&& password<='z') {
            if (password == 'z') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid Password");
            }
        }else {
            System.out.println("Invalid Password");
        }
    }

    }

