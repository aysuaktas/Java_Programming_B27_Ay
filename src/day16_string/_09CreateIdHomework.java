package day16_string;

public class _09CreateIdHomework {

    /*
    Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
     */

    public static void main(String[] args) {

    String firstName = "john";
    String lastName = "smith";

        String firstNameFirst = firstName.substring(0,1).toLowerCase();
        String lastNameThreeLetters = lastName.substring(0,1).toUpperCase() + lastName.substring(1,3).toLowerCase();
        int firstNameLength = firstName.length() * 2;

       // firstNameLength *= 2; -> usttekinde *2siz halini yapip bunda boyle de yazabilirdim

        System.out.println("" + firstNameFirst + lastNameThreeLetters + firstNameLength);


    }
}
