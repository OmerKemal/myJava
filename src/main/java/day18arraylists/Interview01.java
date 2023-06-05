package day18arraylists;

public class Interview01 {
    public static void main(String[] args) {
        //Example 1: Swap the given two integers

        int a = 12;
        int b = 5;
        int temp= 0;

        temp=a;
        a=b;
        b=temp;
        System.out.println(a +" " + b);

        //2. Way:
        int c = 12;
        int d = 5;

        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println(c + " " + d);

    }
}
