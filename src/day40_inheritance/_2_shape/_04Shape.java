package day40_inheritance._2_shape;

public class _04Shape {

    // Bu subpackege icinde 1. class. Toplamda _04. class  --> (Overriding konusunu konusmaya basladiktan sonraki ilk class)

    // Bu parent class.

    String type;

    public _04Shape(String type){
        this.type = type;
    }

    public double area(){
        return 0.0;   // return type'imiz var ama bir seye return etmedik diye once hata verdi. Sonra default olarak 0 yazdik. Neden default deger yazdik? Cunku bu area hesaplamasi shapes'te mesela circle'da farkli square'de farkli olacak
    }

    public double perimeter(){
        return 0.0;   // default olarak bunu yazdik (double oldugu icin default'u 0.0). Nedeni area ile ayni, shape'e gore perimeter calculation'i degisecek
    }


    public String toString(){
        return "Shape: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }



}
