package day38_encapsulation._04_traffic_lights;

public class _07Driving {

    public static void main(String[] args) {

        _06TrafficLight road1 = new _06TrafficLight("red");
        System.out.println(road1.getColor()); // red -->  sadece road1.color yazsam it is not valid cunku color was a private variable, baska class'tan direkt cagiramam onu. Indirectly cagirabilirim ancak.

        road1.setColor("blue");
        System.out.println(road1.getColor());  // red  --> burada rengi blue belirlememize ragmen red yazdirdi, degistirmedi. Cunku _06TrafficLight class'inda setColor methodunda kullandigimiz if statement'te valid renklerimizi sadece -> green, red ve yellow olarak belirledik

        road1.setColor("green");
        System.out.println(road1.getColor());  // green





    }
}
