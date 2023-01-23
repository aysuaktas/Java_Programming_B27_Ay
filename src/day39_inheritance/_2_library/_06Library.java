package day39_inheritance._2_library;

import java.awt.print.Book;

public class _06Library {

    public static void main(String[] args) {

        _03Book book1 = new _03Book();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";
        // book1 has access to 6 variables: author, hasMovie, title, genre, chapters, numberOfPages

        _04AudioBook book2 = new _04AudioBook();
        book2.duration = 45.20;
        book2.narrator = "James Bond";
        book2.hasMovie = true;
        // book2 has access to 8 variables. All the variables from the parent _03Book class and the two variables declared in the AudioBook class

        _05EBook book3 = new _05EBook();
        book3.size = 24.12;
        book3.onKindle = true;
        // book3.narrator = the narrator was a variable declared in the _04AudioBook class
        // book3 has access to 8 variables. All the variables from the parent _03Book class and the two variables declared in the _05EBook class


    }
}
