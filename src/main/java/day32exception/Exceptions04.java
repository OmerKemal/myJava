package day32exception;
/*
        1)finally block is used for the codes will be executed for every scenario
            like cutting connection with the database
        2)Could you please explain "final", finally", and "finalise"
            final: we learnt this
            finally: we learnt it over here
            finalise: it is a method,
            it is used before destroying data in memory by garbage collector
 */

public class Exceptions04 {
    public static void main(String[] args) {

    }

    //Example 1: Create a method that divides two integers
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }finally {
            System.out.println("The operation is complete.");
        }
    }
}
