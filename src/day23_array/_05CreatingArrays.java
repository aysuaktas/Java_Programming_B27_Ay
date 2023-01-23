package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class _05CreatingArrays {

    public static void main(String[] args) {

        /*
        Student Information

            index 0 -> id (id of that student)
                  1 -> first name
                  2-> last name
                  3 -> batch num
         */

        // Have all the information:
        String[] studentOne = {"04", "Kristina", "Gaidamovic", "27"};
        System.out.println(Arrays.toString(studentOne));

        System.out.println("---------------");

        // If we know the number of elements, but not the values yet ((kac element oldugunu bilince ama we don't know values yet olunca)):
        String[] studentTwo = new String[4];
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

        System.out.println("---------------");
/*
        // If we know the number of elements, and add from Scanner:  --> altta baska scanner'li ornek var diye bunu comment'e aldik, tekrar tekrar console'da yazmamak icin
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();

        // batch number icin vs de nextInt kullanmadik cunku String type olarak yazdik. Array icin same data type olmasi gerekiyor

        System.out.println(Arrays.toString(studentThree)); // Alttaki ornekte toplu yazdirdigimiz kisim buradan geliyor -> [14, Alena, Voronova, 27]

        ----------- Console'da:
        Enter your id
        14  -> yazarsak
        Enter your first name
        Alena  -> yazarsak
        Enter your last name
        Voronova  -> yyazarsak
        Enter your batch number
        27  -> yazarsak
        [14, Alena, Voronova, 27]
         */

        // Most dynamic:  --> (with for loop):
        Scanner input = new Scanner(System.in);  // bir ustteki ornegi comment out yaptigimiz icin bunu buraya da ekledim
        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};   // I wanna know the id, first number, last name, batch number. I stored them in another string that I created which is this questions String
        for(int i = 0; i < studentFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            studentFour[i] = input.next();  // storing the scanner input from the console into the array at index i
        }
        System.out.println(Arrays.toString(studentFour));

        /*
        Enter your id
        00
        Enter your first name
        Sabrina
        Enter your last name
        Gulmatova
        Enter your batch number
        27
        [09, Sabrina, Gulmatova, 27]
         */
    }
}
