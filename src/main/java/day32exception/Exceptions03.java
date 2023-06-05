package day32exception;

public class Exceptions03 {
    public static void main(String[] args) {
        printAge(12);
        printAge(-23);
    }
    //Example 1: Create a method that prints ages and throws Exception for negative ages.
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");

        }
        System.out.println("Your age is: " + age);
    }

    //Example 2: Create a method that prints the students math grades and
    // throws Exceptions for the values less than 0 and greater than 100.
    public static void studentGrade(int grade){

        if (grade<0||grade>100){
            throw new IllegalArgumentException("Your grade must be between 0 and 100");
        }
        System.out.println("Your grade is: " + grade);
    }
}
