package day24inheritance;

public class Civic extends Honda{
    public void ecoSystem(){
        System.out.println("Civic has ecosystem.");
    }

    public Civic() {
        super (2021); // checking the parent class and looking for a constructor with an integer parameter
        System.out.println("This is Civic constructor");
    }

    public Civic (boolean hybrid){
        this();
        System.out.println("Civic constructor with a boolean parameter");
    }
}
