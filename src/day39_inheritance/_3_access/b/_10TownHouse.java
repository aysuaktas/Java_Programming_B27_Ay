package day39_inheritance._3_access.b;

import day39_inheritance._3_access.a._07House;

public class _10TownHouse extends _07House {

    // baska subpackage'i actik. _07House olan a package'indaydi, biz b'deyiz. O yuzden ben extends _07House yaptigimda IntelliJ automatically import etti ustte


    public static void main(String[] args) {

        // Q: What does _10TownHouse inherit from _07House?
        // these are in different packages

        _10TownHouse house = new _10TownHouse();
        house.address = "123134 road";  // public String address idi bu _07House package'inda.
        house.city = "Fairfax";  // bu burada hata vermedi ama _11RunnerB class'inda hata verdi --> Cunku _12RunnerB class'inda I don't have access because I'm in a different package ve inherited yapmadim yani o child class degil. Ama bu _10TownHouse class'inda hata vermedi, cunku:

        // Q: did I inherit the city variable? Yes --> inherited yaptigim icin farkli package'da da olsa calisir protected olan.

        /*
        Protected (Access Modifier):
            - without inheritance:  acts like default, accessible only in the same package
            - with inheritance: protected variables & methods can be inherited to sub classes anywhere
         */

        // house.state;  // -> state has default access modifier, so only accessible in the same package

        // house.zipcode;  // -> zipcode is private, so only accessible in the same class


    }
}