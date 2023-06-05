package exercises.exercise01;

public class TernaryStatement01 {
    public static void main(String[] args) {
        String psw = "kmvkemvkb n";
        String correct = psw.replaceAll("\\s", "").length() >= 8 ? ("Valid") : ("Invalid");
        System.out.println(correct);


        //Example 2: Use ternary to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int x = 4;
        int y = 5;
        int z = 6;

        String triangleType = (x == y && y == z) ? "Equilateral" :
                (x == y && x != z || y==z && z!=x || x==z && y!=z) ?
                ("Isosceles") : "Neither";
        System.out.println(triangleType);


        //Exercise 3: Use ternary to print
        //a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater
        //than or equal to 5
        //b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
        //than 5
        //For example; 127 will be rounded up and the value will be 130
        //125 will be rounded up and the value will be 130
        //123 will be rounded down and the value will be 120


        int d= 122;
        Object o = d%10>4 ? ("Round up by last digit: "+ (d + (10-d%10))) :
                ("Round down by last digit: "+ (d-d%10));
        System.out.println(o);


        // Exercise 4: Type Apex code by using nested ternary.
        //Write a program to check if a year is a leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.

        int year = 2002;

        String isLeap= year%100 == 0 ? (year%400==0? "Leap Year" : "Not Leap Year") :
                (year%4==0? "Leap Year" : "Not Leap Year");
        System.out.println(isLeap);



        //Exercise 5: Type code to check the password
        //If it has more than 8 characters, initial should be 'i'
        //If it does not have more than 8 characters initial should be 'K'
        //Solve the task by using nested-ternary

        String psd= "ngjrgrnfk";

        String checkPassword= psd.length()>7 ? (psd.charAt(0)=='i' ? "Valid" : "Invalid") :
                (psd.charAt(0)=='K' ? "Valid": "Invalid");
        System.out.println(checkPassword);







    }
}
