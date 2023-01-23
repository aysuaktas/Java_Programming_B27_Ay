package day42_abstraction._3_person;

import java.util.ArrayList;
import java.util.Arrays;

public class _13WorkPlace {

    public static void main(String[] args) {

        // cannot create objects of the Abstract classes
//        Person obj = new Person();
//        Employee obj2 = new Employee();

        _12Tester baz = new _12Tester("Baz", 20, "SDET", 100_000);
        System.out.println(baz);  // Baz 20 SDET $ 100000.0

        baz.sleep(8);  // Baz sleeps for 8 while the automation code runs
        baz.work();   /* Running Test cases
                         Finding locators
                      */

        ArrayList<_12Tester> testers = new ArrayList<>();
        testers.add(baz);
        testers.addAll(Arrays.asList(
                new _12Tester("Bato", 30, "SDET", 150000),
                new _12Tester("Jonathan", 40, "Senior SDET", 200000),
                new _12Tester("Isa", 30, "SDET", 180000),
                new _12Tester("Nasiba", 25, "SDET", 120_000),
                new _12Tester("Nargiz", 27, "Qa engineer", 120000)
        ));

        System.out.println("------------");

        for(_12Tester each : testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();  // aralarinda bos bir line olsun diye
        }


    }
}

/* Run edince console'da:
    Baz 20 SDET $ 100000.0
    Baz sleeps for 8 while the automation code runs
    Running Test cases
    Finding locators
    ------------
    Baz 20 SDET $ 100000.0
    Tester sleeps for 8 while the automation code runs

    Bato 30 SDET $ 150000.0
    Bato sleeps for 8 while the automation code runs

    Jonathan 40 Senior SDET $ 200000.0
    Jonathan sleeps for 8 while the automation code runs

    Isa 30 SDET $ 180000.0
    Isa sleeps for 8 while the automation code runs

    Nasiba 25 SDET $ 120000.0
    Nasiba sleeps for 8 while the automation code runs

    Nargiz 27 Qa engineer $ 120000.0
    Nargiz sleeps for 8 while the automation code runs
 */