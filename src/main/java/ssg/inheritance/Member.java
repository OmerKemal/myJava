package ssg.inheritance;

public class Member {
    /*
    •Create a class named 'Member' having the following members:
 1 - Name
 2 - Age
 3 - Phone number
 4 - Address
 5 – Salary
•It also has a method named 'printSalary' which prints the salary of the members.
•Two classes 'Employee' and 'Manager' inherits the 'Member' class.
•The 'Employee' and 'Manager' classes have variables 'specialization' and 'department' respectively.
•Now, assign name, age, phone number, address and salary to an employee
and a manager by making an object of both of these classes and print the same.
     */

    String name;
    int age;
    int phoneNumber;
    String address;
    int salary;

    public static void printSalary(){
        System.out.println();
    }
}
