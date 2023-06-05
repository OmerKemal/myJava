package exercises.exercise02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.sort;

public class Lists01 {
    //Task 1: Find the sum of all list elements in an integer list

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(23);
        arr.add(11);
        arr.add(2);
        arr.add(3);
        arr.add(32);
        int sum=0;
        for (Integer i : arr){
            sum+=i;
        }
        System.out.println(sum);

        //Task 2: Find the sum of all list elements
        // before the first occurrence of 13 in an integer list

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(22);
        arr1.add(10);
        arr1.add(9);
        arr1.add(13);
        arr1.add(25);
        int sum1=0;
        for (Integer n:arr1){
            if (n==13){
                break;
            }else {
                sum1 +=n;
            }
        }
        System.out.println(sum1);
        //Task 4: Check if elements are in descending order in a list
        //Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        //(Yellow, Red, Green, Blue) ==> Output: It is in descending order

        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();
        str.add("Yellow");
        str.add("Blue");
        str.add("Brown");
        str.add("Red");

        str1.addAll(str);
        Collections.sort(str1);
        int size=str.size();
        int counter=0;
        for (int t= 0; t<size;t++) {
            if (str.get(t).equals(str1.get(size-1-t))){
                counter++;

            }
        }
        if (counter==size) {
            System.out.println("It is in descending order");
        }else {
            System.out.println("It is not in descending order");
        }

        // task 5: If the list has 15 as element, change all 15s to 51
        //Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)


        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(12);
        arr2.add(15);
        arr2.add(14);
        arr2.add(13);
        arr2.add(11);
        for (int w: arr2) {
            if (w==15) {
                arr2.set(arr2.indexOf(15), 51);
            }
        }
        System.out.println(arr2);

        //task 6: If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        ArrayList<Integer> arr3=new ArrayList<>();
        arr3.add(12);
        arr3.add(15);
        arr3.add(14);
        arr3.add(13);
        arr3.add(11);

        if (arr3.contains((Integer)13) || arr3.contains((Integer)15)){
            arr3.remove((Integer) 13);
            arr3.remove((Integer) 15);

        } else {
            System.out.println("There is no 13 or 15 in the list");
            System.out.println(arr3);
        }
        System.out.println(arr3);





    }



}
