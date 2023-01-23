package replit_aysu._0_Basics;

public class _08_PlaneTicket {

    /*
    Given two cities, miles between the cities, and a base ticket price, and rate calculate the ticket price.
    Formula for price: base price + miles between cities / rate
    Display the details in the following format:
    The ticket price from Chicago to Virginia is $dollarAmount
     */

    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;

        //WRITE YOUR CODE BELOW:

        double price = basePrice + milesBetweenCities / rate;

        System.out.println("The ticket price from " + cityOne + " to " + cityTwo + " is " + "$" + price );

    }
}

