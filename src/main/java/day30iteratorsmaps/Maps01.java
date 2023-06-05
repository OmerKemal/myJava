package day30iteratorsmaps;

import java.util.*;

public class Maps01 {
    /*
        1)Maps are for storing multiple data
        2)Maps use "key" - "value" structure to store multiple data
        3)"key"s are unique, "value"s can be repeated
        4)Every map element is called as "Entry"
        5)All map elements are called "EntrySet"
        6)All map elements are unique because "key" part is unique.
        7)There are 3 Maps in Java;
                i)HashMap:
                    a)HashMap puts the elements in "random order", HashMap is fast
                    b)HashMap accepts "null" as key just once.
                    c)HashMap accepts multiple "null" in the "value" part
                ii)HashTable
                iii)TreeMap
     */
    public static void main(String[] args) {

        HashMap<String, Integer> cp= new HashMap<>();
        cp.put("USA", 400);
        cp.put("Germany", 83);
        cp.put("Albania", 3);
        cp.put("Turkey", 85);
        cp.put("Germany", 87); // this value overwrite
        System.out.println(cp); // {USA=400, Turkey=85, Germany=83, Albania=3}

        //Example 1: Find the average population of the given countries;
        Collection<Integer> values = cp.values();
        System.out.println(values); // 400, 85, 83, 3

        double sum= 0;
        for (int i : values){
            sum=sum+i;
        }
        double avg= sum/ values.size();
        System.out.println(avg);

        //Example : Print the country names that contain "r";

        Set<String> keys=  cp.keySet();
        for (String w: keys){
            if (w.contains("r")){
                System.out.println(w+" ");
            }
        }

        // How to get the population of a specific key:
        int populationOfAlbania= cp.get("Albania");
        System.out.println(populationOfAlbania);

        //How to check if keys have a specific key among them:

        boolean isExists=cp.containsKey("Belgium");
        System.out.println(isExists);

        //How to check if a specific value is among the values:
        boolean doesContain=cp.containsValue(85);
        System.out.println(doesContain);

        // If you use the same key with a different value with put() method, it means your update/overwrite the value;

        //How to update a value:
        cp.replace("Germany", 99);
        System.out.println(cp); // USA = 400 Turkey = 85 Germany = 99 Albania = 3

        cp.replace("Germany", 99,100);

        cp.putIfAbsent("UK", 50);

        //How to get all entries in a set?

        Set<Map.Entry<String ,Integer>> allEntries=cp.entrySet();
        for(Map.Entry<String ,Integer> w: allEntries){
            System.out.println(w.getValue() + "-" + w.getKey());

        }



    }
}
