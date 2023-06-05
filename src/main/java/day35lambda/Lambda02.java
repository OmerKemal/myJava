package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        printLessThanFiveCharsUpperCase(names);
    }

    // Example 1: Print the elements which have less than five characters in upper cases on the console:
    public static void printLessThanFiveCharsUpperCase (List<String> names){
        names.stream().
                filter(t->t.length()<5). // you cannot change it bcs it is working with a specific condition
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLine);
    }

    //Example 2: Print the elements on the console by ordering them according to their length in lower cases unrepeatedly:
    public static void orderLengthLowercaseUnrepeated(List<String> names){
        names.stream().
                distinct().
                map(String::toUpperCase).sorted(Comparator.comparing(t->t.length())).
                forEach(Utils::printInTheSameLine);
    }

    //Example 3: Print the elements on the console by ordering them according to their length in lower cases unrepeatedly:
        //If elements are in the same length, put them in alphabetical order:

    public static void printDistinctSortedByLengthThanAlphabeticalLowercase(List<String> names){
        names.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).
                forEach(Utils::printInTheSameLine);
    }
}
