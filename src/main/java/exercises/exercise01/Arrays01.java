package exercises.exercise01;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Find the middle element in an integer array
        //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int [] x= {12, 5, 8, 13};
        Arrays.sort(x);

        if(x.length%2!=0) {
            System.out.println(x[x.length/2]);
        }else {
            int idx = x.length/2;
            int middle = (x[x.length/2] + x[x.length/2-1])/2;
            System.out.println(middle);
        }

        //Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        Integer minPositive = a[a.length-1];
        Integer maxNegative = a[0];
        for(Integer w : a){
            if(w>=0){
                minPositive = Math.min(minPositive, w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w);
            }
        }
        System.out.println("Minimum positive: " + minPositive);
        System.out.println("Maximum negative: " + maxNegative);

        //Find the elements whose length is the smallest in a String array
        //Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String[] names= {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int shortest = names[0].length();
        for (String s: names){
            shortest=Math.min(shortest,s.length());
            }
        for(String s:names) {
            if (shortest==s.length()){
                System.out.println(s);
            }
        }


    }


}
