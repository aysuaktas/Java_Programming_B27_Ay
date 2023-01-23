package day20_loops;

public class _08SyllablesHomework {

    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
     */

    public static void main(String[] args) {

        // Saim's solution:

        String s = "ja-va";
        int count = 1; // the number of syllabus would be equal to the number of - characters plus one because the - are used to separate two syllabus  --> syllable means "hece" in Turkish

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                count++;
            }
        }
        System.out.println(count);   // 2


        // Zeynep's solution:

        String word = "cal-cu-late";
        int syllables = 1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                syllables++;
            }
        }
        System.out.println(syllables);   // 3


    }
}
