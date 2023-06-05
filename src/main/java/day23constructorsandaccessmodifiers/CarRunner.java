package day23constructorsandaccessmodifiers;

public class CarRunner {
    //Methods - any name +return Type
    //Constructors - constructor of the class + not return type
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println(car1.model); //null
        Car car2=new Car("Toyota", 2021);
        Car car3= new Car("Honda", "CRV",2023,35000);
        System.out.println(car3.price); //35000


    }
}
