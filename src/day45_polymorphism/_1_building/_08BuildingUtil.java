package day45_polymorphism._1_building;

public class _08BuildingUtil {


    public static void main(String[] args) {

        _05House house1 = new _05House("Paris", 100_000_000, 10);

        _01Building house2 = new _05House("New York", 2_000_000, 4);

        _04HasBackyard house3 = new _05House("Seattle", 3_000_000, 5);

//      house3.pay();  --> invalid because the _04HasBackyard reference does not have visibility to this method

        house3.mowLawn();  // Mowing the lawn in the backyard

        System.out.println(rent(house1));  // 1500.0
        System.out.println(rent(new _07OfficeBuilding("Texas", 1230000, 4)));   //2000.0
        System.out.println(rent(new _06Apartment("Nevada", 1230002, 4)));  // 800.0

        System.out.println(search("Fairfax"));  // Location: Fairfax, price: 250000.0 Months of lease: 6
        System.out.println(search("McLean"));  // null --> kucuk l ile yazmadigim icin bunu bulamadi case sensitivity'den, o nedenle null verdi

    } // main method ends here

        public static double rent(_01Building building){
            if (building instanceof _05House){
                return 1500;
            }else if (building instanceof _06Apartment){
                return 800;
            }else if (building instanceof _07OfficeBuilding){
                return 2000;
            }else {
                return -1;
            }
        }

        public static _01Building search(String location){
        if(location.equals("Great Falls")){
            return new _05House("Great Falls", 500_000, 4);
        } else if(location.equals("Fairfax")){
            return new _06Apartment("Fairfax", 250_000, 6);
        } else if (location.equals("Mclean")){
            return new _07OfficeBuilding("McLean", 2_000_000, 6);
            }
                return null;

        }
}

    /*
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
