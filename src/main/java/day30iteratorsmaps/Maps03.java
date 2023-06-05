package day30iteratorsmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps03 {
    /*
          Example 1: Type code to find the number of occurrences of letters in a sentence
                     Java is easy ==> J=1, a=3, v=1, i=1, s=2, y=1
    */
    public static void main(String[] args) {

        String sentence = "Java is easy";
        String letters = sentence.replaceAll(" ", "");
        String [] letters1= letters.split("");
        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        for (String str: letters1) {

            Integer numOfOccurrence=occurrenceMap.get(str);
            if (numOfOccurrence==null){
                occurrenceMap.put(str,1);
            }else{
                occurrenceMap.replace(str,numOfOccurrence+1);
            }
        }
        System.out.println(occurrenceMap);

    }
}
