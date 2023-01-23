package day08_scanner;

import java.util.Scanner;

public class _03Angles {

    /*
     Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
     Determine if the angles make a triangle, which means the angles add to 180.0
     and
     Determine if the angles make a circle, which means the angles add to 360.0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double angleOne = input.nextDouble();   // whole numbers kullanip int de yapabilirdik, fark etmez, pratik yapiyoruz.
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double sum = angleOne + angleTwo + angleThree;  //addition'i hem triangle hem circle icin ayri ayri yapmak yerine kolay olsun diye once boyle yazdik.

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("isTriangle = " + isTriangle);  //soutvv kisayolu ile hizlica yazdik bunu.
        System.out.println("isCircle = " + isCircle);

        /*
         Degerlere console'da
         100.0  -> ((double dedigimiz icin .0 seklinde yazdim))
         40.0
         40.0 yazarsak -> Triangle true cunku toplamlarinin 180 olmasi gerekiyor. Ama Circle yanlis cunku toplamlari 360 etmiyor.

         isTriangle = true
         isCircle = false diyor console'da degerlerin altinda, enter yaptigimizda.
         */


    }
}
