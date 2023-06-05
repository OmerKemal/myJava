package exercises.freeexercise01;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(){
        make = "Unknown";
        model = "Unknown";
        year = 2021;
        color = "Black";
    }

    public Car (String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public static void main(String[] args) {
        Car car1= new Car(){};
        Car car2=new Car("Volkswagen", "Jetta",2015,"Black"){};


    }

}

