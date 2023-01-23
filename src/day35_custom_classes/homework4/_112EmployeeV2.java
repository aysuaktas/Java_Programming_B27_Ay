package day35_custom_classes.homework4;

import java.lang.reflect.Constructor;

public class _112EmployeeV2 {

    // Ayni soruyu cevaplamanin baska sekli. constructor chaining yaptik, bunu kullan.
    String name;
    long id;
    String jobTitle;
    double salary;

    public _112EmployeeV2(String name) {
        this.name = name;
    }

    public _112EmployeeV2(String name, long id) {
        this(name);
        this.name = name;
        this.id = id;
    }

    public _112EmployeeV2(String name, long id, String jobTitle) {
        this(name, id);
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public _112EmployeeV2(String name, long id, String jobTitle, double salary) {
        this(name, id, jobTitle);
            /* ustteki gibi yazdik alttaki gibi yazmak yerine
                    this.name = name;
                    this.id = id;
                    this.jobTitle = jobTitle;
                    */
        this.salary = salary;
    }

    /*
    // Aynisini farkli bir yolla _111EmployeeWithSaim'de de yaptik. Ayni sonuc, yol farkli. Bunda:

    this()
    Constructor call

         constructor chaining: one constructor calling another constructor -> So, we don’t have to repeat ourselves

    // her seyi kendimiz yazmak yerine constructor'in cagirmasina izin veriyoruz boylece
     */

    public String toString() {
        String output = "Name: " + name;

        if (id != 0) { // true if the id was initialized
            output += ", id: " + id;
        }

        if (jobTitle != null) {// true if the jobTitle was initialized
            output += ", job title: " + jobTitle;
        }

        if (salary != 0) {
            output += ", salary: $" + salary;
        }

        return output;
    }


    // _13CallingEmployeeHomework'te cagiracagim bunu.


  /*
    not allowed to call itself ::::
    MESELA:
     public _112EmployeeV2(String name, long id, String jobTitle) {
        this(name, id); varken altina ayni yere tekrar
        this(name); yazmak olmaz yani
    }

    public _112EmployeeV2(int a){
        this():
     }

     public _112EmployeeV2(){
        this(5);
     }

   */

}




