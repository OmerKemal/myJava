package exercises.exercise01;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex 1: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers


        String s = "";
        for (Integer x = 120; x > 10; x--) {
            if (x % 4 == 0 && x % 6 == 0) {
                s = s + x + " ";
            }
        }
        System.out.println(s);


        //ex: Type code to print repeated characters in a String. For example; accessories ⇒ ces

        String a = "accessories";
        String b = "";

        for (Integer i = 0; i < a.length(); i++) {
            String m = a.substring(i, i + 1);
            if (a.indexOf(m) != a.lastIndexOf(m)) {
                if (!b.contains(m)) {
                    b = b + m;
                }
            }

        }
        System.out.println(b);

        // Ex 3: Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

        String palindrome= "Anna";
        String check= "";


        for (Integer q= palindrome.length()-1; q>-1;q--) {

            String c= palindrome.substring(q,q+1);

            check = check + c;

        }
        if (check.equals(palindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //Ex 4: Type code to print the unique digits in an integer. Example; 223878 ⇒ 37

        Integer num= 399580902;
        String p = String.valueOf(num);
        String d= "";


        for (Integer n= 0; n<p.length(); n++) {
            String k= p.substring(n,n+1);
            if (p.indexOf(k)==p.lastIndexOf(k))
            {
                d=d+k;
            }

        }
        System.out.println(d);


        //Ex 7: Type code to create multiplication table like
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int number = 4;
        for (int z= 1; z<11; z++) {
            System.out.println(number + "x" + z + "=" + number*z);
        }

        //Ex 8: Type code to print odd integers from 20 to 3 in the same line with a space between two
        //consecutive ones.

        String odd= "";

        for (int trt = 20; trt>2; trt--) {
            if (trt%2!=0) {
                odd=odd+trt +" ";
            }
        }
        System.out.println(odd);


        // Ex 9: Type code to print all lowercase characters in a String with an asterix.
        //For example; 'Ali Can?' ==> l*i*a*n*

        String mng = "Ali Can?";
        mng= mng.replaceAll("[^a-z]", "");
        String newWord= "";
        for (Integer r= 0; r<mng.length(); r++){
            String l = mng.substring(r,r+1);
            newWord= newWord+ l + '*';
        }
        System.out.println(newWord);

        // Ex 10: Type code to print digits just in the decimal part of the given decimal number with an
        //asterix. For example; 75.4238 Ş *4*2*3*8

        double j = 75.4238;
        String ss = String.valueOf(j);
        int idxOfComma = ss.indexOf(".");
        String decimalPart=ss.substring(idxOfComma+1);
        String g= "";
        for (Integer e = 0; e<decimalPart.length(); e++){
        String h= decimalPart.substring(e,e+1);
        g=g +'*'+ h;
        }

        System.out.println(g);

        for (int r= 10; r<31; r++){
            System.out.print(r +",");
            break;
        }

        for (int y = 0; y<101; y++) {
            if (y%2==0) {
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

        Scanner input = new Scanner(System.in);

        int sum = 0;
        do {
            System.out.println("Please enter a number:");
            int answer= input.nextInt();
            sum= sum+answer;
        } while (sum<501);






    }
}
