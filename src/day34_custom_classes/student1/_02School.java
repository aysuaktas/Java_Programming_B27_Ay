package day34_custom_classes.student1;

public class _02School {

    public static void main(String[] args) {


        // Bir onceki _01Student class'i ile iliskili bu class. Ama same package'da olduklari icin import etmeye gerek yok.

        _01Student studentOne = new _01Student();
        System.out.println(studentOne); // day34_custom_classes.student._01Student@75bd9247 ----> // print the objects, but we get some hash values

        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne); // day34_custom_classes.student._01Student@75bd9247  ---> // this still does not show us anything useful

        System.out.println(studentOne.name);  // Olena
        System.out.println(studentOne.batchNumber);  // 27
        System.out.println(studentOne.program);  // SDET
        System.out.println(studentOne.grade); // 99.99

        // we have instance variable information. We don't have a method yet.

        // call in the instance method:
        // Student.study(); //  --> this only works if the method was static
        studentOne.study();  // Olena is studying



        System.out.println("----------------");

        _01Student studentTwo = new _01Student();
        System.out.println(studentTwo.name);   // null  --> default values
        System.out.println(studentTwo.batchNumber);  // 0
        System.out.println(studentTwo.program);  // null
        System.out.println(studentTwo.grade);  // 0.0

        studentTwo.study();  // null is studying

        // In this case, we created a new object of the Student class. It means, this object has a fresh copy of the instance variables, which means they will have their default values



    }
}
