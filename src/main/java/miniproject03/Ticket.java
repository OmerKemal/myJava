package miniproject03;

public class Ticket {
    //distance, type of the trip, price, seatNo

    public double distance;

    public int typeNo;
    public int seatNo;
    double price;

    public void printTicket(Bus bus){

        System.out.println("Total Price: " +this.price);
        System.out.println("----Ticket Details-----");
        System.out.println("Bus Plate: " + bus.numberPlate);
        System.out.println("Distance: " + this.distance);
        System.out.println("Type of Trip" +
                (this.typeNo == 1? "One Direction" : "Round Trip"));
        System.out.println("Seat Number: "+ this.seatNo);
        System.out.println("Have a Nice Trip!");
    }

}
