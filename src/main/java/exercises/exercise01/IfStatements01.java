package exercises.exercise01;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        String month = "January";

        String mName = month.toLowerCase();

        if (mName.equals("december") || mName.equals("january") || mName.equals("february")) {
            System.out.println("Winter");
        } else if (mName.equals("march")|| mName.equals("april")|| mName.equals("may")) {
            System.out.println("Spring");
        }else if (mName.equals("june")|| mName.equals("july")|| mName.equals("august")){
                    System.out.println("Winter");
        }else if (mName.equals("september")|| mName.equals("october")|| mName.equals("november")){
            System.out.println("Winter");
        }else {
            System.out.println("invalid month name");
    }


        //Exercise 2: Type code to print
        //a) "Valid Password" if the password has at least 8 characters different from space
        //character
        //b) "Do not use space character in password" if the password has any space
        //character in any position
        //c) "Invalid Password" if a and b conditions are not satisfied
        //Note: Be careful about the orders of conditions in the solution

        String pass="bfghtbhg";
        if (pass.replaceAll("^\\s", "").length()>0) {
            System.out.println("Do not use space characters in the password");
        }else if (pass.replaceAll(" ", "").length()>=8) {
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }


        //Example 3:Type code to print
        //a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        //or equal to 5
        //b) "Round down by last digit" and print the rounded value if the last digit is less than 5

        int num= 9;
        if (num%10>=5) {
            System.out.println("Round up by last digit: " + (num/10+1)*10);
        }else if (num%10<5) {
            System.out.println("Round down by last digit: "+((num/10)*10));
        }else {
            System.out.println("You have entered invalid data");
        }

        //Exercise 4: Type code to print the name of the month when you entered the number of the month.
        //Example; For 1 output is "January", for 2 output is "February" etc.

        int m = 2;
        if (m==1) {
            System.out.println("January");
        }else if(m==2) {
            System.out.println("February");
        }


        //Exercise 5: Type code to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int a = 5;
        int b = 5;
        int c = 5;

        if (a==b && b!=c || a==c && a!=b||b==c && c!=a) {
            System.out.println("Isosceles Triangle");
        }else if (a==b && b==c) {
            System.out.println("Equilateral Triangle");
        } else {
            System.out.println("Neither isosceles, nor equilateral");
        }

        //Exercise 6: Type code to create a converter which converts mile to km, second to hour, Fahrenheit to
        //Celsius. Find the formulas for conversions from Google.
        //a) When user entered 10 and mileToKm String, your code should print "16 km"(The
        //number will be dynamic) on the console
        //b) When user entered 7200 and secondsToHours String, your code should print "2
        //Hours"(The number will be dynamic) on the console
        //c) When user entered 83 and fahrenheitToCelsius String, your code should print
        //"28.3333 Celsius"(The number will be dynamic) on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your method of conversion: kmtomile, stohour, ftocelsius");
        String method1 = input.nextLine();
        System.out.println("Enter the amount you want to convert");
        Double amount = input.nextDouble();

        double x= 20.0;
        double mileToKm = x*1.6;
        double f= 83;
        double ftoCelsius= (f-32)*5/9;
        double s = 30000;

        String newMethod1=method1.toLowerCase();
        if (newMethod1.equals("kmtomile")) {
            System.out.println(amount*1.6);
        }else if (newMethod1.equals("ftocelsius")) {
            System.out.println((amount-32) *5/9);
        }else if (newMethod1.equals("stohour")) {
            System.out.println("It is equal to " + amount/60/60 + "minutes");
        }else {
            System.out.println("you have entered an invalid method");
        }


        //Exercise 7: Type code to check the grammatical rules for full name
        //a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
        //b) Your code should print "First name or last name missed" for single words like
        //"Ali" or "Can" or "ali"
        //c) Your code should print "Format error" for all the format like "ALI CAN"
        //d) Your code should print "Name was not entered" for one or more space
        //characters like " " or " "
        //e) Your code should print "Invalid Name" if the name has any character different
        //from letters and space.

        String fullName = "mehmet Selim";
        String trimmedFullName = fullName.trim();
        int indexOfSpace=trimmedFullName.indexOf(" ");

        if(fullName.replaceAll("[A-Za-z]","").replaceAll(" ", "").length()>0) {
            System.out.println("Invalid Name");
        }
        if (trimmedFullName.charAt(0)<'A' &&fullName.charAt(0)>'Z') {
            System.out.println("Error in initials");
        }
        if (trimmedFullName.split("\\s")[1].charAt(0)<'A' &&trimmedFullName.charAt(0)>'Z') {
            System.out.println("Error in initials");
        }
        if (indexOfSpace==-1) {
            System.out.println("First name or last name is missing");

        }
        if (trimmedFullName.equals(trimmedFullName.toUpperCase())) {
            System.out.println("Format Error");
        }
        if (fullName.replaceAll("\\s", "").replaceAll("[A-Za-z]", "").length()>0) {
            System.out.println("Name was not entered");
        }



        //Exercise 8: Type code to check the format of state abbreviations in the USA
        //a) Your code should print "State abbreviations cannot have more than 2 characters" if the
        //abbreviation has more than 2 characters
        //b) Your code should print "State abbreviations cannot have lowercase characters" if the
        //abbreviation has lowercase characters
        //c) Your code should print "State abbreviations cannot have characters different from
        //letters" if the abbreviation has characters different from letters.
        //Note: If the abbreviation has more than 1 error all related error messages should be printed.
        //For example; for "fl3" your code should print, "State abbreviations cannot have more than
        //2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
        //cannot have characters different from letters"


        String abbreviation = "Xl";

        if (abbreviation.length()>2) {
            System.out.println("State abbreviations cannot have more than 2 characters");
        }if (abbreviation.replaceAll("[!a-z]", "").length()>0) {
            System.out.println("State abbreviations cannot have lowercase characters");
        }if (abbreviation.replaceAll("[A-Za-z]", "").length()>0) {
            System.out.println("State abbreviations cannot have characters different from letters");
        }

        //Exercise 9: Type code to create a simple calculator which does addition, subtraction, multiplication,
        //and division with any 2 number
        //a) When user entered 10.2 and 5 and + sign your code should print "The result is
        //15.2" on the console
        //b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
        //on the console
        //c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
        //on the console
        //d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
        //on the console

        String operator = "+";
        double n1= 1.2, n2=22;
        if (operator.equals("+")){
            System.out.println(n1+n2);
        }

        //Exercise 10: Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
        //Invalid BMI value < 0
        //Underweight = <18.5
        //Normal weight = 18.5–24.9
        //Overweight = 25–29.9
        //Obesity = BMI of 30 or greater

        double bmi = 20.0;

        if (bmi<0) {
            System.out.println("Invalid");
        }else if (bmi<= 18.5) {
            System.out.println("Underweight");
        }else if (bmi<= 24.9) {
            System.out.println("Normal");
        }else if (bmi<= 29.9) {
            System.out.println("Overweight");
        }else if (bmi >=30) {
            System.out.println("Obese");
        }




        }

}
