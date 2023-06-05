package exercises.exercise01;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //Create an integer array by getting the elements from the user then print the difference
        //between the smallest and the greatest elements on the console.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int length= scanner.nextInt();
        Integer[] arr=new Integer[length];
        int idx=0;
        do {
            System.out.println("Enter an Integer");
            arr [idx]=scanner.nextInt();
            idx++;
        }while(idx<length);
        int mi= arr[0];
        int ma= arr[0];
        for(Integer w: arr) {
            mi = Math.min(mi,w);
            ma=Math.max(ma,w);
        }
        System.out.println(ma-mi);

        //Type code to put all zeros to end in an integer array.
        //Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int [] a= {5,0,2,0,3};
        int [] b=new int[a.length];
        int x= b.length-1;
        int idt = 0;
        for (int w:a){
            if (w==0) {
                b[x] = w;
                x--;
            }else {
                b[idt]=w;
                idt++;
            }

        }
        System.out.println(Arrays.toString(b));

        //Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
        //Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
        //on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Strings");
        String s1= input.next();
        String s2 = input.next();
        String [] ss1= s1.toLowerCase().split("");
        Arrays.sort(ss1);
        String [] ss2= s2.toLowerCase().split("");
        Arrays.sort(ss2);
        if (Arrays.equals(ss1,ss2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        //


    }
}
