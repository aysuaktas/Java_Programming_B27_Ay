package day11_nested;

import java.util.Scanner;

public class _04PandemicChecker {
    /*
    Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.

    Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What year would like to check?");
        int year = input.nextInt();

        if (year >= 1346 && year <= 1353) {    // todo: range kullanirken && kullaniriz cunku && kullaninca ikisinin de dogru olmasi gerekiyor
            System.out.println("The Black Death");
        } else if (year == 1665 || year == 1666) {      // bir yil surdugu icin boyle yazabiliriz
            System.out.println("Great Plague of London");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println("Russian plague");
        } else if (year >= 1889 && year <= 1890){
            System.out.println("Flu pandemic");
        } else if (year == 1916) {
            System.out.println("American polio epidemic");
        } else if (year >= 1918 && year <= 1920){
            System.out.println("Spanish flu");
        } else if (year >= 2009 && year <= 2010){
            System.out.println("H1N1 Swine Flu pandemic");
        } else if (year >= 2014 && year <= 2016){
            System.out.println("West African Ebola epidemic");
        } else if (year >= 2020 && year <= 2021){
            System.out.println("COVID-19");
        } else {       // any year not in those ranges
            System.out.println("No Pandemic");
        }


    }
}
