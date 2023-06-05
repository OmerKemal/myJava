package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) Its entries are in natural order; according to the key parts
    2) faster way of creating treemap- first create hashmap then convert to treemap
    3) TreeMaps are not thread safe, and they are not synchronised
    4) TreeMaps does not accept null ass key, but it accepts null as value
     */
    public static void main(String[] args) {

        long t1=System.nanoTime();

        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Ali Can", 13);
        tm.put("Tom Hanks", 13);
        tm.put("Brad Pitt", 13);
        tm.put("Ajda Pekkan", 13);
        tm.put("Cüneyt Arkın", 13);
        System.out.println(tm);

        long t2=System.nanoTime();
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Ali Can", 13);
        hm.put("Tom Hanks", 13);
        hm.put("Brad Pitt", 13);
        hm.put("Ajda Pekkan", 13);
        hm.put("Cüneyt Arkın", 13);
        System.out.println(hm);

        long t3=System.nanoTime();

        HashMap<String,Integer> hmm=new HashMap<>();
        hmm.put("Ali Can", 13);
        hmm.put("Tom Hanks", 13);
        hmm.put("Brad Pitt", 13);
        hmm.put("Ajda Pekkan", 13);
        hmm.put("Cüneyt Arkın", 13);

        TreeMap<String,Integer> tmm = new TreeMap<>(hmm);

        long t4= System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);
        System.out.println(t4-t3);
    }
}
