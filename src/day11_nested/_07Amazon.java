package day11_nested;

public class _07Amazon {

    public static void main(String[] args) {

        double price = 100.99;
        boolean isPrime = false;

        if(isPrime){
            System.out.println("Free 2 day shipping");
        } else {
            // you don't have prime // else if ile de yapabilirdik ama o zaman boolean condition gerekiyordu; else yazdigimiz icin boolean condition'i belirtmedik

            if(price >= 25){
                System.out.println("Free shipping available");
            } else {
                System.out.println("Shipping cost is $2.99");
            }
        }

        /*
        Nested if statements --->  If statement inside of if statements
        --------------------------------------------------
        double price = 10.99;
        boolean isPrime = true; ise console'da
        Free 2 day shipping

        double price = 10.99;
        boolean isPrime = false; ise console'da
        Shipping cost is $2.99

        double price = 100.99;
        boolean isPrime = false; ise console'da
        Free shipping available

        --------------------------------------------------
        If the boolean isPrime is true, the if blocks runs.
        If the boolean isPrime is false, the else block, which has an if statement that if condition, is checked
            price >= 25: free shipping
            false: pay for shipping
        --------------------------------------------------
         */


    }
}
