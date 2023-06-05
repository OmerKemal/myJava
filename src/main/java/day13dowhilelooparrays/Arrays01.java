package day13dowhilelooparrays;

import java.util.Arrays;

public class Arrays01 {

    /* 1) Arrays are for storing multiple data in the same data type
     */
    public static void main(String[] args) {

        // how to create an array; you should give the data type first

        String stdNames[] = new String[5];

        //How to add an element;
        stdNames [2]= "Tom";
        stdNames [0]= "Mary;";
        stdNames [3] = "John";
        stdNames [4] = "Alex";
        stdNames [1] = "Jim";

        // How to print;

        System.out.println(stdNames);  // this gives you the address

        System.out.println(Arrays.toString(stdNames));

        // How to get a specific element among the arrays;

        System.out.println(stdNames[3]);

        //How to get the number of elements in an array;

        System.out.println(stdNames.length);

        //Example 1: Find the total number of characters used in stdNames array elements;

        //1.Way - for loop method
        int total = 0;
        for(int i=0; i<stdNames.length; i++) {
            total = total + stdNames[i].length();
        }
        System.out.println(total);

        //2. way for each loop;

        int sum = 0;
        for (String w: stdNames) {
            sum= sum+w.length();
        }

    }
}
