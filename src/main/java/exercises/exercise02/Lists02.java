package exercises.exercise02;

import java.util.ArrayList;
import java.util.Collections;

public class Lists02 {
    //task 7: Find the closest 2 integers in an Integer List
    //Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(9);
        arr.add(2);
        arr.add(42);
        Collections.sort(arr);
        System.out.println(arr);

        int minimumGap=arr.get(1) - arr.get(0);
        for (int i=1; i<arr.size(); i++) {
            minimumGap=Math.min(minimumGap,arr.get(i)-arr.get(i-1));
        }
        for (int m=1; m<arr.size();m++){
            if (minimumGap==arr.get(m)-arr.get(m-1)){
                System.out.println("The minimum gap "+ minimumGap +" is between "
                        +arr.get(m)+ " and "+arr.get(m-1));
            }
        }

        //Task 8: Increase the value of every element except 7 and 10 by 2 in a List
        //Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

        ArrayList<Integer> arr0 = new ArrayList<>();
        arr0.add(10);
        arr0.add(9);
        arr0.add(7);
        arr0.add(42);
        System.out.println(arr0);

        for (int w: arr0){
            if (w==7 || w==10){
                continue;

            }else{
                arr0.set(arr.indexOf(w), w+2);
            }
        }
        System.out.println(arr0);
    }

    //Task 9: Find the sum of all prices given in a String list
    //Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04



}
