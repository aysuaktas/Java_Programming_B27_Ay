package day40_inheritance._2_shape;

public class _07RunShapes {

    public static void main(String[] args) {


        _05Circle circle = new _05Circle(3.4);

        System.out.println(circle);

        /* on the console;;;;;

        Shape: Circle
        Area: 36.316811075498
        Perimeter: 21.362830044410593
        Radius: 3.4   -->  --> ilk basta bu Radius kismi yoktu, sonra _05Circle class'ina gidip parent class'taki toString methodunu (calling the original method) cagirip ona radius'u da ekledik. Sonra gelip burada print ettigimizde artik bu da olmus oldu.
         */

        // ayri ayri gormek istersek:
        System.out.println(circle.area());  // 36.316811075498
        System.out.println(circle.perimeter());  // 21.362830044410593

        System.out.println("------------------");

        _06Square square = new _06Square(5.5); // buraya bir size verdiginden emin ol. Burada size'i 5.5 verelim dedik mesela. Neden bir sey yaziyoruz? Cunku _06Square class'inda double side parameter'i vermistik, bir parameter oldugu icin cagirirken bir argument vermemiz zorunlu. O yuzden verdik.

        System.out.println(square);

        /* on the console:
        Shape: Square
        Area: 30.25
        Perimeter: 22.0
        Side: 5.5  --> ilk basta bu Side kismi yoktu, sonra _06Square class'ina gidip parent class'taki toString methodunu (calling the original method) cagirip ona side'i da ekledik. Sonra gelip burada print ettigimizde artik bu da olmus oldu.
         */

    }
}
