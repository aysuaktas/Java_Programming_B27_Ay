package day15_string;

import java.util.Scanner;

public class _06TitleHomework {
    /*
    ask the user to enter their name including titles
    use the following titles to determine how to refer to the person

    handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

    Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

    Note: It is possible to have both beginning and ending titles, one of them, or none of them
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name including titles");
        String name = input.nextLine();

        String title1 = "Mr";
        String title2 = "Mister";
        String title3 = "Ms";
        String title4 = "Miss";
        String title5 = "Madam";
        String title6 = "Dr";
        String title7 = "Sr";
        String title8 = "Jr";

        if(name.contains("Mr") || name.contains("Mister")){
            name.equalsIgnoreCase("Mr");
            name.equalsIgnoreCase("Mister");
            System.out.println("Hello Sir");
        } else if (name.contains("Ms") || name.contains("Miss") || name.contains("Madam")){
            name.equalsIgnoreCase("Ms");
            name.equalsIgnoreCase("Miss");
            name.equalsIgnoreCase("Madam");
            System.out.println("Hello Ma'am");
        } else if (name.contains("Dr")){
            name.equalsIgnoreCase("Dr");
            System.out.println("Hello Doctor");
        }

        if (name.contains("Sr")){
            name.equalsIgnoreCase("Sr");
            System.out.println("Nice to meet you Senior");
        } else if (name.contains("Jr")){
            name.equalsIgnoreCase("Jr");
            System.out.println("Nice to meet you Junior");
        }

        // TODO: case sensitivity olmuyor, baska yol bul - Saim day16 package'inda cozdu bunu


        /*
        if(!(name.contains("Mr")) || !(name.contains("Mister")) || !(name.contains("Ms")) || !(name.contains("Miss")) || !(name.contains("Madam")) || !(name.contains("Dr")) || !(name.contains("Sr")) || !(name.contains("Jr"))){
            System.out.println("");
        }
        */




    }
}
