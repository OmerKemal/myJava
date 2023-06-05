package day23constructorsandaccessmodifiers;

public class Teacher {

    public static int counter=0;
    public int age = 45;

    public Teacher() {
    }

    public Teacher (int age) { // when you assign a value to this parameter, it is placed into the "this.age" container.
        this.age=age;
        this.age++;
        counter++;
    }
}
