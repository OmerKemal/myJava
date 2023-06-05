package day12whileloop;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // while loop;

        int i= 1;
        while (i<1) {
            System.out.println("I am while loop");
            i++;
        }


        // do-wjile loop:
        int k= 1;
        do {
            System.out.println("I am do-while loop");
            k++;
        }while (k<1);

        //Note : While loop checks the condition first then executes the loop body;
        // if the condition is false loop body will not be executed even once;
        // Zero execution is possible with while loop
        // do-while loop executes the body and then checks the condition

        //Example 1; Ask user to enter an integer.
        // ıf the integer is less than 100, the user "wins", otherwise he loses;

        Scanner input=new Scanner(System.in);

        do{
        System.out.println("Please enter a number");
        int u= input.nextInt();

        if (u<100) {
            System.out.println("You Won!...");
        }else {
            System.out.println("You Lost! . . .");
            break;
        }

        } while(true);

    }
}
