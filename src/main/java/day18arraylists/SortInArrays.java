package day18arraylists;

import java.util.Arrays;

public class SortInArrays {
    public static void main(String[] args) {
        char[] arr = {'b', 'e', 'a','d'};
        // How to sort array elements in natural order
        Arrays.sort(arr); //
        System.out.println(Arrays.toString(arr));

        // How to check if a specific element exists in an array or not;
        // To check if a specific element exists in an array or not use binarySearch();

        int [] brr = {12,3,5,10,2};
        //1. Step: sort the array elements;
        Arrays.sort(brr);
        //2. Step: use binarySearch() method;
        int r1=Arrays.binarySearch(brr,12);
        System.out.println(r1); // 4: if the output is valid index (from 0 to ...) it means the array has the element.
        int r2=Arrays.binarySearch(brr,7);
        System.out.println(r2); //(-4)  if you get negative result it means that the element does not exist.
        // If the element 4 existed it would be in the fourth place - index
        //




    }
}
