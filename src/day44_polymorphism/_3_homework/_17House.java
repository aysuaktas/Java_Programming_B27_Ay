package day44_polymorphism._3_homework;

public class _17House extends _13Building implements _16HasBackyard {

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

    int numberOfResidents;

    public _17House(String location, double price, int numberOfResidents){
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    //  implement all abstract methods: ((bu kisimda sadece extends ve implements olan class'lardaki methods'u kullanabiliyoruz)):

    @Override
    public void pay() {
        System.out.println("Paying for House rent");
    }

    @Override
    public void mowLawn() {    // mow the lawn = cimleri bicmek
        System.out.println("Going into Backyard. Mowing the lawn of the House");
    }

    @Override
    public String toString() {
        return "_17House{" +
                "numberOfResidents=" + numberOfResidents +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
