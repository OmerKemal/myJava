package day35lambda;

public class Utils {

    public static int fintSumOfDigits(int a){
        int sum=0;
        while(a>0){
            sum = sum + a%10;
            a=a/10;
        }
        return sum;
    }
    public static int getSquare(int a){
        return a*a;
    }

    public static void printInTheSameLine(Object s){
        System.out.println(s + " ");
    }

    public static boolean checkToBeEven(int a){
        return a%2==0;
    }

    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }

}
