package practices_group_15;

public class _06DailyQuestion {

    public static void main(String[] args) {

        int i = 10;

        do{
            System.out.println("Hello");
            i++;
        } while (i <= 10);

        // Hello -> This will be printed on the console
    }
}

//    The answer is: Hello
//    Because; in the do while loop, do block gets executed at least one time, even the boolean expression is false. In this example, it will print Hello once. However, when we do i++, our value will be 11. But, 11 is not smaller than or equal to 10. So, our boolean expression will be false. That's why, it will not get executed. So, Hello will be printed only one time, and then it will stop.
