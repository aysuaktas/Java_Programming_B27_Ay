package day17_string_loops;

public class _06PrintLetters {

    public static void main(String[] args) {

        char first = 'A';

        while (first <= 'Z'){
            System.out.print(first++);  // birer arttiratak loop tamamlanana kadar yazdirmak icin // bunu println olarak yazinca alt alta A'dan Z'ye harfleri yazdi. print() method ile yapinca A'dan Z'ya kadar yan yana yaziyor: ABCDEFGHIJKLMNOPQRSTUWXYZ
        }

        /*
        iteration 1:
            first = 'A'
                'A' < 'Z' true
                loops runs
                prints(first) -> A
                then increments because of post increment
                first++ -> B

          iteration 2:
             first = 'B'
                'B' < 'Z' true
                 loop runs
                 prints(first) -> B
                 first++ -> C

         */

        System.out.println(); // empty print statement --> iki ornegi ayirmak icin

        // printing z - a
        char backwards = 'z';
        while(backwards >= 'a'){
            System.out.print(backwards--);  // birer azaltarak loop tamamlanana kadar yazdirmak icin // zyxwvutsrqponmlkjihgfedcba -> print method kullandigimiz icin yan yana yazdi, println kullansak alt alta yazardi
        }



    }
}
