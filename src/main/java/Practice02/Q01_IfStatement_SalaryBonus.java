package Practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    public static void main(String[] args) {
        /*
         A company decided to give bonus of 5% of salary to employee if his/her year of
         service is 5 and more than 5 years.
         Ask user for their salary and year of service and print the net bonus amount.
         If employee can not get bonus, print how many more years he/she should work.

         EXAMPLE:
         INPUT   :   Year    => 4 year service
                     Salary  => 4000

         OUTPUT :  You need to work 1 year(s) to get bonus
          */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of service:");
        int year= Math.abs(input.nextInt());
        System.out.println("Enter your salary:");
        double salary= Math.abs(input.nextDouble());

        if (year>=5) {
            double bonus = salary*5/100;
            System.out.println("Your bonus will be "+ bonus );
        }else{
            int remainingYears= 5-year;
            System.out.println("You need to work " + remainingYears +"year(s) more");
        }


    }
}
