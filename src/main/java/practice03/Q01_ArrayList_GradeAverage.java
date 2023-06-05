package practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01_ArrayList_GradeAverage {
    public static void main(String[] args) {

        //// Get as many grades as a teacher wants to enter, and find the number of students who pass the average.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> examGradesList=new ArrayList<>();

        do {
            System.out.println("Enter Exam Grade: ");
            int examGrade=scanner.nextInt();
            examGradesList.add(examGrade);
            System.out.println("Continue: Y/N");
            String condition=scanner.next();
            if(condition.equalsIgnoreCase("N")){
                break;
            }

        }while(true); // While true, infinite loop;
        double sum =0;
        for (int w: examGradesList) {
            sum+=w;
        }
        double average= sum/examGradesList.size();
        System.out.println("Average: " + average);
        int counter = 0;

        for (int w: examGradesList) {
            if (w>average) {
                counter++;
            }
        }
        System.out.println("The Average: " + average);
        System.out.println("Number of Students Above Average: " + counter);


    }








    //        ArrayList<Integer> grades= new ArrayList<>();
    //        Scanner scan = new Scanner(System.in);
    //        System.out.println("Please enter the grade: ");
    //        int sum=0;
    //        Integer n = scan.nextInt();
    //        grades.add(n);
    //
    //        for(int w: grades) {
    //            sum = sum+w;
    //        }
    //        double average= sum/grades.size();
    //        int counter = 0;
    //        for (int u:grades) {
    //            if(u>average){
    //                counter++;
    //            }
    //        }
    //        System.out.println(counter);
}
