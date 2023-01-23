package day18_loops;

public class _09FizzBuzzHomework {

    /*
    write a program that will check all the numbers from 1 - to 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
    1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
    2.  For numbers which are divisible by 5, print "Buzz" instead of the number
    3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number
     */

    public static void main(String[] args) {

        // Ben yapmadim. Merve'nin cozumu;

        int number = 1;
        int lastNumber = 50;

        while(number++ < lastNumber) {
            if (number % 15 == 0) {   // it also means that if(number % 3 == 0 && number % 5 == 0); //once bunu yazdik cunku bunu alta yazsak digerleri ustte olsa usttekini execute edip dogruysa alta gecip buna bakmayacakti. Ama hem 3e hem 5e bolunebilir, o yuzden ilk bu
                System.out.println("FizzBuzz " + number);
            } else if (number % 3 == 0){
                System.out.println("Fizz " + number);
            } else if (number % 5 == 0){
                System.out.println("Buzz " + number);
            }

        }






    }
}
