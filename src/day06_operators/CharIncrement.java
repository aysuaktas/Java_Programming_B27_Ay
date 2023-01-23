package day06_operators;

public class CharIncrement {

    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++); // A
        // System.out.println(letter); // diye tekrar yazdirsak B olurdu.

        System.out.println(letter++); // B
        System.out.println(letter++); // C
        System.out.println(letter++); // D
        System.out.println(letter++); // E
        // System.out.println(letter); // diye tekrar yazdirsak usttekinden dolayi F olurdu

        char letter2 = 'a';
        System.out.println(++letter2); // This is pre-increment. So the 1 is added first (immediately), then the expression finishes
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);

        char digits = '9'; // this is  the character 9, the digit, not the number 9
        System.out.println(digits--); // 9 // This is post-decrement. Pre-decrement olsaydi bu ilk value 8 ile baslardi, sonraki print statement'lerde 7,6,5 diye devam ederdi.
        System.out.println(digits--); // 8  // post-increment degil post-decrement oldugu icin 9, 10 diye degil; 9, 8 diye devam ediyor
        System.out.println(digits--);   // 7
        System.out.println(digits--);   // 6
        System.out.println(digits);     // 5  // this is printing the character

        System.out.println((int)digits);   // 53  // cast the character to an int, which mean that is prints the ascii number for that character


        System.out.println(65);   // 65
        System.out.println((char)65);   // A   // All characters has a number related to them. So, 65 (as a number) has "A" character. // This is casting int 65 to char, it will print the character that has ascii number 65

    }
}
