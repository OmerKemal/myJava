package day32exception;

public class Exceptions01 {
    public static void main(String[] args) {
        System.out.println(getCharFromStringByIndex("Java", 2));
        System.out.println(getCharFromStringByIndex("Java", 4));

        System.out.println(numOfCharacters("Automation"));
        System.out.println(numOfCharacters(null)); // NullPointerException

        System.out.println(convertToInt1("123"));
        System.out.println(convertToInt1("1ab"));//NumberFormatException

        System.out.println(convertToInt2("1ab")); // with parseint method

    }

    //Example 1: Create a method to get a character from a String by using index
    public static char getCharFromStringByIndex(String s, int idx){
        try {
            return s.charAt(idx);
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(idx + "does not exist as index");
            return ' ';
        }

    }

    //Example 2: Create a method to get the number of characters in a String
    public static int numOfCharacters(String s){

        try{
            return s.length();
        }catch (NullPointerException e) {
           System.out.println("This message cannot be used with null");
           return 0;
        }

    }
    //Example 3: Create a method to convert a string to an integer
    public static int convertToInt1(String s){
        try {
            return Integer.valueOf(s);
        }catch (NumberFormatException e) {
            System.out.println("Do not use non-digit characters in valueOf()");
            return 0;
        }
    }

    public static int convertToInt2(String s){
        try {
            return Integer.parseInt(s); // returns int - return type is int
        }catch (NumberFormatException e) {
            System.out.println("Do not use non-digit characters in valueOf()");
            return 0;
        }
    }
}
