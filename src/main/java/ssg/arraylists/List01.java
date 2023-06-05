package ssg.arraylists;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        // List<Integer> list3 = new List<>(); === you cannot create this object
        //because it is an interface
        // List is an abstract class


        ArrayList<Integer> list2 = new ArrayList<>();

        //List vs ArrayList
        // list2. - this kind of data has less methods of a concrete class

        ArrayList<Integer> list3 = new ArrayList<Integer>();

        List<Integer> list = new ArrayList<>();
        List<Integer> listNew = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(6);

        System.out.println(list); // [5, 7, 9, 6]

        for (Integer i : list) {
            i= i+2;
            listNew.add(i);
        }
        System.out.println(listNew);

    }
}
