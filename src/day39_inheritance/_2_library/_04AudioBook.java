package day39_inheritance._2_library;

import day39_inheritance._2_library._03Book;

public class _04AudioBook extends _03Book {   // public class _04AudioBook { yaziyordu, ona extends _03Book ekledim ki _03Book parent class, bu da onun child class'i olsun ((AudioBook is a Book)) ve parent class'taki method ve variable'lari kullanabileyim

    // AudioBook'um varsa Book'taki tum o title, author, genre vs bunda da var. Ama belki ekstra bir seylerim daha var. Mesela:


    String narrator;  // Not all books have a narrator. But audio books have.
    double duration;

    // How many instance variables does AudioBook objects have access to? --> It has 6 variables from the super (parent) class. Plus, 2 variables from its class (this class yani), so total will be 8.



}
