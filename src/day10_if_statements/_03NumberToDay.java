package day10_if_statements;

public class _03NumberToDay {

    /*
    create a number to represent the day. (1 being Monday and 7 being Sunday)
    Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
     */

    public static void main(String[] args) {

        /*
        int number = 3;

        if(number == 1){
            System.out.println("Its Monday");
        }

        if(number == 2){
            System.out.println("Tuesday");
        }

        if (number == 3){
            System.out.println("Wednesday");
        }                                   // boyle single if statement ile kullaninca hepsini tek tek check ediyor even my number is 1 and the first statement is true. Bu nedenle tek tek ugrasmak yerine multi-branch if statement kullanmak daha mantikli.
         */

        int number = 4;

        if (number == 1){
            System.out.println("Day is Monday");
        } else if (number == 2){
            System.out.println("Day is Tuesday");
        } else if (number ==3){
            System.out.println("Day is Wednesday");
        }else if (number == 4){
            System.out.println("Day is Thursday");
        }else if (number == 5){
            System.out.println("Day is Friday");
        }else if (number == 6){
            System.out.println("Day is Saturday");
        }else if (number == 7){
            System.out.println("Day is Sunday");
        } else {
            System.out.println(number + " is not a valid day number");
        }

        /*
         int number = 1; ise console'da -> Day is Monday
         int number = 4; ise console'da -> Day is Thursday -> Bu durumda tum statement'lari check etmiyor, dogru olani bulmasi yeterli. 4 -> day is Tuesday'i bulunca Friday, Saturday ve Sunday'i check etmesine gerek kalmadi. Multi-branch kullanmanin avantaji
         */

    }
}
