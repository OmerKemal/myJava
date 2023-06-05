package day10forloops;

public class ForLoop01 {
    public static void main(String[] args) {
        //1) Loops are used for repeated actions in Java
        //2)There are 4 loops in Java i) for loop ii) while loop iii) do while loop iv) for each loop
        // For Loop


        //Example 1: Type a code to print "hi" 5 times on the console:

        String hi = "hi";
        for (int i = 1; i < 6; i += 2) {
            System.out.println("hi");
        }

        for (int s = 2; s < 5; s += 2) {
            System.out.println("Java is easy");
        }

        // Example 2: Type code to print integers from 12 to 3

        for (int x = 12; x > 2; x -= 1) {
            System.out.println(x);
        }

        // Type code to print even integers from 7 to 12,

        for (int e=8; e<13; e+=2){
        System.out.println(e);
        }

        //2 Way:

        for (int e= 7; e<13; e++){
            if(e%2==0);
            System.out.println(e);
        }
    }
}
