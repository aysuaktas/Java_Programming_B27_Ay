package day04_variables;

public class _03CharExample {
    public static void main(String[] args) {

        char upper = 'P';
        char lower = 'e';
        char space = ' ';
        char number = '3';
        char special = '#'; // special characters (like #) also can be used like that.

        System.out.println("upper = " + upper);    // upper = P
        System.out.println("lower = " + lower);
        System.out.println("space = " + space);
        System.out.println("number = " + number);
        System.out.println("special = " + special);

        System.out.println();  // print statement for empty line

        char first = 65;
        System.out.println(first);   // A
        char second = 66;
        System.out.println(second);   // B
        char firstLower = 97;
        System.out.println(firstLower); // a ===> // todo ===> Char holds only a single character ((inside the single quotation)) but these are two digits. But also every character has a number related to it. For ex: 65 is used for A (in ASCII). // todo

    }
}
