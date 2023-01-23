package day03_variables;

public class OlympicsHomework {

    /*
    declare and assign all these variables:
    years: starting at 2022

    use the following data to print this message for the coming years of the Olympics. Reassign the year variable each time

        years - location
        2022 - China
        2024 - France
        2026 - Italy

    message: The Olympics will be in these locations for the coming years: $years

     */

    public static void main(String[] args) {

        int year = 2022;
        System.out.println("The Olympics will be in China for the " + year);

        year = 2024; // we reassigned the year variable
        System.out.println("The Olympics will be in France for the " + year);

        year = 2026;
        System.out.println("The Olympics will be in Italy for the " + year);

    }

}
