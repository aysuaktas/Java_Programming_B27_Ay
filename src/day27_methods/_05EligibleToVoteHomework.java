package day27_methods;

public class _05EligibleToVoteHomework {

    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */

    public static void main(String[] args) {
        eligibleToVote(17);
        eligibleToVote(33);
        eligibleToVote(18);  // buraya istedigin age degerlerini verebilirsin, hardcoded bu cevabim cunku
    }

    public static void eligibleToVote(int age){

        if(age >= 18){
            System.out.println("Your age is: " + age + ". You are eligible to vote.");
        } else {
            System.out.println("Your age is: " + age + ".You are NOT eligible to vote.");
        }
    }


}
