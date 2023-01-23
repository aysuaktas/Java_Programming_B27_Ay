package day44_polymorphism._3_homework;

import java.util.ArrayList;

public class _22BuildingMarket {

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

    // Nazerke's solution:

    public static void main(String[] args) {

        ArrayList<_13Building> buildingList = new ArrayList<>();

        buildingList.add(new _19OfficeBuilding("Chicago", 3_000_000, 4));
        buildingList.add(new _19OfficeBuilding("New York", 4_000_000, 2));
        buildingList.add(new _19OfficeBuilding("San Francisco", 30_000_000, 4));
        buildingList.add(new _17House("Chicago", 700_000, 3));
        buildingList.add(new _17House("New York", 800_000, 2));
        buildingList.add(new _17House("San Francisco", 1_000_000, 5));
        buildingList.add(new _18Apartment("Chicago", 200_000, 13));
        buildingList.add(new _18Apartment("New York", 300_000, 12));
        buildingList.add(new _18Apartment("San Francisco", 400_000, 6));


        System.out.println("---------");


        // to find most expensive Buildings:

        _13Building mostExpensive = buildingList.get(0);
        for (_13Building each : buildingList) {
            if (each.price > mostExpensive.price) {
                mostExpensive = each;
            }
        }
        System.out.println("Most expensive building: " + mostExpensive);


        System.out.println("---------");

        // least expensive Buildings:

        _13Building leastExpensive = buildingList.get(0);
        for (_13Building each : buildingList) {
            if (each.price < leastExpensive.price) {
                leastExpensive = each;
            }
        }
        System.out.println("Least expensive building: " + leastExpensive);


        System.out.println("---------");

        // Filter all the Buildings in one location(ex search for buildings in Chicago):

        ArrayList<_13Building> buildingsInChicago = new ArrayList<>();
        for (_13Building each : buildingList) {
            if (each.location.equals("Chicago")) {
                buildingsInChicago.add(each);
            }
        }
        System.out.println("Buildings in Chicago: " + buildingsInChicago);


        System.out.println("---------");

        // Filter all the Buildings within a certain price range:

        ArrayList<_13Building> expBuildings = new ArrayList<>();
        for (_13Building each : buildingList) {
            if (each.price >= 1_000_000) {
                expBuildings.add(each);
            }
        }
        System.out.println("Buildings with a price bigger than 1_000_000: " + expBuildings);
    }
}

    /*
    // Anam Zahra's solution
    public static void main(String[] args) {
        ArrayList<_13Building> allBuildings = new ArrayList<>();
        _13Building obj1 = new _17House(5, "Pakistan", 400000);
        allBuildings.add(obj1);
        _13Building obj2 = new _17House(3,"Lahore", 50000);
        allBuildings.add(obj2);
        _13Building obj3 = new _18Apartment("Woodbridge", 10000, 6);
        allBuildings.add(obj3);
        _13Building obj4 = new _19OfficeBuilding("Chicago", 200000, 2);
        allBuildings.add(obj4);
        // - Find the most expensive Building
        _13Building expensiveBuilding = allBuildings.get(0);
        double maxPrice = allBuildings.get(0).price;
        for(_13Building each : allBuildings){
            if(each.price > maxPrice){
                maxPrice = each.price;
                expensiveBuilding = each;
            } }
        System.out.println(expensiveBuilding);
        // - Find the least expensive Buildings
        _13Building leastExpensive = allBuildings.get(0);
        double minPrice = allBuildings.get(0).price;
        for(_13Building each : allBuildings){
            if(each.price < minPrice){
                minPrice = each.price;
                leastExpensive = each;
            } }
        System.out.println(leastExpensive);
        //  - Filter all the buildings in Chicago
        ArrayList<_13Building> inChicago = new ArrayList<>(allBuildings);
        inChicago.removeIf(p -> !p.location.equalsIgnoreCase("Chicago"));
        System.out.println("In Chicago: " + inChicago);
        //  - Filter all the Buildings within a certain price range
        ArrayList<_13Building> inRange = new ArrayList<>(allBuildings);
        inRange.removeIf(p -> p.price>=50000);
        System.out.println("in range: " + inRange);
    }
     */


