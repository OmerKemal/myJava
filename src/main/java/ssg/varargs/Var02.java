package ssg.varargs;

import java.util.Arrays;

public class Var02 {
    public static void main(String[] args) {

        //What are the two types of method calling?
        int[] x= {2,3,4,5,6};
        int[] y= {4,9,1,0};

        System.out.println(mergeArrays(x, y));


    }

    public static int[] mergeArray (int[]...arr){
        int lengthOfArray= 0;
        for(int[] w: arr) {
            lengthOfArray +=w.length;
        }
        int[] mergedArray=new int [lengthOfArray];
        int count = 0;
        for(int[] w : arr){
            for(int t : w){
                mergedArray[count] = t;
                count += 1;
            }
        }
        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;




    }

    public static int[] mergeArrays(int[]... arrays) {
        int lengthOfArray = 0;
        for (int[] arr : arrays) {
            lengthOfArray += arr.length;
        }

        int[] mergedArray = new int[lengthOfArray];
        int count = 0;
        for (int[] arr : arrays) {
            for (int t : arr) {
                mergedArray[count] = t;
                count += 1;
            }
        }

        // Print the merged array using Arrays.toString()
        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(mergedArray));

        return mergedArray;
    }







}
