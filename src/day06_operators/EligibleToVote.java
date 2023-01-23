package day06_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 21;

        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !hasCriminalBackground; //not having criminal background olmasi lazim oy kullanabilmesi icin. o yuzden && dedikten sonra ! yazip hasCriminalBackground dedik. ( ! isareti logical NOT Operator)

        System.out.println("isEligible: " + isEligible); // print statement'i ben yazdim.

    }
}
