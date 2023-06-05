package day07itstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Example: Ask user to enter his age then print his situation according to the given data
        //0-4-->baby 5-12-->Kid 13-20-->Young 21-30-->Adult 31-?-->Undefined
        //***Always test the critical values of your code like -5 - 0-4-5-12-13-20-21-31-32
        //this is called boundary value test
        //Every task is pointed by the team in IT companies,
        // the duration of this testing is decided by ... master
        //

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age=input.nextInt();
        if(age<0){
            System.out.println("Invalid age");
        }
        else if(age<5){
            System.out.println("You are a baby.");}
        else if(age<13){
            System.out.println("You are a kid.");}
        else if(age<21){
            System.out.println("You are young.");}
        else if(age<31){
            System.out.println("You are a adult.");}
        else if(age>=31){
            System.out.println("You are age is undefined.");}
        else {
            System.out.println("Undefined age");
        }

    }
}
