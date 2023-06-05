package ssg.constructors;

public class Employee {
    String name;

    // Create an Employee object using constructor (parameterised or not)

    public Employee (){

    }

    public Employee(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
    }



}
