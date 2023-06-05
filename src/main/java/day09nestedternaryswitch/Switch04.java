package day09nestedternaryswitch;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
                /*
        Switch Statement can be used with String, int, char but cannot be used with long, double, float, boolean
     */

        //Example 1: Create a calculator does +, -, *, /, %

        Scanner input = new Scanner(System.in);

        System.out.println("Choose one of the following operations: +, -, *, /, %");

        char opr = input.next().charAt(0);

        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        switch (opr) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid operation");
        }



    }
}
