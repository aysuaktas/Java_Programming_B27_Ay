package day11_nested;

public class _16MovieDurationHomework {

    /*
    The length of the movie will determine how much it costs.
    declare and assign a variable for the duration of the movie
    The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99
     */

    public static void main(String[] args) {


        double durationOfMovie = 2.0;    // 2 saat

        if(durationOfMovie < 0.0){
            System.out.println("Movies cannot be less than 0 minutes");
        } else if(durationOfMovie > 4.0){
            System.out.println("Movies cannot be more than 4 hours");
        } else {

            if (durationOfMovie == 1.0) {
                System.out.println("the price of the tickets is $8.99");
            } else if (durationOfMovie == 1.5) {
                System.out.println("the price of the tickets is $10.50");
            } else if (durationOfMovie == 2.0) {
                System.out.println("the price of the tickets is $12.99");
            } else if (durationOfMovie == 2.5) {
                System.out.println("the price of the tickets is $ 14.50");
            } else if (durationOfMovie == 3.0 || durationOfMovie == 3.5 || durationOfMovie == 4.0) {
                System.out.println("the price of the tickets is $15.99");
            }
        }


    }
}
