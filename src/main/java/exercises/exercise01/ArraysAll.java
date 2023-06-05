package exercises.exercise01;

import java.util.Arrays;

public class ArraysAll {

    /*
    1)Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10


     2)Find the smallest positive element and greatest negative element in
     an integer array Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18,
     greatest negative is -2


     3)Find the elements whose length is the smallest in a String array
            Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

     4)Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
            Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

     5)Find the total number of characters used in String array elements
            Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26


     6)Count how many words start with 'a' or 'A' in a given String
        String s = "Apex is an object oriented programming language";

     7)Find the number of vowels in a String
        String s = "Apex is an object oriented programming language";

     8)Type code to find array elements whose first and last characters are same

     9)Type code to find if a given element exists in a given array or not
            String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
            String s = "object";

     10)Type code to find sum of the number of characters of array elements
     */

    public static void main(String[] args) {
       // 6)Count how many words start with 'a' or 'A' in a given String

        String s = "Apex is an object oriented programming language";
        int counter=0;

        String[] arr = s.split(" ");
        for (String w: arr) {
            if (w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);





    }
}
