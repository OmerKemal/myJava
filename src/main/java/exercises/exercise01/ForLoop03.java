package exercises.exercise01;

public class ForLoop03 {
    public static void main(String[] args) {
        //Type all characters before the first occurrence of 'm' in a String
        String s= "Kerem";
        for (int i = 0; i<s.length(); i++){
            char ch= s.charAt(i);
            if (ch=='m' || ch=='M') {
                break;
            }else{
                System.out.print(ch);
            }

        }

        //Ex : Find the total number of characters different from space and punctuation marks in a String

    }
}
