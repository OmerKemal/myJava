package exercises.exercise01;

public class ExerciseV {
    public static void main(String[] args) {
        int rows = 4, columns = 8;
        for(int i=1; i<=rows; i++){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);}
            }


            // Ex: Type code to find the sum of the integers from 3 to 14

            int sum= 0;
            for (int r= 3; r<15; r++) {
                sum=sum+r;
            }
        System.out.println(sum);

        }
    }
