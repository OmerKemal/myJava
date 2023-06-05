package day07itstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example1: Ask the user to enter da name and print if the day name is a week day or weekend day:
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a day name?");
        String dayName = input.nextLine();
        if(dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend day");
        }else if(dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend day");}
        else if(dayName.equalsIgnoreCase("Monday")) {
            System.out.println("Week day");}
        else if(dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Week day");}
        else if(dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Week day");}
        else if(dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Week day");}
        else if(dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Week day");}
        else{
            System.out.println("Invalid Entry");
        }
        if(dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday")){
            System.out.println("Week day");
        }

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday");
        boolean isWeekend=dayName.equalsIgnoreCase("Saturday")||
                dayName.equalsIgnoreCase("Sunday");
        if(isWeekend){
            System.out.println("Weekend");}
        else if (isWeekDay){
            System.out.println("Week day");
        }else {
            System.out.println("Invalid data");
        }

    }
}
