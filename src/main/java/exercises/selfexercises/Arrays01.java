package exercises.selfexercises;

import java.util.Arrays;

public class Arrays01 {
    //Find the middle element in an integer array
    //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    public static void main(String[] args) {

        int [] arr = {8,12,3,2,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double middle;
        int length=arr.length;
        System.out.println(length);
        if (length%2==0) {
            middle = (arr [length/2] + arr[length/2-1])/2.0;
        }else {
            middle= arr[(length-1)/2];
        }
        System.out.println(middle);


        // Task 2:

    }
}
