package day45_polymorphism._1_building;

import day45_polymorphism._1_building._01Building;
import day45_polymorphism._1_building._02HasElevator;

public class _07OfficeBuilding extends _01Building implements _02HasElevator {

    // set up icin son class'ti bu, bu class'tan sonra polymorphism kismina gececegiz

    int numberOfFloors;

    public _07OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for office space");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("We are going to floor " + floor);
    }

    @Override
    public String toString() {
        return super.toString() + " Number of floors: " + numberOfFloors;
    }
}

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
