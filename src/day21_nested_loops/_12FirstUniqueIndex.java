package day21_nested_loops;

public class _12FirstUniqueIndex {

    /*
    Write a program that can return the index number of the first unique character. --> tekrar etmeyen ilk karakterin index number'i
     */

    public static void main(String[] args) {

        // Saim's solution: // TODO: ogren, iki onceki Duplicate Characters ornegine cok benziyor

        String str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(i);   // 3
                break;
            }
        }



    }
}
