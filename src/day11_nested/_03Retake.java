package day11_nested;

public class _03Retake {

    /*
    create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If it's the first attempt -> subtract 10%
	If it's the second attempt -> subtract 20%
	If it's the third attempt -> subtract 35%

    Based on the retake attempt number calculate the final grade

     */

    public static void main(String[] args) {

        double grade = 100;
        int attemptNumber = 2;  // second attempt // 2 dedik ama ornek verdik yani we assumed it randomly. This is a hardcoded number. Hardcoded numbers do not have any purpose, they are just numbers. It could be anything.
        double finalGrade = 0;   // todo: because we don't know the result, we just initialized yet.

        if(attemptNumber == 1){
            finalGrade = grade * 0.9;  // 90% (ninety percent) of the grade, which is also minus 10%. Yani 0.9 ile carpabiliriz veya yuzde 10'u toplamdan cikarabiliriz // grade - grade * 10% de olabilir yani ama direkt * 0.9 daha kolay
        } else if(attemptNumber == 2){
            finalGrade = grade * 0.8;  // 80% of the grade, which is minus 20%
        } else if(attemptNumber == 3){
            finalGrade = grade * 0.65; // 65% of the grade, which is minus 35%
        }

        System.out.println(finalGrade);

        /*
        double grade = 100;
        int attemptNumber = 3; ise finalGrade -> console'da;
        65.0

         */

    }
}
