package day21_nested_loops;

public class _08UniqueCharacter {

    public static void main(String[] args) {

        /*

        java

        given a String find the print all the unique characters

        unique character: only appears in the String once

        output:
            jv

         */

        // Third example will be the answer of this question.


        // First example -> not the answer is the question:
        String str = "java";

        for(int i = 0; i < str.length(); i++){  // outer loop

            for(int j = 0; j < str.length(); j++){  // inner loop
                System.out.println(str.charAt(i) + " -> " + str.charAt(j));
            } // end of inner loop
           System.out.println();  // her iteration'da arada bosluk kalmis oldu bu sayede. Yoksa alt alta bosluksuz yazmis olacaktik

        } // end of outer loop



            // In this example, i is the variable of outer loop
            // j is a different variable. j is the variable of inner loop


        System.out.println("----------------------");


        // Another example
        String str2 = "java";

        for(int i = 0; i < str2.length(); i++){  // outer loop
            System.out.print(str2.charAt(i) + " = "); // each character at a time yazabildik bu sayede. yani alt alta j =  /    a =     /  v =       / a =    yazmis olduk
            for(int j = 0; j < str2.length(); j++){  // inner loop
                System.out.print("-" + str2.charAt(j));
            } // end of inner loop
            System.out.println();  // her iteration'da arada bosluk kalmis oldu bu sayede. Yoksa yan yana bosluksuz yazmis olacaktik

        } // end of outer loop


        System.out.println("---------------------");


        // Third example - answer of the question;

        String str3 = "java";

        for(int i = 0; i < str3.length(); i++){  // outer loop

            int count = 0;

            for(int j = 0; j < str3.length(); j++){  // inner loop
               if(str3.charAt(i) == str3.charAt(j)){
                   count++;
               }
            } // end of inner loop

            if(count ==1){ // if the counter is 1, the character was only found one time, the character only matched itself
                System.out.println(str3.charAt(i));
            }

        } // end of outer loop

        /* boyle yazinca console'da
        j
        v
        yaziyor
         */



    }
}
