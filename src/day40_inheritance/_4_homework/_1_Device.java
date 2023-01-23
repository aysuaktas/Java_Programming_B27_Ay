package day40_inheritance._4_homework;

public class _1_Device {

    public static class Device {

        /*
        Inheritance Practice
    ---------------------
    Create a class called device:
    - attributes: brand, model, price, wireless
    - methods: toString(), useDevice()

    ----------
    Create a class called TV:
    - attributes: brand, model, price, wireless
    - methods: toString(),
        useDevice(): Override to print Using TV

    Create a class called Phone:
    - attributes: brand, model, price, wireless
    - methods: toString(),
        useDevice(): Override to print Using Phone

    Create a class UseDevice

        create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

        List the is a relations of all the classes
         */


        // Bu odevleri kizlarla baktiktan sonra yaptim/k.
        // this is parent class.


        String brand;
        String model;
        double price;
        boolean hasWifi;


        public String useDevice(){
            return null;   // her device icin farkli olacagi icin buraya default olarak null yazdim ama bir String de yazabilirdik mesela return "using: "; de yapabilirdik ve concatenate yapardik her biri icin kendileriyle ilgili class'ta gidip tv veya phone falan ekleyip
        }

        //constructor:
        public Device(String brand, String model, double price, boolean hasWifi){
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.hasWifi = hasWifi;
        }


        @Override
        public String toString() {
            return "Device{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    ", hasWifi=" + hasWifi +
                    '}';
        }

        /*
        Bu toString methodu Generate uzerinden otomatik olusturdum, kendimiz de yazabiliriz. Mesela Merve'nin gibi kendimiz de yazabiliriz, mesela Merveninki:
        return "Device Information: \nBrand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nWifi: " + (hasWifi ? "has wifi" : "has not wifi");
         */

    }

    public static class Phone extends Device {

        /*
        Create a class called Phone:
    - attributes: brand, model, price, wireless
    - methods: toString(),
        useDevice(): Override to print Using Phone
         */

        public Phone(String brand, String model, double price, boolean hasWifi){
            super(brand, model, price, hasWifi);
        }

        @Override
        public String useDevice(){
            return "Using Phone";
        }
    }

    public static class Tv extends Device {   // extends Device yaptik, bu TV class'i artik child class

        /*
        Create a class called TV:
    - attributes: brand, model, price, wireless
    - methods: toString(),
        useDevice(): Override to print Using TV
         */

        public Tv(String brand, String model, double price, boolean hasWifi){
            super(brand, model, price, hasWifi);
        }

        public String toString(){
            return super.toString();  // buna parent class'ta olmayan tv'ye ozel bir sey eklemek icin concatenation yapmadigimiz surece gerek yok, pratik olsun diye yazalim dedik
        }

        @Override
        public String useDevice(){
            return "Using Tv";
        }
    }

    public static class UseDevice {

        /*
        Create a class UseDevice

        create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

        List the is a relations of all the classes
         */

        public static void main(String[] args) {

            Tv obj1 = new Tv("Samsung", "Q70", 1800.9, false); // sirasiyla brand, model, price, hasWifi icin

            System.out.println(obj1.useDevice());  //  Using Tv
            System.out.println(obj1);  // Device{brand='Samsung', model='Q70', price=1800.9, hasWifi=false}

            System.out.println("=====================");

            Phone obj2 = new Phone("Xiaomi", "mi5", 680, true);

            System.out.println(obj2.useDevice());  // Using Phone
            System.out.println(obj2);  // Device{brand='Xiaomi', model='mi5', price=680.0, hasWifi=true}
        }
    }
}
