package day19_loops;

public class _05LoopBackwards {

    public static void main(String[] args) {

        for(int i = 50; i >= 0; i--){
            System.out.print(i + " ");
        }


        System.out.println();


        for(char letter = 'A'; letter <= 'Z'; letter++){  // as long as my letter < 'Z' ((bacause every character has a number related to it, I will print it
            System.out.print(letter + " ");
        }



    }
}
