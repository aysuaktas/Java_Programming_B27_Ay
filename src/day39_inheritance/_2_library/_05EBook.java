package day39_inheritance._2_library;

import day39_inheritance._2_library._03Book;

public class _05EBook extends _03Book {    // extends _03Book'u manual olarak ekledik buna -> parent-child class yapabilmek icin

    // bu da parent class'taki tum variable'lara sahip, ama baska variable'lari da olabilir, ama baska olmak zorunda da degil, olmayadabilir.

    double size;  // mb anlaminda size dedigimiz
    boolean onKindle;  // is it available on Kindle?


}
