package miniproject01;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    /*
   Project: Numerical Lotto Application
  Let n random numbers be generated for the ticket.
  Let the lottery result be generated with n random numbers.
  There should be no repeated numbers in the numerical lottery.

  Ask user to enter n(number of digits) also min and max values for numbers
  compare result of matching digits and ticket, how many matches there are
  notify the user.

   */
    public static void main(String[] args) {

        runLotto();


    }

    private static void runLotto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the total number of digits in the lottery");
        int numOfDigits= scanner.nextInt();
        System.out.println("Enter the minimum value you want to see in the ticket");
        int minValue= scanner.nextInt();
        System.out.println("Enter the Maximum value you want to see in the ticket");
        int maxValue= scanner.nextInt();

        int [] lottoArr = new int[numOfDigits];
        int [] ticketArr=new int[numOfDigits];
        //Math.random();
        Random random=new Random();
        int random1=0;
        int random2=0;
        boolean isRepeated=false;


        for (int i = 0; i<numOfDigits; i++){

            do{
                isRepeated=false;
                random1=random.nextInt(maxValue+1-minValue) + minValue;
                for(int j = 0; j<numOfDigits; j++){
                    if (lottoArr[j] == random1) {
                        isRepeated=true;
                        break;
                    }
                }
            }while(isRepeated);
            lottoArr[i]=random1;

            do{
                isRepeated=false;

                random2=random.nextInt(maxValue+1-minValue) + minValue;
                for(int j = 0; j<numOfDigits; j++){
                    if (ticketArr[j] == random2) {
                        isRepeated=true;
                        break;
                    }
                }
            }while(isRepeated);
            ticketArr[i]=random2;

        }
        System.out.println("Lucky numbers are: ");
        for (int i = 0; i<numOfDigits;i++) {
            System.out.print(lottoArr[i] + " ");
        }
        System.out.println();
        System.out.println("Your ticket is: ");
        for (int i = 0; i<numOfDigits;i++) {
            System.out.print(ticketArr[i] + " ");
        }
        System.out.println();
        int result=compareArr(ticketArr,lottoArr);
        if(result>0) {
            System.out.println("Congratulations!!! " + "You have "+ result + " number(s)");
        }else{
            System.out.println("Unfortunately no matching numbers");
        }
    }

    public static int compareArr(int[]arr, int[]brr){
        int counter= 0;
        for (int i = 0; i<arr.length;i++){
            for(int j = 0; j<brr.length;j++){
                if(arr[i] == brr[j]){
                counter++;
                }
            }
        } return counter;
    }
}
