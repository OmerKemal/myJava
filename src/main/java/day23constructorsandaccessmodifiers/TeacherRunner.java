package day23constructorsandaccessmodifiers;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher t0= new Teacher();
        Teacher t1 = new Teacher(45);
        Teacher t2 = new Teacher(45);
        Teacher t3 = new Teacher(45);

        System.out.println("t0.age = " + t0.age);


        System.out.println(t1.age);  //46
        System.out.println(t1.counter); //3

        System.out.println(t2.age); //46
        System.out.println(t2.counter); //3

        System.out.println(t3.age); //46
        System.out.println(t3.counter); //3
    }
}
