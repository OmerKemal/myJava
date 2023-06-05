package day04scannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Exp: Ask user to enter width and the length of a rectangle then calculate the perimeter and the area

        System.out.println("Please enter width and height of a rectangle.");

        Scanner input = new Scanner (System.in);
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("The perimeter is " + (2*length+2*width));
        System.out.println("The perimeter is " + width*length);

    }
}
