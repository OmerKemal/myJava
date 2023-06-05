package day11forlooploop;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex 1: Type a code to find the multiplication of integers from 5 to 9
        int sum=1;
        for(int x=5; x<10; x++) {
            sum = sum*x;
        }
        System.out.println(sum);

        //Ex 3: Type a code to find the sum of the digits of an integer:

        int num= -202;
        num=Math.abs(num);
        int sumOfDigits= 0;
        for (int i = num; i>0 ; i/=10) {
            sumOfDigits=sumOfDigits+i%10;
        }
        System.out.println(sumOfDigits);

    }
}
