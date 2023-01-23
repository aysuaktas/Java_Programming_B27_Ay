package day35_custom_classes.traffic1;

public class _02Road {

    public static void main(String[] args) {

        //_01TrafficLight class'ini cagiracagiz bunda:

        _01TrafficLight light = new _01TrafficLight("green"); // bu parantez icine bir sey yazmayinca hata verdi. Cunku _01TrafficLight class'inda parameter verdigimiz ve onu cagirdigimiz icin burada argument vermek zorundayiz  ---> we are calling the method. Parantez icinde tirnak icinde yazdigimiz color her ne olursa (burada green yazdik mesela) -> o bir argument
       //  light.color = "red"; --> bunu kullanmayacagiz. Constructor yaptik cunku. Constructor yapinca boyle ek seyler yazmamiza gerek kalmadi
        System.out.println(light.color);  // green

        // Merve's explanation ---> bunda light.color diye print ettik. Eger _01TrafficLight class'inda toString() methodunu yapsaydik direkt light yazip direkt objectimizi print edebilirdik


        /*
        // invalid case :
        _01TrafficLight light2 = new _01TrafficLight("blue");
        System.out.println(light2.color); // blue
         */   // ---> syntax is correct but how I am going to do is the one what is invalid. I will fix this.

        _01TrafficLight light3 = new _01TrafficLight("blue");
        // lightcolor3.color = "blue"
        System.out.println(light3.color);  // null  --> null cunlu _01TrafficLight class'inda constructor altinda boolean olustururken verdigimiz renkler disinda bir renk bu. -> red, yellow, green disindaki renkler null verecek, default value String'de null oldugu icin.


    }
}
