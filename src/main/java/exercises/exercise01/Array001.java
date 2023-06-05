package exercises.exercise01;

import java.util.Arrays;

public class Array001 {
    public static void main(String[] args) {
        int [] i= new int [5];
        i[0]= 1;
        i[1]= 2;
        i[2]= 3;
        i[3]= 4;
        i[4]= 5;

        System.out.println(Arrays.toString(i));


        int[] w=new int[4];
        w[0]= 4;
        w[1]= 8;
        w[2]= 6;
        w[3]= 9;

        for (int k : w){
            if(k<=7) {
                System.out.print(k + " ");
            }
        }

        int[] arr={5,1,3,6,8,34,7,756,6,8};

        for (int t : arr) {
            if (t % 2 == 0) {
                System.out.print(t + " Even");
            } else {
                System.out.print(t + " Odd");
            }
        }


    }
}
