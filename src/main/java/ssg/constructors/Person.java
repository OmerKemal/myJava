package ssg.constructors;

public class Person {
    public String name;
    public int age;
    public String job;

    public Person(){

    }
    public Person (String name, int age, String job){
        this.name=name;
        this.age=age;
        this.job = job;

    }

    public static void main(String[] args) {
        Person man = new Person();
        System.out.println(man.name);

        Person woman = new Person();
        System.out.println(woman.name);

        Person girl = new Person("Emily", 12, "Student");
        

    }


}