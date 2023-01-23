package day37_static._05_student;

import java.util.Arrays;

public class CydeoStudent {

    // student hakkindaki 3 classtan 1.si. Dersin 11.class'i

    // instance variables
    String name;
    String city;
    int group;
    Coffee myCoffee;  // Coffee class'i ile ilgili --> Merve'nin yazdigi: this is an object type lika a String for ex. String gibi bu da bir class. Coffee dedigi class ismi, oradan cagirdik

    // static variables
    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class, all object share. String[] type

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        // instructors = {}; // bu olmaz. I can declare and assign at the same time. Ama yukarida declare etmistik. Burada direkt {} seklinde yazamayiz. Ama alttaki gibi soyle yapabiliriz: yeni bir String array olusturup o instructors referansinin icine assign edebiliriz:
        instructors = new String[]{"Adam", "Asya", "Saim"}; // created a new String array and assigned into the instructors reference

        /* instead of line 24 --> --> instructors = new String[]{"Adam", "Asya", "Saim"}; seklinde yazmakta comfortable degilsen boyle de olurdu bu:
            instructors = new String[3];
            instructors[0] = "Adam";
            instructors[1] = "Asya";
            instructors[2] = "Saim";
        */

        /* another alternative:
            instructors = ("Adam Asya Saim).split(" ");
        */
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);  // Coffee class'i ile ilgili. --> ((Coffee constructor'ini burada cagirdik)) each ogrencinin 16 coffee'si olacakmis mesela. 16 olarak belirledik burada.
    }

    public static void schoolInfo(){
        System.out.println(schoolName + " Batch " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));  // Merve'nin aciklamasi: bu array oldugu icin Arrays.toString methodunu kullanmamiz lazim
    }

    public void drink(){
        myCoffee.amountLeft -= 2;  // Coffee class'iyla ilgili
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
