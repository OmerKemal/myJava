package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {
        Student std1=new Student();

        System.out.println("std1.getStdID() = " + std1.getStdID());

        std1.setStdID("AB2023VA");
        System.out.println(std1.getStdID());

    }
}
