package day43_abstraction._1_cars;

public abstract class _01Car {  // abstract'i biz ekledik.


    public abstract void start();  // if you have a car, you should have a way to start. If you have a car, you should start demis olduk bu abstract start method ile -->  Nasil oldugu ise her arabada farkli. Bunun nasil farkli oldugunu da ayri class'lar acip yazacagiz. Mesela Toyota icin  "turning key to start" yazarken BMW icin " pressing button to start" yazacagiz.


}

    /* it was day42's homework, but I didn't do it:

    Create an abstract class Car
        define an abstract method start (void)

    Create a concrete class Toyota
      sub class of Car
            override the start method to print:
            turning key to start

    Create a concrete class BMW
       sub class of Car
            override the start method to print:
            pressing button to start

    Create an abstract class ElectricCar
        sub class of Car
            define an abstract method charge (void)

    Create a concrete class Tesla
        sub class of ElectricCar
            override the start method to print:
            key card near by, starting car

            override the charge method to print:
            at tesla charging station
     */





