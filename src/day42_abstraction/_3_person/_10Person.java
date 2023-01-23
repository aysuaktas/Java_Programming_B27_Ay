package day42_abstraction._3_person;

public abstract class _10Person {  // abstract ekledik biz

    String name;
    int age;

    public _10Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void sleep(int hours);

    @Override
    public String toString(){
        return name + " " + age;
    }


}
