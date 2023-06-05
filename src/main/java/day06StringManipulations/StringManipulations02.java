package day06StringManipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        // = means assignment operator
        //== is used to check equality in Java
        // indexOf returns the index of first occurrence of a specific character
        // last index of returns the index of the last occurrence of a specific character
        //equals a method for checking if two Strings are the same or not by ignoring cases
        // equalsIgnoreCase method for checking if two strings are same or not ignoring the cases
        //Index of last character in a String is marked with the method: x.length()-1
        //Example 1: Type a code to check if a specific character gives unique in a String or not
                // Hello ==>H is unique, i - unique, l - repeated, o-unique

        String s = "Hello"; // what is the index of "H" - 0, what is the index of last occurrence of "H" - 0:
                            // what is the index of first occurrence of "l" - 2, last - "3"

        char c = 'e';

        boolean isUnique=s.indexOf(c) ==s.lastIndexOf(c);

        System.out.println(isUnique);

        //Example 2: Type code to check if first and the last characters are the same?
                //Ankara = true  ANKARA = true Miami= False

        String city="Ankara";
        String firstChar=city.substring(0,1);
        String lastChar= city.substring(city.length()-1);
        System.out.println("Are first and last characters the same " + firstChar.equalsIgnoreCase(lastChar));

        //Example 3: Type code to check if a String is empty or not?

                    // ""==> true  " " ==> false

        //1. way

        String str = "";

        boolean isEmpty=str.length()==0;

        //2.Way

        boolean isempty2=str.isEmpty();
        System.out.println(isempty2);

        //Example check if a code is empty or if it just has space character:
        //"" ==>true " "==>true "     "==>true

        String st= "    ";
        boolean isBlank= st.isBlank();
        System.out.println(isBlank);





    }
}
