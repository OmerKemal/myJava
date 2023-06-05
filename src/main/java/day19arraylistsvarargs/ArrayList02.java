package day19arraylistsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 2 : Ask user to enter an integer from 1 to 10;
            //If the number user entered exists in the database change the number to "Bingo"
            //If the number user entered does not exist in the DB add it into database
            //If all records in the database are Bingo - "you won"


        List<String> database = new ArrayList<>();
        database.add("5");
        database.add("8");
        database.add("2");
        database.add("9");

        Scanner input = new Scanner(System.in);

        int counter =0;
        do {
            System.out.println("Enter an integer from 1 to 10:");
            String n = input.next();
            int num = Integer.valueOf(n);
            if(num<1||num>10) {
                System.out.println("Enter a number from 1 to 10: ");
            }else if (database.contains(n)) {
                database.set(database.indexOf(n), "Bingo");
                counter++;
            }else{
                database.add(n);
            }
            if (counter==database.size()) {
                System.out.println("You won!!!");
                break;
            }

        } while (true);
        System.out.println(database);

    }
}
