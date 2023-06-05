package day14arraysforeachloop;

import java.util.Arrays;
public class Arrays01 {

    // 1) Array can contain just "primitive" data types and references

    public static void main(String[] args) {

        //Example 1: Create an integer array with 4 elements, then find the sum of all elements

        Integer nums[] = new Integer[4];
        System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0]

        nums[0] = 12;
        nums[1] = 8;
        nums[2] = 10;
        nums[3] = 7;
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int w: nums) {
            sum= sum+w;
        }
        System.out.println(sum);
        
        // Example 2: Create a String array with the length five and print the elements whose length is more than 6;

        String[] cities = new String[5];
        cities [0] = "Miami";
        cities [1] = "New York";
        cities [2] = "Jacksonville";
        cities [3] = "California";
        cities [4] = "Tampa";

        System.out.println(Arrays.toString(cities));

        for(String w : cities) {
            if (w.length()>6) {
                System.out.print(w+" ");
            }
        }
        System.out.println();



        //Example 3: Create a String array with the length 5, print the elements before "California" on the console.
        String[] city = new String[5];
        city [0] = "Miami";
        city [1] = "New York";
        city [2] = "Jacksonville";
        city [3] = "California";
        city [4] = "Tampa";
        System.out.println(Arrays.toString(city));

        for (String w : city) {
            if (w.equals("California")){
                break;
            }
            System.out.print(w + " "); // if you put this before if, it prints California, too.

        }

        //Example 4; Create a String with the length of 5 and print the elements except California and Miami;

        String[] c = new String[5];
        c [0] = "Miami";
        c [1] = "New York";
        c [2] = "Jacksonville";
        c [3] = "California";
        c [4] = "Tampa";
        System.out.println(Arrays.toString(c));

        for (String w:c){
            if (w.equals("California") || w.equals("Miami")) {
                continue;
            }
            System.out.print(w +" ");

        }




    }
}
