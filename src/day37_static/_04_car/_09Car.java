package day37_static._04_car;

import java.util.Scanner;

public class _09Car {

    String model;
    _08Driver driver; // her arabanin surucusu var.

   // Scanner input;  // ornek olarak vermis bunu


    // let's make the constructor for the car class
    // when I call the Car constructor, the code inside is calling the Driver constructor:
    public _09Car(String model, String name, long licenceNumber, char licenceType){
        this.model = model;
        // I don't have any object yet, I just have reference, it's still null as default.
        driver = new _08Driver(name, licenceNumber, licenceType);  // creating a Driver object -->I assigned this constructor to the driver
       // input = new Scanner(System.in);
    }


    public _09Car(String model, _08Driver driver){  // Kizlarin aciklamasi: ustteki ile ayni isim ama baska variable'lar var constructor'da -> constructor overloading
        this.model = model;  // Kizlarin aciklamasi: constructor overloading oldugu icin yine boyle yazdik parantezli degil. Yani ustte de this.model = model; var ama o baska
        this.driver = driver;
    }
}
