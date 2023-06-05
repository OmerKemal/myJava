package day18arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the number of different elements in an arraylist
        //repeated elements must be taken once
        //create a new list and create a list of uniques
        //           [2, 3, 1, 2, 1, 5, 3] ==> [2, 3, 1, 5] ==> 4

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);

        ArrayList<Integer> newnums= new ArrayList<>();

        for(Integer w:nums){
            if(!newnums.contains(w)){
                newnums.add(w);
            }
        }
        System.out.println(newnums);
        System.out.println(newnums.size());

        //Example 2: Type code to increase salaries in a list like if the salary is less than 10000
        //           increase it %20 otherwise increase it by adding 500

        ArrayList<Double> salaries=new ArrayList<>();
        salaries.add(9810.0);
        salaries.add(12450.0);
        salaries.add(15230.0);
        salaries.add(7500.0);
        salaries.add(10000.0);
        System.out.println(salaries);

        for(Double u: salaries) {
            if (u<10000){
                salaries.set(salaries.indexOf(u), u*1.2);
            }else{
                salaries.set(salaries.indexOf(u), u+500);
            }
        }
        System.out.println(salaries);

        //More Methods in arrays
        ArrayList<Integer> n= new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(1);
        n.add(2);
        n.add(1);

        ArrayList<Integer> p= new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(9);


        n.retainAll(p); // This method keeps the common elements of the first and second list in the first list
        //second list does not change, only the first list is edited
        System.out.println(n);
        System.out.println(p);


    }
}
