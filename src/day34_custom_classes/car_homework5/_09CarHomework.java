package day34_custom_classes.car_homework5;

public class _09CarHomework {

    /*
    Create a class Car
        create instance variables:
             model, year, color, fuel level (percent number)

        create instance methods:

             - toString(): [return String]
               returns all the information of the Car objects

             - drive(): [void]
               prints: driving $model
               subtract 5 from the fuel amount

            - fillTank(): [void]
              prints: filling tank
              fuel level will be maxed at 100

            - isLow() [boolean]
              create a method that will check if the gas level is low.
              return true is the gas level is below 25
              otherwise return false

    Create a separate class to create Car objects and test the methods created
     */

    String model;
    int year;
    String color;   // String model, color; seklinde de yazabilirdim bunlari mesela
    int fuelLevel;

    public void drive() {
        System.out.println("Driving " + model + "!");  // !'i console'da guzel gozuksun diye koydum
        fuelLevel = fuelLevel - 5;  // fuelLevel -= 5; de yazilabilirdi
    }

    public void fillTank() {
        System.out.println("Your fuel level is "  + fuelLevel + ". Your car needs refill " + (100 - fuelLevel) + "%. Filling the tank!");  // // fuel level will be maxed at 100 oldugu icin 100'den cikardim
    }

    public boolean isLow() {  // TODO: boolean'li return'lu bu kismi ben yapmadim, ogren
        if (fuelLevel < 25) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "_09CarHomework{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
