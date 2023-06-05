package day15multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example 1: Convert a multidimensional to a one dimensional array:
        // {{"learn", "java", "it"}{"is", "easy"}} ==>

        String [][] words={{"learn", "java", "it"},{"is", "easy"}};

        //1. Step: Create a one dimensional array:
                    //We needto calculate the number of elements in the multidimensional array;
        int totalNumOfElements = 0;
        for (String[] w: words) {
            totalNumOfElements=totalNumOfElements+w.length;
        }
        String[] newWords= new String[totalNumOfElements];

        //2. Step: Transfer elements from multidimensional array to one dimensional;
        int idx = 0;

        for (String[] w: words) {
            for (String u : w){
                newWords[idx]= u;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newWords));

    }
}
