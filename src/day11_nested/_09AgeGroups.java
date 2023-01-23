package day11_nested;

public class _09AgeGroups {

    public static void main(String[] args) {

        /*
        Age should be between 0 - 120   --> This will be our pre-condition

        < 1 baby
        2 - 5 toddler
        6 - 13 kid
        14 - 18 teenager
        19 - 40 young adult
        41 - 65 middle age adult
        > 65 senior
         */

        int age = 50;   // we declared an int variable

        if(age >= 0 && age <= 120){
            // valid ages ((age cannot be negative number))

            if(age <= 1){
                System.out.println("Baby");
            } else if(age <= 5){      //TODO:  age >= 2 && age <= 5   --> burasi otomatikman boyle zaten o yuzden >= 2 yazmaya gerek yok
                System.out.println("Toddler");
            } else if(age <= 13){
                System.out.println("Kid");
            } else if(age <= 18){
                System.out.println("Teenager");
            } else if(age <= 40){
                System.out.println("Adult");
            } else if(age <= 65) {
                System.out.println("Middle Age Adult");
            } else {
                // if I am here, the age is between 66 - 120
                System.out.println("Senior");
            }


        } else {
            // invalid ages

            if(age < 0){
                System.out.println("Ages cannot be smaller than zero");
            } else {
                System.out.println("Ages cannot be more than 120");
            }

        }


        // int age = 50; ise console'da -> Middle Age Adult
        // int age = -50; ise -> Ages cannot be smaller than zero
        // int age = 150; ise -> Ages cannot be more than 120


    }
}
