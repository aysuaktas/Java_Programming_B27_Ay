package day38_encapsulation._08_homework_square;

import day38_encapsulation._08_homework_square._14Square;

public class _15TestingSquare {

    // Create a separate class to create and test the Square objects

    public static void main(String[] args) {

        _14Square square1 = new _14Square(4);  // calling constructor -> 4 is for int side of the square

        //       square1.side;  // I cannot call private variable like this. So;

        System.out.println(square1.getSide());  // 4

        square1.setSide(-6);
        System.out.println(square1.getSide());  // 4 --> bir ustte setSide yapip -6 dememe ragmen bu halen 4, degistirmedi. Cunku _14Square class'inda side'in positive number olmasi uzerine bir setter condition belirlemistik (side must be a positive number otherwise it will not be assigned to the instance variable)

        square1.setSide(5);
        System.out.println(square1.getSide());  // 5  --> it's positive number, so the value changed.


        System.out.println(square1); // _14Square{side=5, area=0, perimeter=0}  --> toString() methoda erismis oldum ama bunda area ve perimeter henuz belli olmadigi icin int'in default value'su olan 0 oldular.

        System.out.println(square1.calculateArea());  // 25 --> directly -> square1.area yapamam cunku area bir private variable.
        System.out.println(square1.calculatePerimeter());  // 20

        // to print toString() method:
        System.out.println(square1);  // _14Square{side=5, area=25, perimeter=20}


    }
}
