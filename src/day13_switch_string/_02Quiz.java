package day13_switch_string;

public class _02Quiz {

    public static void main(String[] args) {

        System.out.println("1)Select the primitive datatype");
        System.out.println("a) String");
        System.out.println("b) int");
        System.out.println("c) main");

        char option = 'b';  // Can I use switch with character types?-> Yes

        switch (option){
            case 'b':
                System.out.println("Correct");
                break;
            case 'a':
            case 'c':
                System.out.println("Incorrect");
        }


        /*
        char option = 'b'; ise -- >
        1)Select the primitive datatype
        a) String
        b) int
        c) main
        Correct

        char option = 'a'; veya
        char option = 'c'; ise -> Incorrect
         */
    }
}
