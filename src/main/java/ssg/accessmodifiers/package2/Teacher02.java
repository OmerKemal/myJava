package ssg.accessmodifiers.package2;

import ssg.accessmodifiers.package1.Student;

public class Teacher02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);// you can only get name,
        // because there is no inheritance
    }
}
