package day21datetimeandstringbuilder;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        //How to fowmat time;
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm"); // "HH:mm" --> 24 hour system
        LocalTime ldtOfJapan= LocalTime.now(ZoneId.of("Asia/Japan"));


        System.out.println(dtf.format(currentTime));
    }
}
