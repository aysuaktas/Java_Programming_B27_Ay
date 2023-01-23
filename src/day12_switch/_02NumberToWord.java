package day12_switch;

public class _02NumberToWord {

    /*
    number from 1-5
    convert the number to number word
    1 -> one
    2 -> two
    3 -> three
    4 -> four
    5 -> five

    default case
     */

    public static void main(String[] args) {

        int number = 3;

        switch (number){

            case 5:
                System.out.println("Five");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 1:
                System.out.println("One");
                break;

            default:
                System.out.println("Number should be between 1 and 5");
                // break; // In general, default is placed at the end. // In the last case, you don't need to put 'break'. ((last case can be a case or default))

        }

        // Bu ornekte buyukten kucuge dogru yazdik statement'leri (5ten 1e) -> The order does not matter in switch statement, but for readibility, it is important to put order.

    }
}
