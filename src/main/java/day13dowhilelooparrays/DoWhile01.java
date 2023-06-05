package day13dowhilelooparrays;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
	    */

        Scanner input= new Scanner(System.in);

        do {
            int counter = 0;
            if (counter ==4){
                System.out.println("Your account is blocked");
            }
            System.out.println("Enter your username and password");
            String username = input.next();
            String pwd = input.next();

            if (username.equals("admin") && pwd.equals("pwd123")){
                System.out.println("You entered your account successfully");
                break;
            }else{
                System.out.println("Either your username or your password is wrong");
            }
            counter ++;
        }while(true);


    }
}
