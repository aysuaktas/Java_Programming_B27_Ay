package day12_switch;

import java.util.Scanner;

public class _08AuthorHomework {

    /*
    - // Look at Starbucks from class for an idea

    You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.

    Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

    Make variables for all of that information. Given empty defaults for all the variables

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the genre you want to learn about average page length, average profit, average number of sequels, and average number of countries published in:");

        String genre = input.nextLine();

        int pageLength = 0;
        double profit = 0;
        byte sequels = 0;
        int countries = 0;


        switch (genre) {

            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;

            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;

            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;

            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;

            //  default:
              //  System.out.println("It is not a valid genre name or the information about this genre is not known.");    // bunu yazmiyoruz, default yerine if statement kullaniyoruz, cunku;

        }


       if(pageLength != 0 && profit != 0 && sequels != 0 && countries != 0) {     // yanlis bir sey yazarsak (case'e yazmadigimiz yani fantasy, detective, science fiction, or short story olmayan bir sey olursa) -> yukarida pageLength, profit, sequels, ve countries icin yazdigimiz 0'i diger veriler icin getirmesin diye bunu yazdik. Yani 0 pageLength, 0 profit vs yazmasin diye. -> default kullaninca yine 0 pageLength vs printed ediyor. Sona default: yazarsak ve case'lerde yer almayan bir genre (String genre = "g" gibi) belirlersek -console'da -> : It is not a valid genre name or the information about this genre is not known. For this genre, the page length is 0, average profit is 0.0, ..... diye cikiyor. Boyle olmamasi icin, default yerine bu if statement'i yaziyoruz.

            System.out.println("For this genre; the page length is " + pageLength + ", average profit is " + profit + " ,average number of sequels is " + sequels + ", and average number of countries that are published in " + countries + ".");   // TODO: bu print statement'i de if statement'in icinde yazinca, gecersiz (mesela gggg) bir sey console'a yazinca print etmiyor.
       }

       }
    }



