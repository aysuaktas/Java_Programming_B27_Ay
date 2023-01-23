package day21_nested_loops;

public class _06FrequencyOfCharacters {

    public static void main(String[] args) {

        // Real interview question -> frequency of characters

        /*
        given a String determine how many times a character is in the String

        java
        j - 1 (1 time)
        a - 2 (a is two times)
        v - 1 (one time)

        j
          j == j mi? yes
          j == a    -no
          j == v    -no
          j == a    -no   --> so, j is used one time, gibi bakiyor tek tek

        a
          a == j
          a == a
          a == v
          a == a   --> so, a is used two times, ...
         */

        String str = "java";
        String checked = "";

        for(int i = 0; i < str.length(); i++){ // purpose of outer loop: iterating one character at a time --> using charAt(i);

            int count = 0; // the counter should reset back to 0 for each (every) character

            if(!checked.contains("" + str.charAt(i))) {  // only run the counting and inner loop if the character has not already been checked
                for (int j = 0; j < str.length(); j++) {  // inner loop: compares the character we are looking at [(i) --> outer loop'taki i] with each other character in the String --> str.charAt(j)

                    if (str.charAt(i) == str.charAt(j)) {    // to compare, we need to use charAt()
                        count++;
                    }
                }  // end of inner loop

                System.out.println(str.charAt(i) + " - " + count);

        /* "checked" ile ilgili kisimlari yazmadan print edince a'yi 2 kere belirtti:
            j - 1
            a - 2
            v - 1
            a - 2 -> o yuzden checked kismini ekledik
         */

                checked += str.charAt(i); // adds to the checked String

            /* checked kismini da yazinca; tekrara dusmedik a-2 deyip
            j - 1
            a - 2
            v - 1
             */

            } // if statement ends

        }  // end of outer loop


    }  // end of main method
}

/* Second way -> doing it with 'continue' method: ((bu task icin cok kullanisli degilmis))
     String str = "java";
        String checked = "";

        for(int i = 0; i < str.length(); i++){   // outer loop

            int count = 0; // the counter should reset back to 0 for every character

            if(checked.contains("" + str.charAt(i))){
                continue;   // it means skip this part and continue. Yani I already counted ise devam et dedik ki console'da j - 1   a - 2   v - 1   a - 2 diye a-2yi iki kez yazmasin.
            }

            for(int j = 0; j < str.length(); j++){    // inner loop

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }

            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);

    */
