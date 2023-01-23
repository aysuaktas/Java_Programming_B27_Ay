package day40_inheritance._4_homework;

import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;

public class _2_Season {

    /*
    Inheritance Practice
--------------------------------------------------------

Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes
     */

    public static class Season {

        String name;
        double highestAverageTemp;
        double lowestAverageTemp;


        // constructor:
        public Season(String name, double highestAverageTemp, double lowestAverageTemp){
            this.name = name;
            this.highestAverageTemp = highestAverageTemp;
            this.lowestAverageTemp = lowestAverageTemp;
        }


        public String activity(){
            return "Activity: ";   // default olarak burada return null da diyebiliriz cunku her child class'ta farkli olacak bu activity, o yuzden burada tamamen belirlemeden ya null deriz ya da child classes'ta concatenate etmek uzere buraya bir String yazariz, cunku method String ile olusturulmus
        }


        @Override
        public String toString() {
            return "Season{" +
                    "name='" + name + '\'' +
                    ", highestAverageTemp=" + highestAverageTemp +
                    ", lowestAverageTemp=" + lowestAverageTemp +
                    '}';
        }
    }


    /*
    Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
     */

    public static class Winter extends Season{

        public Winter(double highestAverageTemp,double lowestAverageTemp){   // burada name'i vermedik cunku bu class'ta o degismeyecek, onu Winter olarak hardcoded yazdim
            super("Winter", highestAverageTemp, lowestAverageTemp);
        }

        @Override
        public String activity(){
            return super.activity() + "Use Fireplace";
        }
    }



    /*
    Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade
    */

    public static class Summer extends Season{

        public Summer(double highestAverageTemp,double lowestAverageTemp){
            super("Summer", highestAverageTemp, lowestAverageTemp);   // Summer'i hardcoded verdik
        }

        @Override
        public String activity(){
            return super.activity() + "Drink Lemonade";
        }
    }


    /*
    Create a class Fall

	child class of Season

            constructor: set values to variables

    methods:
    activity(): Read A Book
    */

    public static class Fall extends Season{

        public Fall(double highestAverageTemp,double lowestAverageTemp){
            super("Fall", highestAverageTemp, lowestAverageTemp);   // Fall'u hardcoded verdik
        }

        @Override
        public String activity(){
            return super.activity() + "Read a book";
        }
    }



    /*
    Create a class Spring

	child class of Season

            constructor: set values to variables

    methods:
    activity(): Go Outside
    */

    public static class Spring extends Season{

        public Spring(double highestAverageTemp,double lowestAverageTemp){
            super("Spring", highestAverageTemp, lowestAverageTemp);   // Spring'i hardcoded verdik
        }

        @Override
        public String activity(){
            return super.activity() + "Go outside";
        }
    }



    /*
    Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

    List the is a relations of all the classes
     */

    public static class CheckSeason{   // bu class'lari ayni file icinde yapmasaydim public class Checkreason{ yazacakti

        public static void main(String[] args) {

            Winter season1 = new Winter(15, -10);
            System.out.println(season1);  // Season{name='Winter', highestAverageTemp=15.0, lowestAverageTemp=-10.0}
            System.out.println(season1.activity());  // Activity: Use Fireplace


            Summer season2 = new Summer(43, 17);
            System.out.println(season2);
            System.out.println(season2.activity());


            Fall season3 = new Fall(23, 10);
            System.out.println(season3);
            System.out.println(season3.activity());


            Spring season4 = new Spring(29, 15);
            System.out.println(season4);
            System.out.println(season4.activity());




        }
    }


}
