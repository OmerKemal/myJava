package day21datetimeandstringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1) StringBuilder is a class that creates Strings for you
        2) Normally we create Strings by creates String class, but Java gave us another class to create String class
            String Class - immutable String // StringBuilder - mutable
         */

        String str = "Java"; // when you modify str - Java creates a new box for it in the Heap memory - IMMUTABILITY

        StringBuilder sb = new StringBuilder("Java");
        sb.append("!"); // this does not create a new box - just revises  the box;


        //Methods of StringBuilder Class;
        // append - combining two strings - like (concat method in String class)
        StringBuilder sb1 = new StringBuilder("Mark");
        sb1.append(" Twain").append("!");

        //length() and capacity() methods;
        StringBuilder sb2 = new StringBuilder("Brad");
        System.out.println(sb2.length()); //4
        System.out.println(sb2.capacity());//20
    }
}
