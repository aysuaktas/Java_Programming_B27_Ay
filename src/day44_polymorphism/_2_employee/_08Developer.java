package day44_polymorphism._2_employee;

public final class _08Developer extends _06Employee {


    public _08Developer(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Writing a function");
    }


    public void unitTesting(){
        System.out.println("Running unit test on function");
    }

}
