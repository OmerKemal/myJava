package day16arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //1. Array lists are for storing multiple data in the same data type
        //2. Arrays are fixed in length but ArrayLists are flexible in size;
        //3. If arrays are not good why did Java create them?:
        //  because arrays use less memory and Arrays are super fast
        //  if you are sure about the length use Array instead of ArrayLists
        //4. Arrays can store just primitive data and the reference of the non-primitive
        //ArrayLists can store just non-primitive data
        //5. Arrays are poor in methods; ArrayLists are more rich in terms of methods


        //How to create an ArrayList:

        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> cities=new ArrayList<>();

        cities.add("Miami");
        cities.add("New York");

        //How to add an element in it:
        //add( ) adds the elements into the list in insertion order

        names.add("Tom");
        System.out.println(names); //[Tom]

        //add(index, element) puts the given element to the given index;
        names.add(1, "Jim");

        names.addAll(cities); //[Tom, Jim, Miami, New York]
        // addAll method is for adding a list to another one

        names.addAll(1,cities);//[Tom, Miami, New York, Jim]
        //addAll method- the other one, defines the index that you want to add all the elements of a list

        System.out.println(names);

        //How to check if a list is empty or not?
        ArrayList<String> countries=new ArrayList<>();

        cities.add("Albania");
        cities.add("Russia");

        // get the number of elements in the list if it is 0, it means the list is empty:

        //1. Way

        if(countries.size() ==0){ // size methdod gives you the number of elements in a list
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        //2. Way:
        if(countries.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        // Example 1: Add "TR" to the list if it does not exist:

        if (!countries.contains("TR")){
            countries.add("TR");
        }
        System.out.println(countries);

        countries.set(1, "China");

        //Example 3: Remove elements if the length is 2;

       // for (String w : countries) { // We cannot use remove method in for each loop:
         //   if(w.length==0) {
             //   remove (w);
           // }

        //}

        for (int i =0; i< countries.size(); i++) {
            if (countries.get(i).length()==2) {
                countries.remove(i);
            }
        }

        //Example 4: Create an Integer array list and remove a specific element:

        ArrayList<Integer> ages= new ArrayList<>();
        ages.add(12);
        ages.add(5);
        ages.add(23);
        ages.add(19);
        // If you use integer in remove method parenthesis Java will accept it as index; if you want to select an integer;
        //use autoboxing;
        ages.remove((Integer)23);


        //Example 5: Create an array list an remove multiple elements;

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(12);
        nums.add(5);
        nums.add(23);
        nums.add(19);


        ArrayList<Integer> heights= new ArrayList<>();
        heights.add(12);
        heights.add(5);

        nums.removeAll(heights); // All elements in heights will be removed from the nums list;






    }
}
