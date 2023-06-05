package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if the elements in a String ArrayList are in alphabetical order or not

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Tampa");
        cities.add("Albany");
        cities.add("Jacksonville");
        System.out.println(cities);

        ArrayList<String> newCities = new ArrayList<>();
        newCities.addAll(cities);

        Collections.sort(newCities);
        System.out.println(newCities);

        if (cities.equals(newCities)) {
            System.out.println("Elements are in alphabetical order");
        } else {
            System.out.println("Elements are not in alphabetical order");
        }


        //Example 2: Type code to find the closest values in an Integer List
        //           [12, 31, 15, 32, 54] ==> 31 and 32
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(31);
        ages.add(15);
        ages.add(32);
        ages.add(54);
        Collections.sort(ages); // [12,13,15,31,54]
        System.out.println(ages);

        int minDiff = ages.get(1) - ages.get(0);
        for (int i = 1; i < ages.size(); i++) {
            minDiff = Math.min(minDiff, ages.get(i) - ages.get(i - 1));
        }
        System.out.println(minDiff);

        for (int i = 1; i < ages.size(); i++) {
            if (minDiff == ages.get(i) - ages.get(i - 1)) {
                System.out.println(ages.get(i - 1) + " and " + ages.get(i));
            }
        } // the last part identifies the elements that give you the min difference


        //Example 3: Type code to find the sum of the elements if they are different from 31 and 54
        //           [12, 31, 15, 32, 54] ==> 12 + 15 + 32 = 59

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(31);
        nums.add(15);
        nums.add(32);
        nums.add(54);
        int sum = 0;

        for (int w : nums) {
            if (w == 31 || w == 54) {
                continue;
            }
            sum = sum + w;
        }
        System.out.println(sum);

        //Example 4: Type code to check if all elements are unique or not in a List
        //           [12, 31, 15, 32, 54] ==> Unique       [12, 31, 12, 32, 54] ==> Not Unique
        ArrayList<Integer> n = new ArrayList<>();
        n.add(12);
        n.add(31);
        n.add(15);
        n.add(32);
        n.add(54);

        int counter = 0;

        for (int w : n) {
            if (n.indexOf(w) != n.lastIndexOf(w)) {
                System.out.println("All Elements are not unique");
                break;
            } else {
                counter++;
            }
        }

        if (counter == n.size()) {
            System.out.println("All the elements are unique");
        }


    }


}
