package Practices01;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Q03Scanner {
    public static void main(String[] args) {

        // Type a code that calculates the hypotenuse:


        Scanner input =new Scanner (System.in);

        System.out.println("Enter the length of the first leg of a right triangle");

        double x = input. nextDouble();

        System.out.println("Enter the length of the second leg:");

        double y = input.nextDouble();
        
        
        double hypotenuse= Math.sqrt(x*x+y*y);
        System.out.println("hypotenuse = " + hypotenuse);

        




    }
}
