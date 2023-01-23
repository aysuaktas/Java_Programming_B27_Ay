package day11_nested;

public class _08Grade {

    public static void main(String[] args) {

        int score = 45;

        if(score >= 75){
            System.out.println("Passed");

            if(score > 92){
                System.out.println("You did really well");
            } else if(score > 80){
                System.out.println("Good job");
            } else {
                System.out.println("Not bad");
            }


        } else {                // until here, there is if block above. Inside of my if block, there is multi-branch if statement.
            System.out.println("Failed");

            if(score > 50){
                System.out.println("Try harder");
            } else {                              // 50den daha dusukse
                System.out.println("Study much more");
            }

        }


        /*
        int score = 89; ise console'da ->
        Passed
        Good job

        int score = 60; ise --> score >= 75 statement is false -> it goes to else block, so; in the console, this is written;
        Failed
        Try harder
        */


    }
}
