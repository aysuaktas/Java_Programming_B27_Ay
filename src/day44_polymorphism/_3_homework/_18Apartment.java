package day44_polymorphism._3_homework;

public class _18Apartment extends _13Building implements _15HasBalcony {

    /*
    Create a class Apartment
    child class of Building
    implements HasBalcony

    create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease
     */


    int monthOfLease;

    public _18Apartment(String location, double price, int monthOfLease){
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying for the Apartment rent");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening balcony of the apartment");
    }

    @Override
    public String toString() {
        return "_18Apartment{" +
                "monthOfLease=" + monthOfLease +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
