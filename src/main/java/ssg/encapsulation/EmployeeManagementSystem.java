package ssg.encapsulation;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee01= new Employee("Ahmet", 36, 10000);
        employee01.getSalary();

        employee01.updateSalary(1500);

        employee01.increaseSalary(10);

        System.out.println(employee01.getSalary());
    }



}
