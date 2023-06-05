package day32exception;

/*
1)When you use "multiple catch block"s after "try-block" the order of "multiple catch block"s does not matter.
  You can put them in any order but following the code order is the best practice
  Note: But some Exception Classes are the parent of another Exception Classes, when you use parent -child Exception Classes
        Child Exception Class must come first
2)"try-block" cannot be used alone;
        i)"try-block" + single catch block
        ii)"try-block" + multiple catch block
        iii)"try-block" + finally block
        iv)"try-block" + single catch block + finally block
        v)"try-block" + multiple catch block + finally block
 */

public class Exceptions02 {
    public static void main(String[] args) {

        System.out.println(divideByNumOfCharsInSTring1("240"));
        System.out.println(divideByNumOfCharsInSTring1("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInSTring1("2")); // ArithmeticException
        System.out.println(divideByNumOfCharsInSTring1(null)); // NumberFormatException

        System.out.println(divideByNumOfCharsInSTring2("240"));
        System.out.println(divideByNumOfCharsInSTring2("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInSTring2("2")); // ArithmeticException
        System.out.println(divideByNumOfCharsInSTring2(null)); // NumberFormatException

    }

    //Example 1: Create a method that divides an integer converted from a String
    // by 1 less than the number of characters of the String

    //1. Way to solve multiple exceptions
    public static int divideByNumOfCharsInSTring1(String s){

        try{
            return Integer.valueOf(s)/(s.length()-1);
        }catch (NumberFormatException e){
            System.out.println("Do not use non-digit characters");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }catch (ArithmeticException e) {
            System.out.println("There is a problem in the mathematical operation");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }catch (NullPointerException e){
            System.out.println("Do not use null as the value");
            return 0;
        }

    }

    public static int divideByNumOfCharsInSTring2(String s){

        try{
            return Integer.valueOf(s)/(s.length()-1);
        }catch (Exception e){
            System.out.println("Exception was caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }

    }
}
