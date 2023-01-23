package day36_custom_classes.hobby_homework;

import java.util.ArrayList;

public class _06TestingHobby {

    /*
     Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
	- create a copy ArrayList and remove all hobbies that cost more than $500 annually
     */

    public static void main(String[] args) {

        // create an ArrayList of Hobby objects:
        ArrayList<_05HobbyHomework> allHobbies = new ArrayList<>();


        // create and add a couple Hobby objects:
        allHobbies.add(new _05HobbyHomework("playing golf", 530, true, true));
        // _05HobbyHomework class'indaki -> (String name, int annualCost, boolean isOutdoors, boolean requiresOthers){ uzerinden sirasiyla yazdik bu degerleri

        allHobbies.add(new _05HobbyHomework("doing puzzles", 195, false, false));
        allHobbies.add(new _05HobbyHomework("going to concerts", 680, true, true));
        allHobbies.add(new _05HobbyHomework("reading books", 200, false, false));


        // iterate through the ArrayList and execute the doIt() method on each Hobby object:
        for (_05HobbyHomework each : allHobbies) {
            each.doIt();
        }

        /* Console'da:
        playing golf outside
        doing puzzles inside
        going to concerts outside
        reading books inside
         */


        System.out.println("-----------------------");


        // create a copy ArrayList and remove all outdoors Hobbies:
        ArrayList<_05HobbyHomework> allIndoors = new ArrayList<>(allHobbies);
        allIndoors.removeIf(hobby -> hobby.isOutdoors); // hobby yerine p falan da yazabilirdim
        System.out.println(allIndoors);  // [_05HobbyHomework{name='doing puzzles', annualCost=195, isOutdoors=false, requiresOthers=false}, _05HobbyHomework{name='reading books', annualCost=200, isOutdoors=false, requiresOthers=false}]


        System.out.println("-----------------------");


        // create a copy ArrayList and remove all hobbies requiring other people:
        ArrayList<_05HobbyHomework> allAlone = new ArrayList<>(allHobbies);
        allAlone.removeIf(hobby -> hobby.requiresOthers);
        System.out.println(allAlone);  // [_05HobbyHomework{name='doing puzzles', annualCost=195, isOutdoors=false, requiresOthers=false}, _05HobbyHomework{name='reading books', annualCost=200, isOutdoors=false, requiresOthers=false}]


        System.out.println("-----------------------");


        // create a copy ArrayList and remove all hobbies that cost more than $500 annually:
        ArrayList<_05HobbyHomework> cheap = new ArrayList<>(allHobbies);
        cheap.removeIf(hobby -> hobby.annualCost > 500);
        System.out.println(cheap);  // [_05HobbyHomework{name='doing puzzles', annualCost=195, isOutdoors=false, requiresOthers=false}, _05HobbyHomework{name='reading books', annualCost=200, isOutdoors=false, requiresOthers=false}]


        System.out.println("-----------------------");


        System.out.println(allHobbies);

        /* Console'da:
        [
        _05HobbyHomework{name='playing golf', annualCost=530, isOutdoors=true, requiresOthers=true},
        _05HobbyHomework{name='doing puzzles', annualCost=195, isOutdoors=false, requiresOthers=false},
        _05HobbyHomework{name='going to concerts', annualCost=680, isOutdoors=true, requiresOthers=true},
        _05HobbyHomework{name='reading books', annualCost=200, isOutdoors=false, requiresOthers=false}]
         */



    }
}
