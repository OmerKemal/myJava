package day33exceptions;

public class ExceptionRunner {
    /*
    1) To declare your own strict rules on your application,
    you can create Your Own Exception Classes(Custom Exception Classes)
        For Example, if using negative values for age is so dangerous,
        you can create "IllegalAgeException Class" and you can throw "IllegalAgeException"
    2) When you name a Custom Exception Class use "Exception" word at the end of the name
    3) If you want to create "Custom Checked Exception" extend to "Exception Class".
    4) Every Exception Class must have "Constructor" and
    the constructor should use the parent constructor as well.
     */
    public static void main(String[] args) throws IllegalAgeException {
        printAge1(34);
        printAge1(-3);
        printAge2(44);
        //printAge2(-4);

        printMathGrades(78);
        printMathGrades(102);

    }
    //Example 1: Create a method to print user's age
    //1. Way:
    public static void printAge1 (int age) {
        if (age<0){
            try {
                throw new IllegalAgeException("Age cannot be negative");
            } catch (IllegalAgeException e) {
                System.out.println(e.getMessage());
            }
        }else{
        System.out.println("Your age is "+ age);
        }
    }

    //2.Way:
    public static void printAge2(int age) throws IllegalAgeException {
        if (age<0){
            throw new IllegalAgeException("Age cannot be negative");
        }
        System.out.println("Your age is " + age);
    }

    //Example 2: Create a method to print a student's math grades

    public static void printMathGrades(int mathGrade){
        if (mathGrade<0 || mathGrade>100) {
            throw new IllegalGradeException( "Grade cannot be less than zero or greater than hundred");
        }
        System.out.println("Your grade is "+mathGrade);
    }
}
