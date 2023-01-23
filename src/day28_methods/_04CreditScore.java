package day28_methods;

public class _04CreditScore {

    public static void main(String[] args) {
        checkScore(800); // Good score
        checkScore(600); // Not a good score

        checkScore2(789); // bunu yazinca printed olmuyor, asagida return yaptigimiz icin

        System.out.println(checkScore2(789));  // true   --> boolean expression'di o yuzden true cevabini aldik

        if(checkScore2(600)){
            System.out.println("Get a loan");
        } else {
            System.out.println("Get a higher score");
        }  // Get a higher score  is printed
    }

    public static void checkScore(int score){
        if(score > 700){
            System.out.println("Good score");
        } else {
            System.out.println("Not a good score");
        }
    }

    public static boolean checkScore2(int score){
        return score > 700;  // it is returning int
    }


}
