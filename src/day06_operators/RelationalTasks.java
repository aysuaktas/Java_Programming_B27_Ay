package day06_operators;

public class RelationalTasks {

    /*
    declare a speed variable ((how fast the driving))
    speed limit is 50
    find out if you are speeding
    true/false
     */

    public static void main(String[] args) {

        int speed = 40;
        boolean isSpeed = speed > 50;  // speed limit == 50. Bundan buyukse speeding
        System.out.println("isSpeed = " + isSpeed );  // my solution

        System.out.println("------------------");

        int currentSpeed = 60;
        int speedLimit = 50;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Is speeding: " + isSpeeding);   // Saim'in solution



      /*
      declare a number variable
      find out if the number is positive, negative or zero
       */

        System.out.println("------------------");

        int numberExample = 4;
        boolean isPositive = numberExample > 0;
        System.out.println("isPositive = " + isPositive);  // my solution  ((sadece number positive mi kismini yaptim bunda))

        System.out.println("------------------");

        int number = -4;
       // boolean isPositive = number > 0;   // benim ustteki cozumde de aynisi vardi diye bunda comment olarak biraktim
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
       // System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);     // Saim'in solution

        /*
        define a number
        find out if it is even or odd
         */

        System.out.println("------------------");

        int num = 20;
        boolean isEven = num % 2 == 0;  // Number'i 2'ye bolunce no left over -> it is an even number (cift sayi)
        boolean isOdd = num % 2 != 0;  // num % 2 == 1  // isEven != true // odd number (tek sayi)  // todo : practice

        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);

    }
}
