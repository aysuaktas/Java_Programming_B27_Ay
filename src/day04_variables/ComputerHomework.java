package day04_variables;

public class ComputerHomework {

    /*
    declare and assign these variables with the most appropriate data types:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative
     */

    public static void main(String[] args) {

        String brand = "Apple";
        String processor = "Intel Core i7";
        String ramMemory = "8 GB RAM";
        String storageMemory = "256GB";
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        double price = 1299.0;
        int numberOfUsbSlots = 4;
        boolean hasBluetooth = true;

        System.out.println(brand + " has " + processor + " processor and " + ramMemory + ".");

        System.out.println("It has " + storageMemory + " storage memory" + ", has monitor " +  hasMonitor + ", and has wifi card "+ hasWifiCard + ".");

        System.out.println("Its price is " + price + " . It has " + numberOfUsbSlots + " USB slots. " + "It has Bluetooth " + hasBluetooth + ".");



    }

}
