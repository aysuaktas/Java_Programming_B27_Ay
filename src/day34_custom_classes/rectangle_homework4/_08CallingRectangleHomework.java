package day34_custom_classes.rectangle_homework4;

public class _08CallingRectangleHomework {

    public static void main(String[] args) {

        // Ayni package'daki _07RectangleHomework class'indaki method'lari burada cagiracagim.

        _07RectangleHomework firstRectangle = new _07RectangleHomework();   // base structure gibi dusun bunu -> creating an object to _07RectangleHomework class --->  // TODO: ClassName methodName = new className(); seklinde ---> Note: left side of the equal sign is the reference. right side of the equal sign is the object. Right side is actually where we are creating the object --> object olustururken "new" keyword'unu kullaniyoruz! It's like the operator that we are using for creating objects.
        firstRectangle.base = 6;
        firstRectangle.height = 3;
        firstRectangle.calculatePerimeter();
        firstRectangle.calculateArea();

        System.out.println(firstRectangle);  // toString diye cagirmama gerek olmadan o method'taki yaziyi otomatikman print etti

        System.out.println("-------------");

        _07RectangleHomework secondRectangle = new _07RectangleHomework();
        secondRectangle.base = 4.5;
        secondRectangle.height = 8.2;
        secondRectangle.calculatePerimeter();
        secondRectangle.calculateArea();

        System.out.println(secondRectangle);




    }
}
