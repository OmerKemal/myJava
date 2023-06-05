package day24inheritance;

public class VehicleRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic(true); // all three constructors of Vehicle/Honda and Civic work to create this object
                // Vehicle Constructor/THis is our Honda Constructor//This is Civic constructor

        //Civic myCivic2=new Civic(true);//  Vehicle constructor.
                                            // This is our Honda constructor.
                                            // Civic constructor with a boolean parameter
        myCivic.brake(); // from the Honda class
        myCivic.engine(); // from the Honda class
        myCivic.move();  // from the Vehicle class

        // myCivic.equals(); // coming from the object class
        myCivic.ecoSystem();
        int hashCode= myCivic.hashCode();

        System.out.println("hashCode = " + hashCode);

        Accord myAcc= new Accord();

        myAcc.turboSystem();
        myAcc.brake();
        myAcc.move();
    }
}
