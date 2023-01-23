package practices_group_15;

public class _08DailyQuestion {

    public static void main(String[] args) {
        String[] dailyQ = {"wish you", "an awesome week", "please", "give up", "you can", "never", "succeed", "keep studying", "everyday", "no way", "you will succeed!"};
        String javaFun = "true";
        boolean False = javaFun.length() >= 4 ? true : false;
        while(False){
            System.out.print(dailyQ[2] + " " + dailyQ[5] + " " + dailyQ[3] + " " + dailyQ[7] + " " + dailyQ[8] + " " + dailyQ[10] + "\n");
            if(False == true)
                System.out.println("See you in meeting my Team");
        }
    }

    /* It is an infinite loop. It will always print these:
         please never give up keep studying everyday you will succeed!
         See you in meeting my Team
    until we stop it.

    Because String javaFun assigned as "true" as hardcoded, and its length is 4. So, the ternary statement is true. boolean False = true. So, because of the condition of the while loop is this variable, and it is always true, the loop will always continue, until we stop it. So, the answer is: infinite loop.


     */
}
