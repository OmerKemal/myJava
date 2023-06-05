package miniproject03;

import java.util.Scanner;

public class TicketReservation {
    /*  Project: app that calculates bus ticket price based on distance and conditions
         Distance from User (KM), age and trip type (OneDirection, Going&Returning )
         Get seat number information.

         Take the payment as 1 USD / km per distance. (*2 for Going&Returning trip)
         First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;
         All buses should have a seat number in total "32".
       Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
        Otherwise, "You Have Entered Wrong Data!" A warning should be given.

       1- If the person has chosen the "Journey Type" Going&Returning trip, 20% discount is applied on the ticket price.
       2-Age discount:
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
       3-Single Seat Fee:
        If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.

 */



    public static void main(String[] args) {
        //create a bus object:
        Bus bus=new Bus("34 ISt 34");
        Ticket ticket = new Ticket();
        start(bus, ticket);




    }

    public static void start(Bus bus, Ticket ticket){
        Scanner scan = new Scanner(System.in);
        int select;

        do{
            System.out.println("Welcome to our ticket reservation service.");
            System.out.println("Please enter distance as KM:");
            double distance= scan.nextDouble();
            System.out.println("Please enter the type of the trip:");
            System.out.println("1- One direction" +
                    "2-Round Trip");
            int type= scan.nextInt();
            System.out.println("Please enter your age: ");
            int age = scan.nextInt();
            System.out.println("Please enter the seat number you want to select: ");
            System.out.println("Single seats are %20 more expensive");
            System.out.println(bus.seats);
            int seat = scan.nextInt();
            //remove the given seatNo from the list
            bus.seats.remove(String.valueOf(seat));
            // all values should be valid
            boolean check=type==1||type == 2;
            if(distance>0 && age>0 && check) {
                ticket.distance=distance;
                ticket.typeNo=type;
                ticket.seatNo=seat;
                ticket.price=getTotal(ticket, age);
                ticket.printTicket(bus);
            } else{
                System.out.println("You have entered wrong data.");
            }
            System.out.println("Press 1 to Restart or Press 0 to Quit:");
            select= scan.nextInt();
        }while(select!=0);

    }
    private static double getTotal(Ticket ticket, int age){
        double dist=ticket.distance;
        int type=ticket.typeNo;
        int seat=ticket.seatNo;
        double total=0;

        switch (type) {
            case 1:
                if (seat%3==0){
                    total=dist*1.2;
                }else {
                    total=dist*1;
                }
                break;
            case 2:
                if (seat%3==0){
                    total= total*2.4;
            }else{
                    total=dist*2;
            }
                System.out.println("Total is: " + total);
                total=total*0.8;
                System.out.println("Total Ticket Price with discount: " + total);
                break;
        }
        if (age<12){
            total=total*0.5;
            System.out.println("Total price with age discount: " + total);
        } else if (age>=12 && age <25) {
            total = total*0.9;
        }else if (age>65) {
            total=total*0.75;
        }
        return total;

    }

}
