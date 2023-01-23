package day38_encapsulation._04_traffic_lights;

public class _06TrafficLight {

    private String color;   // encapsulate yapmayi ogreniyoruz, o yuzden private yaptik bunu. Ayrica bunu public yapsaydik o color'i sinirlayamazdik, istediklerini yazabilirlerdi. Private sayesinde I'm hiding the data, and I'm controlling how they will use the color. (Altta setColor kisminda if statement olusturdum, o renkler olmasini istiyorum sadece -> private kullanip sonra getter ve setter methodlarini kullanarak encapsulation yapmam sayesinde bu mumkun oldu, public olsa kontrol edemezdim)


    public _06TrafficLight(String color){  // this is a constructor

        setColor(color);   // this is calling a setter method inside the constructor
    }   // What is the point of constructor? Automatically... --> Instead of repeating myself again and again, I'm putting the method that already have this inside the constructor.

    // kisayol: right click -> Generate -> Getter and Setter  --> bunu yapinca asagidakiler otomatik olarak olustu. Eger istersek sadece Getter veya sadece Setter olani da secebilirdik Generate dedikten sonra:

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("green") || color.equals("red") || color.equals("yellow")) {
            this.color = color;
        }  // if this boolean is false (not a valid color), then nothing is assigned to the color variable
    }

    // getter method genelde return ile, setter method genelde void method ile kullaniliyor

}
