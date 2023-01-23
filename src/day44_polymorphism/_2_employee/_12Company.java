package day44_polymorphism._2_employee;

import java.util.ArrayList;

public class _12Company {

    public static void main(String[] args) {

        ArrayList<_06Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new _07Tester("Anam Zahra", "SDET", 190_000));
        allEmployees.add(new _07Tester("Husna", "SDET", 200_000));
        allEmployees.add(new _08Developer("James", "Developer", 100_000));
        allEmployees.add(new _08Developer("Tatsiana Abramova", "Lead Developer", 500_000));
        allEmployees. add(new _08Developer("Baz", "Developer", 300_000));

                // object tester da olsa developer da olsa bunlarin hepsi _06Employee types

        double biggestSalary = allEmployees.get(0).salary;  // default salary

        for(_06Employee each : allEmployees){   // bunu _06Employee class'i yerine _05Person ile yapmadik cunku _05Person is the parent class and does not have all the information that _06Employee has. Cunku _06Employee child class olarak hem parent olan _05Person'in method'larina falan erisebiliyor hem de kendi ayri variable'lari, methodlari falan olabiliyor.
            if(each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }
        System.out.println(biggestSalary);  // 500000.0

        System.out.println("---------------");

        ArrayList<_07Tester> allTesters = new ArrayList<>();
        ArrayList<_08Developer> allDevelopers = new ArrayList<>();

        for(_06Employee each: allEmployees){
            if(each instanceof _07Tester){
                allTesters.add((_07Tester)each);  // casting bu, sonraki derste gorecegiz daha cok. (( Casting is about paranthesis with references)) -> casting means -> going from one reference to other
            } else if (each instanceof _08Developer){
                allDevelopers.add((_08Developer)each);
            }
        }
        // bu ustte neden casting yaptik? cunku parent class olan _06Employee'den child class olan _07Tester ve _08Developer'a gitmeye calistik. Buyukten kucuge gittigimiz icin casting yapmamiz gerekti. ((Merve's explanation: 'employee icinden bir obje alip tester'a koymak istiyoruz gibi sanirim', ondan yaptik yani ))


        System.out.println(allTesters);  // [Employee{jobTitle='SDET', salary=190000.0, name='Anam Zahra'}, Employee{jobTitle='SDET', salary=200000.0, name='Husna'}]
        System.out.println(allDevelopers);  // [Employee{jobTitle='Developer', salary=100000.0, name='James'}, Employee{jobTitle='Lead Developer', salary=500000.0, name='Tatsiana Abramova'}, Employee{jobTitle='Developer', salary=300000.0, name='Baz'}]


    }
}
