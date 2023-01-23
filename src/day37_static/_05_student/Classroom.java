package day37_static._05_student;

import java.util.Arrays;

public class Classroom {

    // student hakkindaki 3 classtan 2.si. Dersin 12.class'i

    public static void main(String[] args) {

        CydeoStudent.schoolInfo();  // now I can get all the information about the school

        /* console'da:
        Cydeo Batch 27
        Instructors: [Adam, Asya, Saim]
         */

        CydeoStudent mayila = new CydeoStudent("Mayila", "Toronto", 2);
        CydeoStudent aili = new CydeoStudent("Aili", "Ottawa", 1);
        System.out.println(mayila);  // CydeoStudent{name='Mayila', city='Toronto', group=2}

        System.out.println(Arrays.toString(mayila.instructors)); // [Adam, Asya, Saim] --> not recommended, just the class name to access ---> Merve''nin aciklamasi: we are taking the object reference in order to access which is possible, because the object does come from the class. So, it does have that class information, but if you want to generally access, you should use the reference of the class
        System.out.println(Arrays.toString(aili.instructors)); // [Adam, Asya, Saim] --> not recommended, just the class name to access
        System.out.println(Arrays.toString(CydeoStudent.instructors));  // [Adam, Asya, Saim] --> onerilen kullanim bu, CydeoStudent aslinda class ismi. Onerilen kullanim class ismi ile cagirmak

        System.out.println(CydeoStudent.instructors[1].charAt(3)); // a

        System.out.println(mayila.myCoffee.amountLeft);  // 16.0
        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);  // 14.00


        System.out.println(aili.myCoffee.amountLeft); // // 16.0 --> 16 cunku her ogrencinin kendi 16 kahvesi var -which is an instance-, Mayila'ninki Aili'yi etkilemez.
        aili.drink();
        aili.drink();
        aili.drink();
        System.out.println("aili left " + aili.myCoffee.amountLeft); // aili left 10.0
        System.out.println("mayila left " + mayila.myCoffee.amountLeft);  // mayila left 14.0 --> Aili'nin icmesi de Mayila'ninkini etkilemedi

    }
}
