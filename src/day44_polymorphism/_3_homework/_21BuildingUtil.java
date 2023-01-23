package day44_polymorphism._3_homework;

public class _21BuildingUtil {

    /*

With Method:

    create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000

    create a static method search(String location)
        return: Building
        parameters: String location

        implementation
            if the location is Great Falls return a House object with:
                location: Great Falls
                price: 500_000
                number of residents: 4

            if the location is FairFax return a Apartment object with:
                location: FairFax
                price: 250_000
                month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
                location: McLean
                price: 2_000_000
                number of floors: 6

    Run the methods in a main method to test them out
     */

    // Nazerke's solution uzerinden yaptim:

    // instanceof keyword is used to check if the object is certain class (returns boolean):
    public static double rent(_13Building obj){
        if(obj instanceof _17House){
            return 1500.0;
        } else if(obj instanceof _18Apartment){
            return 800.0;
        } else if(obj instanceof _19OfficeBuilding){
            return 2000.0;
        }
        return 0.0;
    }

    public static _13Building search(String location){
        if(location.equalsIgnoreCase("great falls")){
            return new _17House("Great Falls", 500_000, 4);
        } else if(location.equalsIgnoreCase("fairfax")){
            return new _18Apartment("FairFax", 250_000, 6);
        } else if(location.equalsIgnoreCase("mclean")){
            return new _19OfficeBuilding("McLean", 2_000_000, 6);
        }
        return null;
    }

}

// bundaki rent methodunu _20Polymorphism class'inda kullandi
// search methodunu kullanmadi ?
