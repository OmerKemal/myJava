package day22stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java");
        sb1.insert(1,"xxx"); //Jxxxava
        sb1.insert(4,"abcde",1,3); // Jxxxbcava
        sb1.reverse(); //avacbxxxJ
        sb1.replace(5,8,"y"); //avacbyJ
        String sb2=sb1.toString();
        StringBuilder sb3= new StringBuilder("sb2");
        int idx = sb3.indexOf("a"); //0
        int idx2 = sb3.lastIndexOf("a");
        int idx3 = sb3.indexOf("a", 1); // starts searching from the first index // 2
        int idx4 = sb3.lastIndexOf("a",3);

    }
}
