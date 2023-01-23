package day44_polymorphism._2_employee;

public class _07Tester extends _06Employee implements _09CreateSmokeTest{


    public _07Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    @Override
    public void create() {
        System.out.println("Creating automatic smoke test");
    }

    public void writeBugReport(){
        System.out.println("Found bug, writing report");
    }

}
