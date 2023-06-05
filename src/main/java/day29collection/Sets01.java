package day29collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*
        Sets are for storing unique data
        There are 3 sets i)HashSet
                                Hashing is a technique to create unique codes for data
                                HashSet does nto put the elements in any order
                                HashSet is so fast because it does not spend time to order the elements.
                                You can store just a single null in a HashSet
                         ii) LinkedHashSet;
                                i) unique data
                                ii)in random order
                                iii) puts the elements in insertion order
                         iii) TreeSet:
                                TreeSet puts the element in natural order
                                Putting elements in natural order takes too much time, that is why it is the slowest
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania"); // ==> overrides the element
        hs.add("Turkey");
        hs.add(null);
        System.out.println(hs);


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        LinkedHashSet<Integer> nhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(5);
        lhs.add(19);
        lhs.add(15);
        lhs.add(6);
        lhs.add(12);
        lhs.add(23);
        // lhs.add(null); ==> It accepts null
        System.out.println(lhs);


        nhs.add(43);
        nhs.add(19);
        nhs.add(6);
        nhs.add(50);
        nhs.add(23);
        nhs.add(65);
        System.out.println(nhs);


        lhs.retainAll(nhs); // removes all the elements in the first list that are not in the second list

        /*
        If you need to store unique elements in natural order do not use Treeset to add elements because it is too slow.
        Use hashset to make the list and convert it to the TreeSet.
        So you will have unique elements in natural order and it will be fast
         */

        TreeSet<String> ts = new TreeSet<>();
        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania");
        hs.add("Turkey");
        //hs.add(null); ==> It does not accept null - because cannot be put among the  strings

        System.out.println(ts); // natural order
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Germany");
        hs2.add("Albania");
        hs2.add("Belgium");
        hs2.add("USA");
        hs2.add("UK");
        hs2.add("Albania"); // ==> overrides the element
        hs2.add("Turkey");
        TreeSet<String> ts2=new TreeSet<>(hs2); // this is the fastest way to create a list with a natural order
        System.out.println(hs);
    }
}
