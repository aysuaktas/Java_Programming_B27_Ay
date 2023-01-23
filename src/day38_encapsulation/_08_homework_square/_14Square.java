package day38_encapsulation._08_homework_square;

public class _14Square {

    /*
    create a class called Square

        - data:
            side

        - constructor
            - create a constructor that creates a Square object with the side

            	call setter here

        - encapsulate the Square class
        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects
     */



    // instance variable:
    private int side;

    int area;
    int perimeter; // toString method'a direkt ekleyebilmek icin bunlari calculateArea ve calculatePerimeter methodlari icinde belirtmek yerine burada olusturdum.


    // constructor:
    public _14Square(int side){
        this.side = side;
        setSide(side);  // calling setter inside the constructor
    }


    // getter method:
    public int getSide() {
        return side;
    }

    // setter method:
    // setter condition: side must be a positive number otherwise it will not be assigned to the instance variable
    public void setSide(int side) {
        if(side > 0) {
            this.side = side;
        }
    }


    // calculateArea() : calculate and return the area of a Square:
    public int calculateArea(){
        area = side * side;
        return area;
    }


    // calculatePerimeter() : calculate and return the perimeter of a Square:
    public int calculatePerimeter(){
        perimeter = side * 4;
        return perimeter;
    }


    // toString() --> print the side, area, and perimeter of the Square object


    @Override
    public String toString() {
        return "_14Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
