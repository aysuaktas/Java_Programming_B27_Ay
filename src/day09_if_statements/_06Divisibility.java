package day09_if_statements;

public class _06Divisibility {

    public static void main(String[] args) {

        int n = 10;

        if(n % 2 == 0){
            System.out.println(n+ " is divisible by 2");
        }
        // If there is no left over when we divide a number by 2; it means number is evenly divisible by 2.

        if(n % 3 == 0){
            System.out.println(n + " is dividible by 3");
        }

        if(n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        }

        /*
        int n = 10; dersek -> It is not divisible by 3. O yuzden sadece iki statement console'da cikar;
        10 is divisible by 2
        10 is divisible by 5

        int n = 300; dersek -> 300 -> 2, 3 ve 5'e tam bolunur, console'da hepsini goruruz. (300 is divisible by 2
                           300 is dividible by 3
                           300 is divisible by 5)

        int n = 7; dersek, 7 hicbirine tam bolunmez, so console'da hicbir sey gozukmez.
         */

    }
}
