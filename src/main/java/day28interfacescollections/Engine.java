package day28interfacescollections;

public interface Engine extends Details {
    //public abstract void run(); // you don't have to use public-abstract because it is already obvious in an interface;

    void run();
    int volume = 6; // have to assign values to variables in interfaces - they are all final.

    int weight();

    default void eco (){
        System.out.println("Honda engines are economic");
        hybridEco();
    }

    private void hybridEco (){
        System.out.println("Honda uses hybrid eco engines");

    }
}
