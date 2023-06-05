package day06StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //1.endswith method checkes the last character of a statement - if it is matching with a specific character.
        //2.charAt() method returns a specific character depending on the index
        //  Difference btw substring charAt
            // CharAt is just for getting a single character
            //substring can be used to get a single or multiple characters
            // charAt returns char data type, substring returns String data type;
        //3. replace method is for replacing a character with another character;
        //4. valueof method converts Strings from numeric data type to numeric data.
        //5. Trim method removes space character from the beginning and from the end

        //Example: Check if a sentence starts with uppercase and ends with dot:

        //  I love Java. ==> True
        //  i like Java ==> False / I Like Java ==> False / i like Java ==> False

        String s ="I love Java.";

        boolean isLastDot=s.endsWith(".");
        boolean isInitialUpper= s.charAt(0)>='A' && s.charAt(0)<='Z';
        System.out.println(isLastDot&&isInitialUpper);


        //Example 2: Type code to find the sum of the prices given as Strings:

        // $12.99 and $25.75 (Yanındaki dolar sembolünedn dolayı String)

        String p1="$12.99";
        String p2="$25.75";

        String newp1=p1. replace("$", "");
        String newp2=p2.replace("$","");

        double doubleP1=Double.valueOf(newp1);
        double doubleP2=Double.valueOf(newp2);

        System.out.println(doubleP1+doubleP2);

        //Example 3: Get the initials of the first name and the last name in Uppercase:
        //          Tom Hanks ==> TH - true      tom hanks==>TH         "    Tom Hanks   " ==> TH

        String name = "   tom hanks   ";

        String trimmedName=name.trim();
        String firstInitial=trimmedName.substring(0,1).toUpperCase();
        String lastInitial=trimmedName.split(" ") [1].substring(0,1).toUpperCase();
        System.out.println(firstInitial+lastInitial);













    }
}
