package day11forlooploop;

import java.util.Scanner;

public class NestefForLoop01 {
    public static void main(String[] args) {
        // Ex 1: Thype a code to get the output like ;
        /* Week: 1
                Day: 1
                Day: 2
                ....
           Week: 2
                Day: 1
                Day: 2
                ....
           Week 3:
                Day: 1
                Day: 2
                ...
         */

        for (int i = 1; i<5; i++) {
            System.out.println("Week: " + i);
            for (int k= 1; k<3; k++) {
                System.out.println("    Day: " + k);
            }
        }

        //Example 2:  Write a program to print Rectangle star pattern using for loop
        /*
        *****
        *****
        *****
        Note: get the number of rows and the columns from the user:
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter row and column numbers");
        int rows= input.nextInt();
        int columns= input.nextInt();

        for (int i= 1; i<=rows; i++) {
            for(int k=1; k<=columns; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
