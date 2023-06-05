package day24inheritance;

public class Honda extends Vehicle {

    public void speed (){
        System.out.println("The car is too fast");
    }
    public void brake(){
        System.out.println("The car breaks");
    }

    public void engine(){
        System.out.println("Honda uses perfect engine.");
    }

    public Honda() {
        super();
        System.out.println("This is our Honda constructor.");
    }
    public Honda (int year){
        super ("Luxury Honda");
        System.out.println("Honda constructor with int parameter...");
    }
}
