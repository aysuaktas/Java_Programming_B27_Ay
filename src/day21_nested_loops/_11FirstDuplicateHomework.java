package day21_nested_loops;

public class _11FirstDuplicateHomework {

    /*
    Write a program that can return the first duplicated character from a string --> String'de ilk tekrar edeni karakteri bul.
     */

    public static void main(String[] args) {

        // Saim's solution:  // TODO: ogren, bir onceki Duplicate Characters ornegine cok benziyor

        String str = "ABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
                System.out.print(str.charAt(i));
                break;
            }
        }



    }
}
