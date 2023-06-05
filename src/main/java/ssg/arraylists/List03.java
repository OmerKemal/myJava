package ssg.arraylists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    // delete the desired element (how many) from a given array and leave the rest
    //  create a method that prints it as a new list
    public static void main(String[] args) {
        int arr [] = {3,4,2,3,5,7,3,8,5,2,4};
        int unwantedElements = 5;
        deleteFromList(arr, 5);

    }

    public static void deleteFromList (int arr [], int removeElement){
        List<Integer> myNewList=new ArrayList<>();
        for (Integer i : arr) {
            if ( i!=5) {
                myNewList.add(i);
            }
        }
        System.out.println(myNewList);

    }


}
