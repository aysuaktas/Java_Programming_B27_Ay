package day19_loops;

public class _03ForLoopFlow {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        /*

        1) initialization is basically declaring and assigning a variable to be used in the loop. This variable that is usually used to keep track of the iterations.

          initialization is executed:
            int i = 0;   --> in our example
            -> initialization occurs in once in the beginning of the loop

         2) termination condition (boolean value) is checked.

                -> if the boolean is true, the code inside the loop is executed.
                -> if the boolean is false: the loop stops

                i < 10; --> in our example

           3) -> third step: code inside the loop are executed top to bottom
                System.out.println(i);  --> in our example

           4) update
             the iteration of the variable executes
                i++  -> in our example

           -->  One iteration completed
            goes back to step 2 and repeats

         */






    }
}
