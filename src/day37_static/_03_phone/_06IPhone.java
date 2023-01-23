package day37_static._03_phone;

public class _06IPhone {

    // instance variables:
    String model;
    String color;
    double price;
    int storage;
    // Bunlar instance variables'ti --> bunlar unique, her iPhone'da farkli. Ama tum Iphone'larda ortak olan seyler de var, mesela brand. Onlar da static ile yazilir:

    // static variables
    static String os;
    static String brand;


    // static block ((is a block of code)) used to initialize static variables:
    static{
        System.out.println("STATIC BLOCK RUN");  // bunu bizim gormemiz icin ekledik
        os = "IOS";
        brand = "Apple";
    }  // this static block will only run one time, in the beginning.


    // How do I assign instance variables to an object? I need constructor. One constructor that initializes all 4 instance variables yapabilirim:

    public _06IPhone(String model, String color, double price, int storage){
        System.out.println("CONSTRUCTOR RUN");  // bunu bizim gormemiz icin ekledik
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }


    /* Difference between static block & constructor

        - static block will run once, the first time the class is used
            -> we can write any code we want (( loop, if statements, etc ))

        - constructor will be called every time an object is made

     */

    @Override
    public String toString() {
        return "_06IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }

    // right click -> generate -> toString() yaptigimizda:
    // toString() method --> by default, this is an instance method, so it was only printed the instance variables.


}
