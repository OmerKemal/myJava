package day31mapsexceptions;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1) HashTable is thread safe and synchronised.
    2) HashTable puts the elements in random order.
    3) To be thread safe and synchronised needs time, that is why hashTable is slower than HashMap
    4) HashTable does not accept any null as key or value
    5)
     */
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("Ali Can", 14);
        ht.put("Tom Hanks", 65);
        ht.put("BradPitt", 56);
        //ht.put(null, 45); // error
        System.out.println(ht);
        ht.get("Angelina Jolie"); //null
        ht. getOrDefault("Angelina Jolie",-1); // -1

    }
}
