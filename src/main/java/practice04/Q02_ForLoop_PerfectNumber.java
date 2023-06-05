package practice04;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {

    /*
   Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
   A perfect number is a positive integer that is equal to the sum of all its proper divisors.
   6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
    */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to see if it is perfect:");
        int num= scanner.nextInt();
        int sum = 0;

        for (int i= 1; i<=num/2; i++){
            if(num%i==0) {
                sum+=i;
            }
        }

        if (sum==num){
                System.out.println(num + " is a perfect number");
            }else {
                System.out.println(num + " is not a perfect number");
            }
    }
}
