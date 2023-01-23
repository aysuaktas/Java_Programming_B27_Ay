package day45_polymorphism._1_building;

import java.util.ArrayList;

public class _09BuildingMarket {

    public static void main(String[] args) {


        ArrayList<_01Building> allBuildings = new ArrayList<>();
        allBuildings.add(new _05House("New York", 400_000, 4));
        allBuildings.add(new _06Apartment("Texas", 3_000_000, 6));
        allBuildings.add(new _07OfficeBuilding("Virginia", 20_000_000, 6));
        allBuildings.add(_08BuildingUtil.search("Mclean"));  // added the OfficeBuilding from the search method
        allBuildings.add(_08BuildingUtil.search("Great Falls"));  // added House obj


        //  Find the most expensive Buildings, print all its information:

        _01Building mostExpensive = allBuildings.get(0);  // just a default value -> 0'dan basliyoruz default gibi, sonra zaten daha pahalisi varsa degisecek loop'ta:

        for(_01Building each : allBuildings) {  // iterating through the Building objects from the allBuildings arraylist
            if (each.price > mostExpensive.price) {   // accessibility is defining by reference. _01Building benim reference'im ve bunda price oldugu icin price'a access edebilirim
                mostExpensive = each;
            }
        }
        System.out.println("Most expensive: " + mostExpensive);  // Most expensive: Location: Virginia, price: 2.0E7 Number of floors: 6 --> eger ustte search methodunu kullanirken Mclean yerine case sensitivity'e uymayan McLean falan yazsaydim o zaman NullPointerException verecek, we would need to figure it out. Try catch ile exception'i handle edebilirdik veya if statement kullanabilirdik ve bunda null ise sadece price'i check edebilirdik vs.

//      mostExpensive.numberOfFloors;   --> this does not compile because the reference is _01Building, but _01Building does not have visibility to the variable --> (( this is about reference type casting topic. Most expensive olani bulduk ve bunun bir Office building oldugunu gorduk. Office building olmasina ragmen reference type'imiz olan Building bunu goremiyor. Ama sadece OfficeBuilding'i kullanmak da flexible degil, cunku digerlerinde (House veya Apartment'te mesela) kullanamayiz oyle olursa. O nedenle reference type casting yapacagiz:

        System.out.println(((_07OfficeBuilding)mostExpensive).numberOfFloors); // 6 --> ((from)) reference of Building --> ((to)) reference of OfficeBuilding


        // Filter all the Buildings within a certain price range:

        ArrayList<_01Building> filteredBuildings = new ArrayList<>(allBuildings);

        filteredBuildings.removeIf(p -> p.price >= 2_000_000 || p.price <= 300_000);  // if the price >= 2_000_000 OR price <= 300_000 ise -> bunu arraylist'in removeIf'iyle yazdik, bu statement'e uyan yani >= 2_000_000 ve <= 300_000 olanlar print edilmeyecek filteredBuildings print edilirken:
        System.out.println(filteredBuildings);  // [Location: New York, price: 400000.0 Number of residents: 4, Location: Great Falls, price: 500000.0 Number of residents: 4]

    }
}

    /*
    With ArrayList

    create a class BuildingMarket
    create a main method

    create an ArrayList of Building
        -> this can hold objects of House, Apartment, & OfficeBuilding

    create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

    mini tasks:

        - Find the most expensive Buildings, print all its information
        - Find the least expensive Buildings, print all its information
        - Filter all the Buildings in one location(ex search for buildings in Chicago)
        - Filter all the Buildings within a certain price range
     */