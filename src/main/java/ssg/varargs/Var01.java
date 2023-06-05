package ssg.varargs;

import java.util.Arrays;

public class Var01 {
    public static void main(String[] args) {



        func(6);
        System.out.println(sumVarargs(4, 5, 6, 7));
        System.out.println(concatenateStrings("akksk", "vrkmvrkb"));
        System.out.println(maximum(5, 6, 7, 8, 9));


    }

    public static int sumVarargs(int...args){
        int sum=0;
        for (int i: args) {
            sum+=i;
        }
        return sum;

    }

    public static String concatenateStrings(String...args){
        String empty= "";
        for (String w:args) {
            empty+=w + " ";
        }return empty;
    }

    public static int maximum(int...arrgs){
        int max=Integer.MIN_VALUE;
        for(int r: arrgs){
           max= Math.max(max,r);
        }return max;

    }








    public static void func(int a){
        System.out.println(a);

    }

    public static void func(int a, int b){
        System.out.println(a + "" + b);

    }

    public static void func(int ... a){
        System.out.println(Arrays.toString(a)); // varargs are converting the data into array syntax.
        System.out.println(a.length);
    }


}
