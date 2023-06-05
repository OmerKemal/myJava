package day03wrapperclasstypecastingmethodcreation;

public class Wrapper01 {

    public static void main(String[] args) {


        byte age = 12;  //If you put dot after age - no method

        Byte stdAge = 13; // If you put dot after Age, methods will appear.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Example: Find the sum of the min and max value of short data type?
        System.out.println(Short.MIN_VALUE+Short.MAX_VALUE);


        //Examp: Find the size of the int?

        System.out.println(Integer.SIZE);

        System.out.println(Float.SIZE);

        // Example 3:
        System.out.println(Long.SIZE);

        System.out.println(Integer.max(12, 43));

        System.out.println(Long.min(23,124));

        System.out.println(Integer.parseInt("234") + 1);

        //How to convert primitive data type to its "wrapperclass" or vice versa?

        int num = 25;

        Integer wrapperNum = num;

        // Converting primitive data to wrapperclass is called autoboxing

        //Convert wrapper class to its primitive data type:
        // it is called unboxing

        Short s = 245;
        short primitiveS = s;








    }

}
