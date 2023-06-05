package day04scannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Exp: Ask user to enter five digits number
        // Print the sum of the first two and last two digits
        //45673 ==== 45+73=118

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter five digits number");
        int num= input.nextInt();
        int firstTwo = num/1000;
        int lastTwo = num%100;
        System.out.println("The sum is " + (firstTwo+lastTwo));

    }
}
