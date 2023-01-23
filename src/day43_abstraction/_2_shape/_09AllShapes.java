package day43_abstraction._2_shape;

public class _09AllShapes {

    public static void main(String[] args) {

        // _07Shape obj = new Shape();   //-> bunu comment'te biraktik cunku _07Shape is an abstract class and you cannot create an object from it.

        _08Circle obj = new _08Circle(4.6);
        System.out.println(obj);  // Circle | Radius: 4.6 | Area: 66.47610054996001 | Perimeter: 28.902652413026093

        System.out.println(obj.area());  // 66.47610054996001
        System.out.println(obj.perimeter());  // 28.902652413026093

        System.out.println(obj.name);  // Circle
        System.out.println(obj.radius);  // 4.6

        // not possible to change radius or name because they were final
        // obj.radius = 412;
        // obj.name= "Other shape";





    }
}
