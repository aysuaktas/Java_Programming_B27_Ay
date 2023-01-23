package day04_variables;

public class _05CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";  // S for String will be always uppercase.
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("Phone information:\nBrand: " + brand);
        System.out.println(model + " in " + color);
        System.out.println("With " + size + "gb the price is $" + price);
        System.out.println("sim type: " + sim + " and has a camera: " + hasCamera);  // it is not reusable

        System.out.println(); // empty print statement

        // alternative solution:

        String report = "\tPhone information:\nBrand: " + brand +
                "\n" + model + " in " + color +
                "\nWith " + size + "gb the price is $" + price +
                "\nsim type: " + sim + " and has a camera: " + hasCamera;
        System.out.println(report);  // it is reusable -> (( because we declared and assigned it to a String report variable ))

    }
}
