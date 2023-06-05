package day05StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        /* 1) toUpperCase()method
            2)toLowerCase()
            3)substring(s,e); takes the characters starting from s until e; e is not included
            4)substring (s) ; takes all the characters from s to the end of the string
            5)split("x"); it divides the string from the marked point

         */
         // Example 01: Change the full name of like initials are in upper cases, other characters are in lower cases:

        // TOM HANKS/tom hanks - this is the users input ==> but applications want Tom Hanks!!!
        // Applications to correct the answers of the users:
        // How can our code fix that error: your code should work for all scenarios:


        String name =  "tOm hAnKs";
        // Convert the initial to uppercase:

        String firstChar=name.substring(0,1).toUpperCase();

        //to make the rest of the characters lowercase oof the first name;
        //1: get the first name, 2. get the characters apart from the initial, 3 change them to lowercase

        String restOfTheFirst=name.split(" ") [0]. substring(1).toLowerCase();

        // you ask Java to cut the name from the space, the previous part is taken.

        System.out.println(firstChar+restOfTheFirst);

        //How to fix the last name?

        // Pick the name, select the initial - then convert to uppercase

        String firstCharOfLastName=name.split(" ")[1].substring(0,1).toUpperCase();

        // Pick the last name and convert all the letters excluding the initial into lowercase:

        String restOfTheLastName=name.split(" ")[1].substring(1).toLowerCase();

        System.out.println(firstCharOfLastName+restOfTheLastName);

        System.out.println(firstChar+restOfTheFirst + " " +firstCharOfLastName+restOfTheLastName);


        // 2. Way:

        String fullNameLowerCase=name.toLowerCase();
        String initialUpperCase=fullNameLowerCase.substring(0,1).toUpperCase();
        String initialOfLastNameUpperCase=fullNameLowerCase.split(" ") [1].substring(0,1).toUpperCase();
        System.out.println(initialUpperCase+fullNameLowerCase.split(" ") [0].substring(1) + " "
                +initialOfLastNameUpperCase+fullNameLowerCase.split(" ")[1].substring(1));

    }
}
