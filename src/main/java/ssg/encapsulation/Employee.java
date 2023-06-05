package ssg.encapsulation;

public class Employee {
    // Task 2: Create an Employee class with 3 attributes: name, age and salary. Make it read only.
    //Create public method to modify the salary attribute.
    // Also create a separate increaseSalary() method that increases the salary by a specified percentage.
    // Increase the salary of the employee by 10%.
    //Create an instance of employee in EmployeeManagementSystem class and demonstrate controlled access
    // through encapsulation.


    private String name;
    private int age;
    private double salary;

    public void updateSalary(double salary){
        this.salary=salary;
    }

    public void increaseSalary(double percentage){
        salary=salary+ (salary*percentage/100);
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
