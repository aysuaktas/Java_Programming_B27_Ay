package day42_abstraction._3_person;

public final class _12Tester extends _11Employee{  // final'i ve extends _11Employee'i ben ekledim


    public _12Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);  // we called the constructors with super keyword.
    }

    @Override
    public void work() {
        System.out.println("Running Test cases");
        System.out.println("Finding locators");
    }


    @Override
    public void sleep(int hours) {
        System.out.println(name+ " sleeps for " + hours + " while the automation code runs");
    }




}
