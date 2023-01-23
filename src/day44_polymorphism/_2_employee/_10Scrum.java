package day44_polymorphism._2_employee;

public class _10Scrum {

    public static void main(String[] args) {

        // Reference of the super classes:

        _05Person tester1 = new _07Tester("James Bond", "Secret Agent", 150_000);  //  Tester constructor'indaki bu bilgileri doldurmam lazim argument olarak: (String name, String jobTitle, double salary), o yuzden bunlara karsilik olarak sirasiyla argument'lerimizi yazdik parantez icine.

                // the reference needs to have access to the field -but then execution happens on the object. Bunda reference is the _05Person. O nedenle first, you need to access the _05Person which is reference, then execution happens on the object:

                // tester1 can access the name variable

                /* But:

                tester1.work();
                tester1.create();

                     these are not accessible because the _05Person reference doesn't have to access to them.
                 */

        System.out.println(tester1); // Employee{jobTitle='Secret Agent', salary=150000.0, name='James Bond'}


        System.out.println("---------------------");


        _06Employee tester2 = new _07Tester("Jose Penso", "SDET", 200_000);  // both are Tester object. And both references are super class, but they are different. Biri _05Person super class'iydi bu ise _06Employee super class'i

                // in total, tester2 has access to name, jobTitle, salary, work() --> work methodu _06Employee class'inda olusturuldugu icin bir ustteki ornektekine ek olarak bunda work() method'a da access var.

        tester2.work(); // Running test cases


        System.out.println("---------------------");

        Object tester3 = new _07Tester("Milana Ra", "Senior Tester", 300_000);  // in terms of syntax, it is valid syntax; because "Object" is the super class of all classes. But the problem is references determines what you can access. tester3 does not access anything new to us. It has access toString, etc., but it does not access any of the classes that we created in employee subpackage. So, this is (using Object references) is restrictive.

                // tester3 don't have access to anything new. Nothing from _05Person, _06Employee, or _07Tester.

                /*
                tester3.work();
                tester3.name;
                tester3.salary;
                These are all invalid. None of these are allowed because of the reference type ((which is Object class reference type))
                 */


        System.out.println("---------------------");


        _09CreateSmokeTest tester4 = new _07Tester("Merve Ankara", "SDET", 203_000);

       // tester4.work();

        tester4.create(); // Creating automatic smoke test --> tester4 has access to the create() method


        System.out.println("---------------------");


        // reference of itself:
        _07Tester tester5 = new _07Tester("Rose Turan", "QA", 300_000);

        tester5.writeBugReport();  // Found bug, writing report
        tester5.create();  // Creating automatic smoke test
        tester5.work();    // Running test cases

        // tester5 buna ve diger tum method ve variable'larimiza ulasabiliyor -> I can access all the variables and the methods because tester5 has access to everything

        System.out.println(tester5);  // Employee{jobTitle='QA', salary=300000.0, name='Rose Turan'}


    }
}
