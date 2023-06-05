package day19arraylistsvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists01 {
    public static void main(String[] args) {


        List<String> emailDb = new ArrayList<>();
        emailDb.add("abc@gmail.com");
        emailDb.add("bcd@gmail.com");
        emailDb.add("cde@gmail.com");
        emailDb.add("ac@gmail.com");
        emailDb.add("bd@gmail.com");


        // Example 1: Ask user to create an email address
        //If the address is not occupied yet, accept it
        //If the account is already occupied give a message to the user and create a unique address

        Scanner input = new Scanner(System.in);
        System.out.println("Create an email address ...");
        String email = input.next();

        if (emailDb.contains(email)) {
            System.out.println("This account is already occupied, you can use any of the followings");
            LocalDate currentDAte= LocalDate.now();
            String date=currentDAte.toString().replaceAll("[^0-9]","");
            LocalTime currentTime = LocalTime.now();
            String time = currentTime.toString().split("\\.") [0].replaceAll("[^0-9]","");
            String recommended= email.split("@")[0] + date+time+"@"+email.split("@")[1];
            System.out.println(recommended);
        }else {
            System.out.println("This email can be used");
            emailDb.add(email);
        }
        System.out.println(emailDb);

    }
}
