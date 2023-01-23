package day42_abstraction._3_person;

public abstract class _11Employee extends _10Person{  // abstract ve extends _10Person'i biz yazdik

    String jobTitle;
    double salary;

    // If I want to Employee object, what I need? Name, age, job title, salary
    public _11Employee(String name, int age, String jobTitle, double salary){
        super(name, age);  // bunlar yeni degil, _10Person parent class'inda vardi o yuzden parent class constructor'inda olan bu ikisini tekrar kullaninca boyle yazabiliyoruz  ---> parent'ten bu cagirdigimiz has to be in the first line
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();  // employee isen you should work, demis olduk. _10Person'dakinde de insan isen you should sleep tarzi seyler demis olduk bunlarda mesela. --> Zeynep diyor ki: parent'i da bu class da abstract class oldugu icin, method icine bir sey yazmamiza gerek yokmus. Ama _12Tester class'i abstract class degil mesela, o yuzden ondaki work method icine bir seyler yazdik

    @Override
    public String toString(){
        return super.toString() + " " + jobTitle + " $ " + salary;
    }



}
