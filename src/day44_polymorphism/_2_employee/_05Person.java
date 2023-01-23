package day44_polymorphism._2_employee;

public abstract class _05Person {

    String name;

    public _05Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
