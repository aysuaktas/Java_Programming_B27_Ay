package day09_if_statements;

public class _07Outside {

    public static void main(String[] args) {

        double degrees = 80;

        if(degrees >= 72){
            System.out.println("Its nice, go outside");
        }

        if(degrees < 72){
            System.out.println("stay inside, code some java");
        }

        System.out.println("--------------------"); // ornekleri ayirmak icin koydum. Ustteki single if. Alttaki if else.

        // as if else;

        if(degrees >= 72){
            System.out.println("Its nice, go outside");
        } else {
            System.out.println("stay inside, code some java");
        }


    }
}
