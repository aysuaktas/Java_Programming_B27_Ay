package day20_loops;

import java.util.Scanner;

public class _02CamelCase {

    /* Homework of yesterday, I did not do this.

    Camel Case  -------->>>>>>>>>> This is an interview question of someone.

    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

    Ex:
	    Today is SUNDAY

	Output:
        todayIsSunday

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str = input.nextLine().toLowerCase();   //  Today is SUNDAY gibi uppercase de yazabilirler. Case sensitivity'i kaldirmak icin lowerCase method da ekledik.

        String camelCase = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ' '){

                camelCase += str.substring(i+1, i+2).toUpperCase();  // gives the one character after the space. --> Space sonrasindakinden basliyor ve sadece onu aliyor, cunku ikinci sirada yazilan i+2 dahil edilmiyor substring method'a gore. toUpperCase method ile sadece o karakteri uppercase yapmis oluyoruz, cunku kalanini onceden lowercase olsun diye method ile belirtmistik zaten.
                // str.charAt(i + 1).toUpperCase;   // mesela Today is SUNDAY icin ilk space -> index number is 5. Ondan bir sonrakinin index number'i icin +1 yapariz. O nedenle i + 1 yaptik
                i++;     // bunu yazmazsam -> console'a TOday IS sUnDay yazinca todayIisSsunday seklinde ikinci ve ucuncu kelimelerin ilk harfini cift yaziyor

            } else {
                camelCase += str.charAt(i);
            }
        }

        System.out.println(camelCase);



        /*
        Ex:
	    TOday IS sUnDay   --> console'a yazarsam;
        todayIsSunday     --> output

         */


    }
}
