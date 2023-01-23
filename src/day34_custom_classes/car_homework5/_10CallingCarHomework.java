package day34_custom_classes.car_homework5;

public class _10CallingCarHomework {

    public static void main(String[] args) {

        _09CarHomework car1 = new _09CarHomework();
        car1.model = "BMW";
        car1.year = 2021;
        car1.color = "White";
        car1.fuelLevel = 20;

        car1.drive();
        car1.fillTank();
        // car1.isLow();
        System.out.println("Gas is low: " + car1.isLow());
        System.out.println(car1);  /* Driving BMW!     ((--> driving olunca fuel'den -5 cikarmistik;;;))
                                    Your fuel level is 15. Your car needs refill 85%. Filling the tank!
                                    Gas is low: true
                                    _09CarHomework{model='BMW', color='White', year=2021, fuelLevel=15}
                                    */

        System.out.println("-----------------------");

        _09CarHomework car2 = new _09CarHomework();
        car2.model = "Volvo";
        car2.year = 2022;
        car2.color = "Black";
        car2.fuelLevel = 83;

        car2.drive();
        car2.fillTank();
        // car2.isLow();
        System.out.println("Gas is low: " + car2.isLow());
        System.out.println(car2);  /* Driving Volvo!
                                    Your fuel level is 78. Your car needs refill 22%. Filling the tank!
                                    Gas is low: false
                                    _09CarHomework{model='Volvo', color='Black', year=2022, fuelLevel=78}
                                    */







    }
}
