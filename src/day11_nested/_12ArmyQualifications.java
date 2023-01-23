package day11_nested;

public class _12ArmyQualifications {

    public static void main(String[] args) {

        /*
        our requirements: // hepsi true olmali army'e katilabilmek icin
        ages: 18 - 35
        high school diploma
        citizen
         */

        /*
        In our program, we check if you are eligible and show the message if you are. But then, if you are not eligible, we go through 3 if statements so check the reasons why. They are separate if statements that check about the age, the diploma, and citizenship
         */

        int age = 20;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if((age >= 18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You are qualified for the Army");
        } else {    // eligible degilsen -> nedenini de bilmek istiyoruz -> multiple condition;

            // multi-branch is to give information about the age;
            if(age < 0 || age > 120 ){   // checks for valid age numbers first
                System.out.println("Not a valid age");
            } else if (age < 18){
                System.out.println("You are too young, need to be at least 18");
            } else if (age > 35) {
                System.out.println("You are too old, limit is 35 years old");
            }

            // if to check about diploma;

            if(!hasDiploma){     // !hasDiploma means do not have diploma. if(hasDiploma == false); seklinde de olabilirdi // If you don't have it, then;
                System.out.println("You need at least a high school diploma");
            }

            // if to check about citizenship
            if(!isCitizen){
                System.out.println("You need to be a citizen to apply");
            }

        }    // this is the end of the 'else' (in 24th line) for qualifying


        /*
        int age = 19;
        boolean hasDiploma = true;
        boolean isCitizen = true; ise --> You are qualified for the Army

        int age = 17; olup digerleri true ise --> You are too young, need to be at least 18

        int age = 17 olup digerleri false ise --> You are too young, need to be at least 18
                                                  You need at least a high school diploma
                                                  You need to be a citizen to apply
         */


    }      // end of the main method
}       // end of the (public) class
