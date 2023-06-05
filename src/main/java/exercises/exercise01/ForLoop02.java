package exercises.exercise01;

public class ForLoop02 {
    public static void main(String[] args) {
        //Ex 1: Type code to draw the following image by using a for loop.
        //A A A A A
        //A A A A A
        //A A A A A
        int row=4;
        int columns = 4;
        for (int i= 1; i<=row; i++) {
            for (int k = 1; k<= columns; k++) {
                System.out.print("A ");
            }
            System.out.println();
        }

        //Type code to draw the following image by using a for loop.
        //A
        //A A
        //A A A
        //A A A A

        int rows2=4;
        int columns2=4;
        for(int a= 1; a<=rows2; a+=1) {
            for(int b= 1; b<=a; b+=1){
                System.out.print("A ");
            }
            System.out.println();
        }

        //Type code to draw the following image by using a for loop.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A

        int r= 4;
        int c= 8;
        for (int x = 1; x<=r;x++){
            String s = "";
            if (x == 1) {
                for (int y = 1; y<=c; y++) {
                    s=s+"A ";
                }
                    System.out.println(s);
                }else {
                    s=s+"A ";
                    for (int m=2; m<c;m++){
                        s=s+"X ";
                    } s=s+"A";
                System.out.println(s);
                }
            }

            //Type code to find the sum of the unique digits of an integer
                //Example: 12133455 Ş 2+4=6
        int d= 12133455;
        String v= String.valueOf(d);
        int sum = 0;
        for(int x= 0; x<v.length();x++) {
            String l= v.substring(x,x+1);
            if(v.indexOf(l) == v.lastIndexOf(l)) {
                sum = sum + Integer.valueOf(l);
            }
        }





        }



    }
