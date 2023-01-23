package day07_scanner;

public class _04LeapYear {

    /*
     declare and assign a year variable
     check if the year is a leap year, a year will be a leap year if it is divisible by 4
     */

    public static void main(String[] args) {

        int year = 2022;
        boolean isLeapYear = year % 4 == 0;  // Rational operators icin boolean kullaniyoruz // 0 (zero) means no leftover. 4'e bolunce kalan yoksa true. Leftover'im varsa it will be false.

        System.out.println("isLeapYear = " + isLeapYear);

    }
}
