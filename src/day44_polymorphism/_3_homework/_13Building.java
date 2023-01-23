package day44_polymorphism._3_homework;

public abstract class _13Building {

    /*
    Create an abstract class Building

    create instance variables:
        String location
        double price

    create abstract methods:
        void pay()

    create a constructor to assign the location & price

    override the toString to print the location & price
     */

    String location;
    double price;

    public abstract void pay(); // building'de her seyin price'i farkli olacak, o yuzden onlari bu parent class'ta belirlemiyoruz. If you have a building, you have to pay demis olduk buna, ne icin ne kadar oldugu ise her seyde farkli, ayri class'larda belirtecegiz.

    public _13Building(String location, double price){
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
