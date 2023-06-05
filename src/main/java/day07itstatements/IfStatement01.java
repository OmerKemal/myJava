package day07itstatements;

public class IfStatement01 {
    public static void main(String[] args) {
        //If it rains I will cancel the picnic.
        //Example 1: Type a code to check if  a number is even or ode?
        int x = 12;

        if (x % 2 == 0) {
            System.out.println("Even");
        }
        if (x % 2!= 0) {
            System.out.println("Not even");
        }



        //Example 2: Type code to check if initial of a String is uppercase or not?

        String s = "Miami";
        if (s.charAt(0)>='A' && s.charAt(0)<='Z') {
            System.out.println("It is upper case.");
        }
        if(s.charAt(0)<'A' || s.charAt(0)>'Z') {
            System.out.println("Not Upper case.");
        }

        // 2. Way:

        if (s.charAt(0)>='A' && s.charAt(0)<='Z') {
            System.out.println("It is upper case.");
        }
        else{
            System.out.println("Not upper case");
        }

        //Example 3: Type a code to see if a number is positive negative or zero;

        int number=-3;

        if(number>0){
            System.out.println("Positive");
        }else if(number==0){
            System.out.println("Neutral");
        }else{
            System.out.println("Negative");
        }

        //Example 4: Type code to print day name when you know they number:
            //1-->Sunday, 2-->Monday

        int dayNumber=2;
        if(dayNumber==1){
            System.out.println("Monday");}
        else if(dayNumber ==2) {
            System.out.println("Tuesday");
        }else if (dayNumber==3){System.out.println("Wednesday");}
        else if(dayNumber==4){System.out.println("Wednesday");}
        else if(dayNumber==5){System.out.println("Thursday");}
        else if(dayNumber==6){System.out.println("Friday");}
        else if(dayNumber==7){System.out.println("Saturday");}
        else {System.out.println("Invalid day number, please enter a number from 1 to 7");}

    }
}