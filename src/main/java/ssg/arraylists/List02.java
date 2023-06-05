package ssg.arraylists;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
         /*
        Write a program to print unique element from a  list.
         with Method creation
        // ex : [1, 3, 5, 3, 5, 6, 1, 7]  original list
        //       [1, 3, 5, 6, 7] output
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);
        numbers.add(7);


        System.out.println(unique(numbers));
        System.out.println(List02.unique(numbers));
    }




    public static List<Integer> unique(List<Integer> list){
        ArrayList<Integer> x = new ArrayList<>();
        for (int i :list){
            if (!x.contains(i)) {
                x.add(i);

            }
        }
        return x;

    }
}
