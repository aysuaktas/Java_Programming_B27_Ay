package day09_if_statements;

public class _05Letters {

    public static void main(String[] args) {

        char letter = 'B';  // letter: 'B' = Ascii value of 66 )

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is an uppercase letter");
        }
        // because there is number related to it. ASCII number

        /*
        Ascii number for A (uppercase) = 65
        Ascii number for Z (uppercase) = 90
        Yani,
        if(letter >= 65 && letter <= 90){
        System.out.println(letter + " is an uppercase letter");
        }
         */

        if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is an lowercase letter");
        }

        /*
        Ascii number for a (lowercase) = 97
        Ascii number for z (lowercase) = 122
        Yani,
        if(letter >= 97 && letter <= 122){
        System.out.println(letter + " is an lowercase letter");
        }
         */

        // char letter = 'Z'; demistik -> run edince console'da -> Z is an uppercase letter cikti.Onu char letter = 'c'; olarak degistirince -> c is an lowercase letter cikti, gibi. char letter = 'B'; yazinca letter: 'B' = Ascii value of 66. Console'da yazan ---> B is an uppercase letter. ----> Iki tane if statement yazdik. Z,c,B gibi her char value yazdigimizda bu iki statement'ten biri true, digeri false oluyor. Console false olan single if statement'i yazmadigi icin direkt true sonucu goruyoruz.

    }
}
