package day28interfacescollections;

/*
        1) Java does not support multiple inheritance for classes but
        if you put all common functionalities into a single class, the parent class will be huge. Atomic structure is
        promoted by Java
        2) To be able to use multiple inheritance, Java created interface structure; multiple interfaces
        can be parents of a class.
        3) Interface is interface; it is not a class,
        4) Interfaces common mandatory functionalities
            Interfaces are to do lists for concrete child classes
        5) All the methods in an interface;
                i) are abstract;
                ii) are public;
        6) In class structure we cannot have multiple inheritance, because the body part causes confusion, but in
        interface structure, as there is no method body, it can have multiple inheritance.
        7) Variables;
            i) All variables in an interface are final
            ii) All variables are public
            ii) All variables are static
        8) Interfaces have abstract methods and uncompleted codes that is why Java does not let create objects
        from an interface.
            Note: Interfaces do not have constructors.

        9) If the methods are the same, then return types of the methods must be same as well.
        10) Normally we cannot put method with a body into an interface, but by using two keywords we can create a method
        with a body in an interface
                i) default ===> it is not mandatory to override
                            ===> To use default methods create an object from the concrete child class
                ii)static ====> It is not mandatory to override
                            ===>To use static methods we need to create an object that uses interface name

        11) Class ===> Class: extends
            Interface ===> interface : extends
            Class ===> interface : implements
            Interface ===>Class - impossible to create

 */

public class Honda implements Engine,Brake,Ac{


    @Override
    public void run() {
        System.out.println("Honda engine runs well");
    }

    @Override
    public int weight() {
        return 500;
    }

    @Override
    public boolean isKillingBacteria() {
        return true;
    }

    @Override
    public int price() {
        return 2000;
    }


}
