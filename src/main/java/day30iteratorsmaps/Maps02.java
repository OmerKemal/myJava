package day30iteratorsmaps;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {
        //Example 1: Type code to find the number of occurrences of the words in a sentence
        //           Java, I like Java Java. ==> Java=3, I=1, like=1

        String sentence= "Java, I like Java Java.";
        sentence=sentence.replaceAll("\\p{Punct}", "");
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurrenceMap= new HashMap<>();

        for (String w: words) {
            Integer numOfOccurrences = occurrenceMap.get(w);
            if (numOfOccurrences==null){
                occurrenceMap.put(w,1);
            }else{
                occurrenceMap.replace(w, numOfOccurrences+1);

            }
        }
        System.out.println(occurrenceMap);

    }
}
