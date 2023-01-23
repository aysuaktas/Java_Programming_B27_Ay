package day40_inheritance._2_shape;

public class _05Circle extends _04Shape {   // extends _04Shape ekledik

    // our first child class (( sub class))


    double radius;  // radius'u Shape class'a yani parent class'a degil de bu _02Circle child class'a ekledik. Cunku all shapes do not have the radius. Ama parent class'a eklesek hepsinde ortak olmasi gerekirdi.


    // constructor:
    public _05Circle(double radius){
        super("Circle");  // hardcoded yaptik, direkt isim yazdik
        this.radius = radius;
    }

    @Override    // bunu elle yazdik, yazmak zorunda degiliz ama yazarsak dogru yazmamiza yardim eder
    public double area(){
        return radius * radius * Math.PI;   // soylerken radius times radius times Math.PI seklinde
    }
    // Math.pow(radius,2) * Math.PI;   // --> this is the same as radius * radius * Math.PI;
    // --> Math.pow(radius,2) aslinda radius^2

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    // Ne yaptim? I override the methods

    @Override
    public String toString(){
        return super.toString() + "\nRadius: " + radius;
    }  // I'm calling the original super class implementation and then adding/concatenate some part of it


}
