package replit_aysu._0_Basics;

public class _09_Movie {

    /*
    The only thing you need to do is create and assign the variables, you should not write any print statements.
     */

    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:

        String movieName = "Spider-Man";
        String releaseDate = "12/17/2021";
        String genre = "Action/Adventure";
        int rottenTomatoesRating = 97;
        String rating = "PG-13";
        double duration = 2.5;
        boolean isSequel = true;
        boolean isOnDvd = false;

        //DO NOT TOUCH THESE LINE/LINES.
        System.out.println("------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming " + movieName + " which was released on " + releaseDate + ".");
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating  + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " + isSequel + " and is on dvd " + isOnDvd + ".");

    }

}
