package day05StringManipulations;

import java.util.Scanner;

public class ExerciseDay5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Password:");

        String pass = input.nextLine();
        boolean r1=pass.length()>7;
        System.out.println(r1);
        boolean r2=!pass.contains(" ");
        System.out.println(r2);
        boolean r3=pass.replaceAll("[^A-Z]","").length()>0;
        System.out.println(r3);
        boolean r4=pass.replaceAll("[^a-z]","").length()>0;
        System.out.println(r4);

        boolean r5=pass.replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println(r5);
        boolean r6=pass.replaceAll("[^0-9]","").length()>0;
        System.out.println(r6);




    }
}
