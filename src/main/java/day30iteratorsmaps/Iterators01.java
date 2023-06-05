package day30iteratorsmaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
     /*
        1)Iterators do the same thing with the loops
        2)Loops have infinite loop risk but iterators do not have.
        3)There are two types of iterators
                i)Iterator:
                    You can just "remove" the elements, it is impossible to "update" or to "add" new elements
                    You can use the elements from first to the last. It has one direction.
                ii)ListIterator:
                    You can "remove" the elements, "update" the elements, "add" new elements.
                    You can use elements from the first to the last and from the last to the first. It is bidirectional.
     */

    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");

        //How to use an iterator;

        Iterator<String> itr=myList.iterator();

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList); // []

        //How to use a ListIterator:
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        System.out.println(yourList);

        ListIterator<String> lr= yourList.listIterator();
        while (lr.hasNext()){
            lr.next();
        }                           //[Tom,, Jim, Clara, Angie]

        while (lr.hasPrevious()){
            String el = lr.previous();
            lr.set(el+"!");
            System.out.println(yourList);
        }

    }
}
