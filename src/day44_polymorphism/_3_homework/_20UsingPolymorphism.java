package day44_polymorphism._3_homework;

public class _20UsingPolymorphism {

    /*
    Extra practice: part two - using objects
---------------------------------------------------------------------------------

Using Polymorphism:

    Create the objects of the House using all these references and check what the object has access to:
        House, Building, HasBackyard

For more practice about references, do the same task for Apartment and OfficeBuilding for all their references of itself, super class, and interface
     */


    // Faydalandigim Nazerke Omar's solution:

    public static void main(String[] args) {

        _17House house1 = new _17House("Great Falls", 700_000, 2);  // _17House class'indaki constructor'in sirasiyla yani -> public _17House(String location, double price, int numberOfResidents){ e gore

        System.out.println(house1.location);
        System.out.println(house1.price);
        System.out.println(house1.numberOfResidents);

        house1.pay();
        house1.mowLawn();

        System.out.println("------------");


        _13Building house2 = new _17House("San Jose", 1_000_000, 4);

        System.out.println(house2.location);
        System.out.println(house2.price);
//      System.out.println(house2.numberOfResidents);   --> bu olmaz cunku numberOfResidents method'unun parent class olan _13Building ile bir alakasi yok

        house2.pay();
//      house2.mowLawn();   --> bu method da house2 icin olmaz

        System.out.println("------------");


        _16HasBackyard house3 = new _17House("New York", 900_000, 5);

//      System.out.println(house3.location);
//      System.out.println(house3.price);
//      System.out.println(house3.numberOfResidents);   --> house3 icin bunlarin 3u de olmaz

//      house3.pay();   --> house3 icin bu method olmaz
        house3.mowLawn();

        System.out.println("------------");


        _18Apartment apt1 = new _18Apartment("FairFax", 250_000, 8);  // _18Apartment'taki constructor'daki: String location, double price, int monthOfLease) sirasiyla

        System.out.println(apt1.location);
        System.out.println(apt1.price);
//      System.out.println(apt1.numberOfResidents);  // bu _18Apartment class'inda olmadigi icin olmaz
        System.out.println(apt1.monthOfLease);

        apt1.pay();
//      apt1.mowLawn();  // apt1 icin bu method olmaz
        apt1.openBalcony();

        System.out.println("------------");

        _13Building apt2 = new _18Apartment("San Jose", 310_000, 9);

        System.out.println(apt2.location);
        System.out.println(apt2.price);
//      System.out.println(apt2.numberOfResidents);  --> bu olmaz, _13Building parent class'inda yok, olmadigi icin warning veriyor
//      System.out.println(apt2.monthOfLease);   --> bu da ayni sebepten, olmaz

        apt2.pay();
//      apt2.mowLawn();  // apt2 icin bu method olmaz
//      apt2.openBalcony(); //  apt2 icin bu method olmaz

        System.out.println("------------");


        _15HasBalcony apt3 = new _18Apartment("New York", 350_000, 10);
//      System.out.println(apt3.location);
//      System.out.println(apt3.price);
//      System.out.println(apt3.numberOfResidents);  --> _15HasBalcony class'inda bunlar olmadigi icin olmaz

//      apt3.pay();  --> apt3 icin olmuyor
//      apt3.mowLawn();  -> apt3 icin olmuyor
        apt3.openBalcony();

        System.out.println("------------");


        _19OfficeBuilding office1 = new _19OfficeBuilding("McLean", 3_500_000, 2);
        System.out.println(office1.location);
        System.out.println(office1.price);
        System.out.println(office1.numberOfFloors);
        office1.pay();
        office1.elevator(2);
        office1.elevator(3);

        System.out.println("------------");


        _13Building office2 = new _19OfficeBuilding("San Jose", 7_000_000, 1);
        System.out.println(office2.location);
        System.out.println(office2.price);
        office2.pay();

        System.out.println("------------");


        _14HasElevator office3 = new _19OfficeBuilding("New York", 10_000_000, 3);
        office3.elevator(1);


        System.out.println(_21BuildingUtil.rent(office2));
        System.out.println(_21BuildingUtil.rent(apt1));
        System.out.println(_21BuildingUtil.rent(house2));


    }
}