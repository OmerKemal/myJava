package day02variables;

public class Variables03 {
    public static void main(String[] args) {
        // create two short valuables and create their sum on the console
        short s1 = 12;
        short s2 = 20;
        System.out.println(s1+s2);

        //Example 2: create two variables for prices and then create their sum on the console

        double shirtPrice = 12.99;
        double shoesPrice = 124.99;
        System.out.println(shirtPrice+shoesPrice);

        //Example 3: Create a variable for students age and another variable for population of a country

        byte studentsAge = 13;
        int populationOfGermany = 83000000;
        System.out.println(studentsAge-populationOfGermany);

        // If you use different data types, the result will be in the larger data type
        //If you use the same type, the result will be in the same type;
        //for instance id you divide 6 to 5 the result will be 1

        System.out.println(6/5);

        // If you want to see 1.2 when you divide 6 by 5;

        System.out.println(6/5.0);
        //this is how you should formulate it

        // Example: estimate the result of the given operation
        // (2+4.6) / 3 - 4*2   (1. parenthesis, 2 multiplication and division -the one on the left)

        System.out.println((2+4.6) / 3 - 4*2);

        // 1. in the parenthesis 2. multiplications/divisions 3. additions and subtractions




    }
}
