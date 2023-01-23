package day39_inheritance._4_people;

public class _13Employee extends _12Person {  // extends _12Person yaptik



    /* Default constructor:
    public _13Employee(){
        super();   // this is calls parent constructor with no args (arguments) -> the default one bu. Default olarak super() de cagiriliyor.
    }
    // bunu sildigim icin ustte hata verdi -> There is no default constructor available diye uyari verdi bize. Yine yazalim
     */

    /*
    public _13Employee() {
        super();  // calls parent constructor with no args
    }
    // bunda halen bana hata veriyor. Cunku it is calling automatically ama artik o bizim constructor'umuzla eslesmiyor. Cunku _12Person class'inda constructor'da parantez icinde 2 tane parameter verdik: String name ve int age olarak. Bunlarin karsiligi default olan constructor'da olmadigi icin hata gosteriyor. O yuzden degisiklik yapmamiz gerek. Nasil cozerim? Iki yol var:

    1. yol -> Make a constructor with no arguments. -> _12Person class'ima gidip

        public _12Person(){

        } yazarsam deger vermemis olduk. Ama error gostermiyor artik. Ama argument (value) vermedik bunda

     */

    /* 2. yol -> arguments yani value verirsem:
    public _13Employee(String name, int age){
        super(name, age);
    }
     */

    double salary;

    public _13Employee(String name, int age, double salary){  // Constructor olusturduk ---> salary de ekledik ama bunun parent class'i ile ilgisi yok. Eskiden yaptigimiz gibi, this.salary = salary; seklinde yazacagiz instance variables-local variables konusunda ogrendigimiz sebepten yine.
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "_13Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
