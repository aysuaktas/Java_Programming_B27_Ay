package day03_variables;

public class _05DateTomorrow {
    public static void main(String[] args) {

        /*
            declare and assign 3 variables (numbers)
            month, day, year

            print the date in this format:
                Date: month \ day \ year

            also update the day for tomorrow date
            print tomorrow's date in this format:
                Tomorrow's Date: month \ day \ year

         */

        int month, day, year; // made 3 variables, all of them are int type ((so we can write in the same line))
        month = 6; //  ((we did not use zero before number because then, it would not behave like normal number))
        day = 13;
        year = 2022;

        // alternative declaration and assignment: int month = 6, day = 13, year = 2022;  ==> all of them are int type ((so we can write in the same line))  // todo

        System.out.println("Date: " + month + " \\ " + day + " \\ " + year);    // Saim's solution

        int monthh = 6;
        int dayy = 13;
        int yearr = 2022;
        System.out.println("Date: " + monthh + "\\" + dayy + "\\" + yearr);  // my solution

        // Show date for tomorrow
        day = 14;
        System.out.println("Tomorrow's Date: " + month + " \\ " + day + " \\ " + year);

    }

}
