package exercises.exercise02;

import java.util.*;

public class Sets01 {
    //Type a code that shows how many different elements there are in a list.
    //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        System.out.println(myList);

        Set<Integer> mySet= new HashSet<>(myList);
        System.out.println(mySet.size());


        //Type code to print different characters used in a String
        //Example 2: ‘Mississippi’ ==> Misp

        String s = "Mississippi";
        String [] arr= s.split("");
        List<String> characters = Arrays.asList(arr);
        LinkedHashSet<String> mySet2 = new LinkedHashSet<>(characters);
        System.out.println(mySet2);






    }

}
