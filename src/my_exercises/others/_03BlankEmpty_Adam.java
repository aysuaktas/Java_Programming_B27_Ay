package my_exercises.others;

public class _03BlankEmpty_Adam {

    /*
    Adam gondermis bunu
     */

    public static void main(String[] args) {

        String empty = "     "; // we have spaces
        String blank = "";

        System.out.println(empty.isEmpty()); // false

        System.out.println(empty.isBlank()); // true

        System.out.println(blank.isBlank()); // true

        System.out.println(blank.isEmpty()); // true

        System.out.println(empty.length()); // 5

        System.out.println(blank.length()); // 0


    }
}
