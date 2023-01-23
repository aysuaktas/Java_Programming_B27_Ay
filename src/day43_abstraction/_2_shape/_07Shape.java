package day43_abstraction._2_shape;

public abstract class _07Shape {  // abstract ekledik

    public final String name;

    public _07Shape(String name){
        this.name=name;  // now we are giving the value, bu nedenle bunu yazana kadar public final String name;'in alti kirmizi cizili olan warning gitti.
    }

    public abstract double area(); // deger kaybetmek istemiyoruz o yuzden bunda int falan degil de double yaptik ki integer olmazsa deger kaybi yasanmasin.

    public abstract double perimeter();

    @Override
    public String toString(){
        return name + " | Area: " + area() + " | Perimeter: " + perimeter();
    }  // bu autmatically degil, Saim kendisi yazdi. | isaretine pipe sign diyor sanirim?

}

/* It was yesterday's homework, but I did not do it.

Create an abstract class Shape

    define a final variable name

    define a constructor to initialize the name of the shape

    define two abstract methods:

        area()
        perimeter()

    override the toString to return the name, area and perimeter

Create a concrete class Circle
    sub class of Sharpe

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius

Create a concrete class Rectangle
    sub class of Sharpe

    create an instance variable length
    create an instance variable width

    call the parent constructor to set the name of the shape to "Rectangle" & initialize the length and width values for the shape

    implement the two abstract methods for a rectangle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, length, and width
 */
