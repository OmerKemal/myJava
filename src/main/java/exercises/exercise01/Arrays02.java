package exercises.exercise01;

public class Arrays02 {
    public static void main(String[] args) {
        //Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
        //Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

        String[] names= { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };

        for (String s:names){
            if(s.endsWith("n")||s.endsWith("k")){
                System.out.print(s.charAt(0));
            }
            System.out.println();
        }
        //Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String [] n= { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        int sum=0;
        for(String g:n){
            sum=sum+g.length();
        }
        System.out.println(sum);

        //Count how many words start with 'a' or 'A' in a given String:
        String s = "Apex is an object oriented programming language";
        String [] t=s.split(" ");
        int counter=0;
        for (String p :t){
            if(p.startsWith("A") || p.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter);


        //Find the number of vowels in a String
        String m = "Apex is an object oriented programming language";
        String [] x = m.toLowerCase().split("");
        int count=0;
        for (String h: x) {

                switch (h){
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        count++;
                }

        }
        System.out.println(count);

        //Type code to find array elements whose first and last characters are same
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for(String e:arr) {
            if (e.charAt(0) == e.charAt(e.length()-1)){
                System.out.print(e +" ");
            }
        }

        //Type code to find if a given element exists in a given array or not
        String[] barr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String element = "object";
        int coun = 0;
        for (String c:barr) {
            if(c.equalsIgnoreCase(element)){
                coun++;
            }
        }
        if(coun>0) {
            System.out.println("It exists");
        }else{
            System.out.println("It does not exist");
        }



    }
}
