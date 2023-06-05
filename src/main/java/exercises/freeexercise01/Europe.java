package exercises.freeexercise01;

public class Europe {
    public String currency = "Euro";
    public int population;
    public String weather;

    public void freedom(){
        System.out.println("Freedom of Speech");
    }

    public boolean hasSeaside;

    public Europe (boolean hasSeaside){
        this.hasSeaside = hasSeaside;

    }

    public Europe() {
        System.out.println("This is Europe Constructor");
    }

    public Europe(int population) {
        this.population = population;
    }
}
