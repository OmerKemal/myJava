package day05StringManipulations;

import java.util.Scanner;

        // 1) replaceAll (regex, newCharacter) puts new character instead of group of data taken by regex
        // 2) contains (char) checks if the character exists within the String or not

public class StringManipulations02 {

    //Regular Expressions (Regex) are for getting a group of data
    // for instance all UpperCase letters [A-Z]
    // all digits [0-9] - all punctuation marks [] - all letters [A-Za-z] - all vowels [aeiou] -
    // all punctuation marks [//p{Punct}
    // all characters different from Upper cases [^A-Z]
    // dif. from letters: [^a-z]
    // dif. from digits: [^0-9]
    // characters different from letters: [^A-Za-z]


    public static void main(String[] args) {

        //check the password according to the rules: type a code for the rules
        //password must have at least 8 characters
        //password must not have space as a character
        //password must have at least an Upper case character
        //password must have at least a lower case character
        //password must have at least a symbol(characters different from letters and digits)
        //password must have at least a digit


        //1. Rule
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your password");
        String pwd = input.nextLine();

        boolean firstRule=pwd.length()>7;
        System.out.println(firstRule);

        //2. Rule:
        boolean secondRule=!pwd.contains(" ");
        System.out.println(secondRule);


        //3. Rule:
        boolean thirdRule=pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(thirdRule);

        // 4: Rule:

        boolean fourthRule=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourthRule);

        // 5. Rule:

        boolean fifthRule=pwd.replaceAll("[A-Za-z0-9]", "").length()>0;
        System.out.println(fifthRule);

        //6.Rule:

        boolean sixthRule=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixthRule);

        System.out.println(firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule);

    }
}
