package day45_polymorphism._1_building;

import day45_polymorphism._1_building._01Building;
import day45_polymorphism._1_building._03HasBalcony;

public class _06Apartment extends _01Building implements _03HasBalcony {  // Apartment'in backyard'i da olursa o zaman implements _03HasBalcony sonrasinda virgul ile _04HasBackyard'i da eklerdik ama simple tutmak icin Saim bir tane vermis backyard'i yok balkonu var gibi vermis yani


    int monthsOfLease;

    public _06Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for apartment");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening door for balcony");
    }

    @Override
    public String toString() {
        return super.toString() + " Months of lease: " + monthsOfLease;
    }
}

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