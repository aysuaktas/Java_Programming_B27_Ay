package day41_exceptions._4_person;

public class _15Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age should not be less than 0 or more than 120");  // invalid data olursa programi durdurmak icin throw kullandik --> parantaz icine bir ifade yazmayip bos da birakabiliyoruz. Ama yazinca _16Runner class'inda print edince Exception yaninda bu aciklamayi da goruyoruz.
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
