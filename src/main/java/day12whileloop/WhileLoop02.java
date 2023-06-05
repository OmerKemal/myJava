package day12whileloop;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        /*
            Example 1: Write a Java Program to Print Rectangle Star Pattern using while Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the row and column numbers");
        int columns = input.nextInt();
        int rows= input.nextInt();
        int i = 1;

        while (i<=rows){
            int k= 1;
            while(k<=columns){
                System.out.print('*');
                k++;
            }
            System.out.println();

            i++;
            

        }
    }
}
