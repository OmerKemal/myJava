package day20methodoverloadinganddatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate); //2023-04-15
        System.out.println(currentDate.getYear());//2023
        System.out.println(currentDate.getMonth());//APRIL
        System.out.println(currentDate.getMonthValue());//4
        System.out.println(currentDate.getDayOfMonth());//15
        System.out.println(currentDate.getDayOfWeek());//SATURDAY

        //How to get current date in a specific zone;

        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));
        LocalDate.now(ZoneId.of("Europe/Sofia"));

        //How to go to the future and the past:

        System.out.println(currentDate.plusYears(3).plusMonths(2).plusDays(12));
        System.out.println(currentDate.minusYears(4)
                .minusMonths(23).minusDays(11));

        //John was born 12 years 5 months 11 days ago, type a code to find his birthday;

        System.out.println(currentDate.minusYears(12).minusMonths(5)
                .minusDays(11).getDayOfWeek());

        //How to compare two dates;
        LocalDate dateOfBirthdayOfTom=LocalDate.of(2011, Month.JULY,21);
        LocalDate dateOfBirthOfJim=LocalDate.of(2007,3,13);
        System.out.println(dateOfBirthdayOfTom.isAfter(dateOfBirthOfJim));

        //Example 2: Type a code for a booking application;
        // if the booking date is before the currentdate give an error message
        // if the booking is for today, send a message and say we will call you depending on availability
        // if the booking is for a future date, give the message "the ticket is booked"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year month and the day number of your booking");
        int year = input.nextInt();
        System.out.println("Month:");
        int month = input.nextInt();
        System.out.println("Day:");
        int day = input.nextInt();


        LocalDate bookingDate= LocalDate.of(year,month,day);

        if (bookingDate.isBefore(currentDate)) {
            System.out.println("Booking date cannot be a past date");
        }else if(bookingDate.equals(currentDate)) {
            System.out.println("We will call you when we have availability");
        }else {
            System.out.println("Your ticket is booked");
        }
        //Examaple3: find the day of your birth

        LocalDate myBD=LocalDate.of(1988,7,29);
        DayOfWeek myBDW=myBD.getDayOfWeek();
        System.out.println(myBDW);

        //How to format date:

        LocalDate current = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // mm is reserved for minutes, that is why MM
        String myDate=dtf.format(current);
        System.out.println(myDate);





    }
}
