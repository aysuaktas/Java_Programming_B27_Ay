package day04_variables;

public class _01Recap {
    public static void main(String[] args) {

        // declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDay;

        // assigning value to variables
        temperature = 74.2;  // it is a floating number
        numberOfJavaDays = 4;
        numberOfSoftSkillsDay = 2;

        System.out.println("temperature = " + temperature + " Celcius");  // soutv yapip temperature'i sectik. Sonra da derece isareti vs koyabiliyoruz -> + " Celcius" ekledik.
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDay = " + numberOfSoftSkillsDay);

        // declare and assign at the same time
        int numberOfCoffeeCups = 2;
        float ratingOfMovie = 8.9F;  // if we write 8.9, compiler takes 8.9 as double type as default type. So, we need to add F to the end to make it the float type
        long waterInOcean = 200_000_000_000_000L; // compiler takes 200000000000000 as int type by default, but this number is too big for int, so doesn't compile, we need to add L to make it a long type. Moreover, to make it more readable, we can add underscore (_).

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " liters "); // soutv yapip waterInOcean'i sectik. Sonra da + " liters " ekledik.

    }
}
