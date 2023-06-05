package exercises.exercise01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    public static void main(String[] args) {

        //There is a Map which contains product names as key and number of the products as value.
        //Type code to find the total number of products.

        Map<String, Integer> products=new HashMap<>();
        products.put("Laptop", 12);
        products.put("TV", 53);
        products.put("Refrigerator", 12);
        products.put("Music System", 87);

        Collection<Integer> numOfProducts = products.values();
        int sum= 0;

        for (int w: numOfProducts){
            sum+=w;

        }
        System.out.println(sum);


        //Example 2:


    }
}
