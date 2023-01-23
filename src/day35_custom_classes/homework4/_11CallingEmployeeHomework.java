package day35_custom_classes.homework4;

import java.util.ArrayList;
import java.util.Arrays;

public class _11CallingEmployeeHomework {

    public static void main(String[] args) {


        _10EmployeeHomework employee = new _10EmployeeHomework("Aysu", 2357, "SDET", 195_000);

        // (String name, int id, String jobTitle, double salary) sirasina gore

        System.out.println(employee);  // Employee {name='Aysu', id=2357, jobTitle='SDET', salary= $195000.0}

        employee.goToMeeting();  // Aysu is going to a meeting!  --> void method oldugu icin print statement'e gerek kalmadan print edebilmis oldum bunu. --> ustte degerleri verirken employee variable name'ini kullandigim icin employee. seklinde kullandim



        // ustteki kismi benim odevim. Alttaki kisim Saim'in dersteki yaptigi (baska class'tan cagirdim onu)

        System.out.println("--------------------");


        _111EmployeeWithSaim james = new _111EmployeeWithSaim("James Bond", 7, "Spy", 10_000); // salary'i 10_000_000 olarak yazmis Saim kendi yaptigi ornekte ama console'da salary=1.0E7 seklinde gozukuyor, bir sorun yokmus ama ben 10_000 yazdim oyle gozukmedi
        System.out.println(james);  // Employee{name='James Bond', id=7, jobTitle='Spy', salary=10000.0}

        _111EmployeeWithSaim obj2 = new _111EmployeeWithSaim("Ana");
        System.out.println(obj2);  // Employee{name='Ana', id=0, jobTitle='null', salary=0.0}

        _111EmployeeWithSaim obj3 = new _111EmployeeWithSaim("Jane", 9);
        System.out.println(obj3); // Employee{name='Jane', id=9, jobTitle='null', salary=0.0}

        _111EmployeeWithSaim obj4 = new _111EmployeeWithSaim("Penny", 12, "CEO");
        System.out.println(obj4);  // Employee{name='Penny', id=12, jobTitle='CEO', salary=0.0}


        System.out.println("--------------------");
        // constructor chaining methodu ile yaptigimizi cagirirsak:


        _112EmployeeV2 james2 = new _112EmployeeV2("James Bond", 7, "Spy", 10_000);
        System.out.println(james2);  // Name: James Bond, id: 7, job title: Spy, salary: $10000.0

        _112EmployeeV2 obj10 = new _112EmployeeV2("Ana");
        System.out.println(obj10);  // Name: Ana

        _112EmployeeV2  obj11 = new _112EmployeeV2 ("Jane", 9);
        System.out.println(obj11); // Name: Jane, id: 9

        _112EmployeeV2  obj12 = new _112EmployeeV2 ("Penny", 12, "CEO");
        System.out.println(obj12);  // Name: Penny, id: 12, job title: CEO

        System.out.println("--------------------");

        // for practice:

        _111EmployeeWithSaim[] arr = new _111EmployeeWithSaim[3];   //  _111EmployeeWithSaim yazdigim yerlerde Saim'de Employee yaziyor cunku o class ismini oyle vermisti
        arr[0] = james;
        arr[1] = obj2;
        arr[2] = obj3;
        System.out.println(Arrays.toString(arr));  // [Employee{name='James Bond', id=7, jobTitle='Spy', salary=10000.0}, Employee{name='Ana', id=0, jobTitle='null', salary=0.0}, Employee{name='Jane', id=9, jobTitle='null', salary=0.0}]

        System.out.println(arr[0].name); // James Bond
        System.out.println(arr[0].salary);  // 10000.0

      ArrayList<_111EmployeeWithSaim> list = new ArrayList<>();


    }
}