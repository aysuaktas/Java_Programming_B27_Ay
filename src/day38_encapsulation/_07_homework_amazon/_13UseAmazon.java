package day38_encapsulation._07_homework_amazon;

public class _13UseAmazon {

    /* Homework - continue:
    Create a class UseAmazon
         create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */

    public static void main(String[] args) {

        _12AmazonAccount amazon1 = new _12AmazonAccount("Aysu", "aysu@gmail.com", false);

       // amazon1.username;  // I cannot use these kinds of ways because these variables on the _12AmazonAccount class were private, so I cannot access them directly. I need to use Getters & setters to be able to access them indirectly.

 //     amazon1.getUsername();  // I need to write this inside the print statement to be able to print it
        System.out.println(amazon1.getUsername());  // Aysu

        System.out.println(amazon1.getEmail());  // aysu@gmail.com
        System.out.println(amazon1.getHasPrime());  // false

        // to print toString() method:
        System.out.println(amazon1);  // AmazonAccount{username='Aysu', email='aysu@gmail.com', hasPrime=false}

    }
}
