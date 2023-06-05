package day31mapsexceptions;

public class Exceptions02 {
    public static void main(String[] args) {
        String[] arr= {"Tom", "Ajda", "Brad", "Cüneyt", "Angelina"};
        System.out.println(getElementFromStringArray(arr, 6)); // no index



    }
    //Example: Create a method that returns any elements
    // from an array by using the index of the element.
    public static String getElementFromStringArray(String[]arr, int idx){
        try{
            return arr[idx];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not enter an invalid index");
        }
        return arr[idx];
    }
}

