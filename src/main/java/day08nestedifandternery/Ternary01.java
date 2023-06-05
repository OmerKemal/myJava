package day08nestedifandternery;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a number is positive or not
        //Use if-else statement
        int num=-12;

        if (num>0){
            System.out.println("Positive");
        }else {
            System.out.println("Not Positive");
        }
        //Use ternary statement:
        String x=num>0 ? "Positive" : "Not Positive";
        System.out.println(x);

        //Example 2: Type a code to check if a number is even or odd;
        int y=13;
        String a= y%2==0 ? "Even" : "Odd";
        System.out.println(a);


        // Example 3: Type a code to find the minimum of two integers,

        int i = 12;
        int k = 21;

        int z=i<k ? i:k;
        System.out.println(z);
        //Example 4: Type code to calculate the "absolute value" of a number
            // for positive values absolute value will be the same, for negative values
            //multiply it with -1

        int d= -4;
        int absolute=  (d>0) ? d: d*-1;
        System.out.println("absolute");

        //Example 5: You have two integers;
            //If both are positive do multiplication, otherwise "I don't know how to multiply;

        int n1= 8;
        int n2= 23;

        Object dr =n1>0  && n2 >0 ? n1*n2 : "I don't know how to multiply";
        System.out.println(dr);

        //Example6: You have two integers
            // If both are positive, do addition, otherwise print the maximum one:

        int num1 = 22;
        int num2= 55;

        int answer= num1>0 && num2>0 ? num1+num2 : (num1>num2 ? num1 : num2);

        System.out.println(answer);










    }
}
