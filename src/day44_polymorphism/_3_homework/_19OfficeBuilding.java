package day44_polymorphism._3_homework;

public class _19OfficeBuilding extends _13Building implements _14HasElevator {

    /*
    Create a class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
     */

    int numberOfFloors;

    public _19OfficeBuilding(String location, double price, int numberOfFloors){
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying for the office building");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Going to floor number: " + numberOfFloors);
    }

    /*  --> Nazerke Omar'in elevator method'u implementation'i:

    public void elevator(int floor) {
        if (floor > numberOfFloors || floor < 0){
            System.out.println("Not valid floor");
        } else {
            System.out.println("Riding the elevator to the " + floor + " floor");
        }
    }
     */

    @Override
    public String toString() {
        return "_19OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
