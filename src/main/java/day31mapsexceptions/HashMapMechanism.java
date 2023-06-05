package day31mapsexceptions;

import java.util.HashMap;

public class HashMapMechanism {
    /*
    1) When you create a HashMap - Java gives you 16 buckets
    2)Java puts indexes for every bucket from 0 to 15
    3)When you put an entry into the map,
            i) Java creates a hashcode for the key of the entry
            ii) Java divides the Hashcode by 16 and gets the remainder as the index
            of the key, then it puts the entry into the bucket with the remainder's index
     4)If multiple entries are put into the same index, Java uses LinkedList structure
     5) If 75% of the buckets are full, Java gives you another 16 buckets
     6) To find a specific value, Java follows the following steps:
            i)index ii)HashCode iii) Key iv) Value
     7)
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("Albania", 3);
    }

}
