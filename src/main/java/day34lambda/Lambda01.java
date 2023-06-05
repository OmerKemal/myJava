package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    /*
    1) We learned structural programing so far
    2) "Functional Programming" uses Java methods mostly to type codes
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printEvenElements(nums);
        System.out.println();
        printEvens(nums);
        System.out.println();
        printSquareOfDistinctOddElements(nums);
        System.out.println();
        System.out.println(findSumOfCubeOfDistinctEvens(nums));
        System.out.println();
        System.out.println(findMax1(nums));
        System.out.println();
        System.out.println(findMax2(nums));
        System.out.println();
        System.out.println(multiplicationOfElementsLessThanFifteen(nums));
        System.out.println();
        System.out.println(checkIfLessThanX(nums, 140));
        System.out.println();
        System.out.println(isNoneNegative(nums));
        System.out.println();


    }

    //Example 1: Create a method to print even elements in a list
    //1. Way: Use Structural programming
    public static void printEvenElements(List<Integer> myList){
        for(Integer w: myList) {
            if (w%2==0) {
                System.out.println(w+" ");
            }
        }
    }

    //2.Way: Use "functional programming":
    public static void printEvens (List<Integer> myList){
        myList.stream ().filter (t->t%2==0).forEach(t-> System.out.println(t+ " "));
    }

    // Example 2: Create a method to print the square of distinct unique odd elements
    public static void printSquareOfDistinctOddElements(List<Integer> myList){
        myList.stream().distinct().filter(t->t%2!=0).map(t->t*t).forEach((t-> System.out.println(t+" ")));
    }

    //Example 3: Create a method to find the sum of the cube of the even elements
    public static int findSumOfCubeOfDistinctEvens (List<Integer> myList){
        return myList.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0, (t,u)->t+u);
    }

    //Example 4: Create a method to find the element whose value is the maximum:

    //1.Way:
    public static int findMax1(List<Integer> myList) {
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t,u) ->t>u ? t:u);
    }

    //2.Way:
    public static int findMax2(List<Integer> myList) {
        return myList.stream().distinct().sorted().reduce((t,u)->u).get();
    }


    public static int findMin1(List<Integer> myList) {
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t,u) ->t<u ? t:u);
    }
    public static int findMin2(List<Integer> myList) {
        return myList.stream().distinct().sorted().findFirst().get();
    }

    //Example 6: Create a method to find the multiplication of the elements less than 15 and even:

    public static int multiplicationOfElementsLessThanFifteen(List<Integer> myList){
        return myList.stream().filter(t->t<15&& t%2==0).reduce(1, (t,u) ->t*u);
    }

    //Example 7: Create a method to check if all elements are smaller than 140 or not
    public static boolean checkIfLessThanX(List<Integer> myList, int num){

        return myList.stream().allMatch(t->t<num);
    }

    //Example 8: Check if no element is negative or not:
    public static boolean isNoneNegative(List<Integer> myList){

        return myList.stream().noneMatch(t->t<0);
    }
    //Example 9: Check if any elements has 3 digits

    public static boolean doesAnyHaveThreeDigits(List<Integer> myList){
        return myList.stream().anyMatch(t->t>99 && t<1000);
    }




}
