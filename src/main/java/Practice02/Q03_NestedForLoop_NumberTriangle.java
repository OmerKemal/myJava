package Practice02;

import java.util.Scanner;

public class Q03_NestedForLoop_NumberTriangle {
    public static void main(String[] args) {
        /*
         Type code to ask user to enter the number of row
         and print the shape below according to that number:
          1
          2 3
          4 5 6
          7 8 9 10
          11 12 13 14 15
          16 17 18 19 20 21
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of row");
        int row= input.nextInt();
        int num= 1;
        for(int i= 0; i < row; i++) {
            for (int k = 0; k<=i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }



    }
}
