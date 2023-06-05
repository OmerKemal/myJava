package exercises.exercise01;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Enter your password");
            s = scan.nextLine();
            if(s.length()>6 && s.charAt(0)=='A') {
                System.out.println("It is okay");
            }else {
                System.out.println("Make the length longer than 6");
            }
        }while(!(s.length()>6));
        scan.close();
    }
}
