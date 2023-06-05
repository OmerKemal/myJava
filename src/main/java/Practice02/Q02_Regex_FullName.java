package Practice02;

import java.util.Scanner;

public class Q02_Regex_FullName {
    public static void main(String[] args) {
        /*
         Divide the 2-word name and surname you will receive from the user into 2 separate words.
         Print the name and surname on the screen separately.
         eg:
         Input: John doe
         Name: John
         Surname: Doe
            */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName= input.nextLine().replaceAll("[^A-Za-z ]", "")
                .replaceAll("\\s+", "").trim();

        String firstName= fullName.split("\\s")[0].substring(0,1).toUpperCase()
                +fullName.split(" ")[0].substring(1).toLowerCase();
        String surname= fullName.split("\\s") [1].substring(0,1).toUpperCase()
                +fullName.split(" ") [1].substring(1).toLowerCase();

        System.out.println("Name: " + firstName + "\nSurname: " + surname);

    }
}
