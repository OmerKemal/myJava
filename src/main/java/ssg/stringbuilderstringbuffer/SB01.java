package ssg.stringbuilderstringbuffer;

public class SB01 {
    public static void main(String[] args) {

        // Task1: A program to concatenate two Strings using Stringbuilder;

        String s1= "";
        String s2= "";


        //task 2: Insert a given String into a specific
        // position of another String using Stringbuilder

        String str1= "Hello World";
        String str2= "I am learning Java";

        StringBuilder newString=new StringBuilder(str1);
        newString.insert(5, str2);

        // Task 4:
        // Write a program that prints your initials from your full name and displays them. Using StringBuffer

        // 1st way:
        String myName = "Shabnam Bayezit";
        String firstin=myName.substring(0,1);
        String lastin=myName.substring(myName.indexOf(" ")+1,myName.indexOf(" ")+2);

        StringBuilder sb2=new StringBuilder(firstin+lastin);
        System.out.println("sb2 = " + sb2);


        // 2nd way

        String name = "Syeda Saima Bokhari";

        StringBuffer initials = new StringBuffer();  // empty
        int length = name.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(name.charAt(i))){
                initials.append(name.charAt(i));
            }

        }
        System.out.println(initials);

        // Task 5: HW
        // Write a program to reverse the order of words in a string using StringBuilder.

        String input = "Hello world! Welcome to Java programming.";
        StringBuilder abc= new StringBuilder();

        for (int i = input.length(); i>=0; i--){
            abc.append(i);
        }

    }

}
