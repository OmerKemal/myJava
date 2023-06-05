package exercises.exercise01;

public class XXX {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {


            for (int j = 0; j < 8; j++) {


                if (j > 0 && j < 7 && i > 0) {
                    System.out.print("X");
                } else {
                    System.out.print("A");
                }

            }

            System.out.println();


            for (int z = 0; z < 4; z++) {
                for (int j = 0; j<8; j++) {
                    if (j==0 || j==7 || z==0 || z==3) {
                        System.out.print("A ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
        }
    }
}
