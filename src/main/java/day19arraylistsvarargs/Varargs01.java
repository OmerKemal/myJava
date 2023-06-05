package day19arraylistsvarargs;

public class Varargs01 {
    public static void main(String[] args) {
        // Create a method that adds two integers
        System.out.println(add(3, 5));
        System.out.println(add(3, 5, 7, 9, 11));
    }

    //public static int add(int a, int b) {
    //    return a + b;
    //}
    ////1)Putting a parameter after varargs is a mistake.
    //    //2)Putting a parameter before varargs is okay.
    //    //3)Putting multiple varargs as parameter is a mistake.
    //    //Note: Varargs must be used just once at the end.
    //    //Note: Containers used in method parenthesis are called "Parameters"
    //    //      Actual data used in method parenthesis are called "Argument"
    public static int add (int ...v) {
        int sum = 0;
        for(int w:v) {
            sum+=w;
        }
        return sum;

    }
}


