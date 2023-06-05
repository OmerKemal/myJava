package Practices01;

public class Q01_Variables {
    public static void main(String[] args) {
        // Write a program to break an Integer into a sequence of individual digits
        //x: 12345
        // to get rid of the last character you need to divide it to 10, then to 100, then to 1000

        int x = 12345;
        int ones = x % 10;
        int tens = (x / 10) % 10;
        int hundreds = ((x / 100) % 10);
        int thousands = ((x / 1000) % 10);

        System.out.println(thousands + "\n" + hundreds); // \n -->next line

        System.out.println("ones = " + ones);
        System.out.println("x = " + x);


        //Type a code to swap two integers.

        int int1= 10;
        int int2= 5;
        int empty;

        //empty=int1;
        //int1=int2;
        //int2=empty;
        //System.out.println(int1+" "+int2);


        int1= int1+int2;
        int2= int1-int2;
        int1=int1-int2;
        System.out.println(int1 + " " +int2);


    }



}
