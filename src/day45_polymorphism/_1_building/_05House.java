package day45_polymorphism._1_building;

public class _05House extends _01Building implements _04HasBackyard {  // from an interface to a class -> implements keyword'u kullandik

    int numberOfResidents;

    // constructor:
    public _05House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the lawn in the backyard");
    }


    // toString() method is about 'how the object should print':
    @Override
    public String toString() {
        return super.toString() + " Number of residents: " + numberOfResidents; // super class'taki toString() methodu guzel, sadece onda olmayip bunda olan numberOfResidents'i de ekledik manual olarak -> concatenation yapip
    }
}

    /*
    Create a class House
    child class of Building
    implements HasBackyard

    create instance variable
        int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents
     */