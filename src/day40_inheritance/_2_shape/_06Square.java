package day40_inheritance._2_shape;

public class _06Square extends _04Shape {  // extends _04Shape'i ekledik -> direkt bunu ekleyince hata veriyor cunku default constructor'imiz no-argument constructor ariyor ama bizim no-argument constructor'imiz yok

    double side;  // all numbers'i represent edebilmesi icin double yazdik bunu


    // constructor:
    public _06Square(double side){  // We will just use our constructor to help us initialize that value -> o yuzden parameter olarak double side yazdik. If I want to make a Square object, I want to give the side -> so, double side yazdik.
        super("Square");   // bunu hardcoded olarak verdik
        this.side = side;
    }
    // We have a constructor good to go. I can make an object now. Two steps: for the area and perimeter.

    @Override  // let's use annotation here.
    public double area(){
        return side * side;  // side times side will give us the area
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    // diyelim ki _04Shape parent class'indaki toString methodu kullanmak istiyorum, onu tekrar yazmak istemiyorum (I don't want to re-write it again) ama bir de bir sey daha eklemek istiyorum, mesela side vs. I can call the base one : super.toString() diyerek. Sonra da concatenation ile ne eklemek isiyorsam onu eklerim:
    @Override
    public String toString(){
        return super.toString() + "\nSide: " + side;
    }    // this is the calling super class implementation and adding some part of it.
                // ---> reference of the current class icin we use 'this' (this. something)  Reference of the super (parent) class icin we just use super. O yuzden burada super.toString() yazdik. So, bunu yazarak, we are calling the original implementation (that the method that we wrote in the super class), then we are adding ((concatenating aslinda)) something.

}
