package day05StringManipulations;

public class Exercise01 {
    public static void main(String[] args) {
        String city="Manchester";

        String trimmedLowName=city.trim().toLowerCase();
        String updatedCityName=trimmedLowName.substring(0,1).toUpperCase()+
                trimmedLowName.substring(1);
        System.out.println(updatedCityName);



        String n1="James Rowling";
        String n2="Mike";
        String n3="Ahmet";

        int fullNames=n1.replaceAll(" ","").length()+
                n2.replaceAll(" ","").length()+
                n3.replaceAll(" ","").length();
        System.out.println(fullNames);



    }
}
