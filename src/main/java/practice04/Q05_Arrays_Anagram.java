package practice04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_Arrays_Anagram {
    public static void main(String[] args) {
         /*
       Type code to check if two strings are Anagram or not.

       Anagram: A word or phrase made by using the letters of another word or phrase in a different order.
       Ex:
       dormitory → dirty room
       debit card → bad credit
       Eleven plus two → Twelve plus one
       A decimal point → I’m a dot in place
       Vacation time → I am not active
       */

        System.out.println(isAnagram("Dormitory", "Dirty Room"));
    }
    public static boolean isAnagram(String str1, String str2) {

        String[] arr1= str1.toLowerCase().replaceAll("[^a-z]", "").split("");
        String[] arr2= str2.toLowerCase().replaceAll("[^a-z]", "").split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }

    }
}
