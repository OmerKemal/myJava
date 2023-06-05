package day12whileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to print integers from 3 to 6 on the console
        int n= 3;
        while (n<7) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        // //Example 2: Type code to print odd integers from 10 to 4 on the console

        int k=10;
        while (k>3) {
            if(k%2!=0){
            System.out.print(k + " ");
            }
            k--;
        }
        System.out.println(); // to put space between this and the next question

        //Example 3: Type code to find the sum of the even integers from 10 to 13

        int l = 10;
        int sum= 0;
        while (l<14){
            if(l%2==0){
                sum=sum+l;
            }
            l++;

        }
        System.out.println(sum);

        //Example 4: Type java code by using while loop,
        //        //           Write a program that prompts the user to input an integer.
        //        //           It should then find the sum of the digits of that number.
        //        //           123 ==> 1+2+3 = 6
        int t= 547;
        t=Math.abs(t);
        int sum2= 0;
        while (t>0) {
            sum2 = sum2+ t%10;
         t=t/10;
        }
        System.out.println(sum2);

        /*
            Example 5: Type java code by using while loop,
                    Write a program that prompts the user to input a number.
                    It should then print the multiplication table of that number.
                    3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number to see its multiplication table");
        int a = input.nextInt();
        int b = 1;
        while (b<11) {
            System.out.print(a + "x" + b + "=" + a*b +" ");
            b++;

        }





    }
}
