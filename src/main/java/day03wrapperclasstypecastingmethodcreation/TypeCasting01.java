package day03wrapperclasstypecastingmethodcreation;

public class TypeCasting01 {

    public static void main(String[] args) {

        // byte- short -int - long - float - double
        // this one is autowidening

        byte b = 25;
        short s = b;
        System.out.println(s);

        //Explicit narrowing

        long n = 5674;
        short h = (short)n;

        long t= 800;
        short m= (short)t;

        int x= 49;
        byte d= (byte)x;


        float f = 12.78F;

        int i = (int)f;

        System.out.println(i);






    }

}
