package day16arraylists;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        // Example 1: Create 2 character ArrayLists and check if the lists are the same and equal to each other or not:

        ArrayList<Character> ch1= new ArrayList<>();
        ch1.add('j');
        ch1.add('a');
        ch1.add('v');
        ch1.add('a');
        System.out.println(ch1); //[j,a,v,a]
        ArrayList<Character> ch2= new ArrayList<>();
        ch2.add('j');
        ch2.add('a');
        ch2.add('v');
        ch2.add('a');
        System.out.println(ch2);//[j,a,v,a]

        if (ch1.equals(ch2)) {
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
        ch1.indexOf('a');
        ch2.indexOf('a');

        //Example 2: Type code to print unique elements in an array list;
        ArrayList<Character> letters= new ArrayList<>();
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');

        for(Character w: letters) {
            if(letters.indexOf(w) ==letters.lastIndexOf(w)) {
                System.out.print(w);
            }
        }

    }
}
