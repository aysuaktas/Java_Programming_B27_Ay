package day44_polymorphism._2_employee;

public abstract class _06Employee extends _05Person {

    String jobTitle;
    double salary;

    public _06Employee(String name, String jobTitle, double salary) {
        super(name);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


}
