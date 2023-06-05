package day10forloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example1:Put "*" between consecutive characters and to the end in a String.
        //For example; Java --->J*a*v*a*

        String x= "Java";

        for (int i = 0; i<x.length(); i++){
            System.out.print(x.charAt(i)+"*");
        }

        //Example 2: Type code to print unique characters in a string.
        // Hello--->Heo
        System.out.println();

        String s ="Hello";

        for (int i = 0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
            System.out.print(ch);
            }

        }

        // Example 3: Type a code to reverse a String;
        //       For Example: Tom -->Mot;

        System.out.println();

        String u= "Mark";
        String rev = "";


        for(int i = u.length() -1; i>=0; i--) {

            rev = rev+u.charAt(i);
        }
        System.out.println(rev);


    }
}
