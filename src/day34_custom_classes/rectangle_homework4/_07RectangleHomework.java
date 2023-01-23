package day34_custom_classes.rectangle_homework4;

public class _07RectangleHomework {

    /*
    Create a class Rectangle

    create instance variables:
      base, height, perimeter, area

    create instance methods:

     - toString(): [return String]
            returns all the information of the Rectangle objects, including the perimeter and area

     - calculatePerimeter(): [void]
            calculate the perimeter and store the result into the perimeter instance variable

            a perimeter of a rectangle is the 4 sides added together

      - calculateArea(): [void]
            calculate the area and store the result into the area instance variable

          an area of a rectangle is the height x width
     */


    // instance variables ((double base; vs)) olusturacagiz. Bunlari olusturduktan sonra methodlarinda -> instance variables static olmadigi icin methodda static yazmayiz -> public void calculatePerimeter vs seklinde yaptik o yuzden:

    // rectangle -> dikdortgen
    double base; // -> taban
    double height;    // yukseklik
    double perimeter;  // perimeter = cevre uzunlugu
    double area;  // alan

    // calculatePerimeter(): [void]  --> (( calculate the perimeter and store the result into the perimeter instance variable. --> a perimeter of a rectangle is the 4 sides added together)):

    public void calculatePerimeter(){
        perimeter = (base * 2) + (height * 2); // Dikdortgen perimeter'i yani cevre uzunlugunu hesaplarken -> 2 tane tabani ve 2 tane yuksekligi oldugu icin (base * 2) + (height * 2) yaptim
    }

    // calculateArea(): [void]   --> (( calculate the area and store the result into the area instance variable. --> an area of a rectangle is the height x width )) :

    public void calculateArea(){
        area = base * height;
    }

    // toString(): [return String] --> (( returns all the information of the Rectangle objects, including the perimeter and area )) :

    public String toString() {
        return "_07RectangleHomework{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
        // bunu otomatik yazdirmak icin: click inside your class, right click, generate, toString, select all, click okay yaptim

        // Bunda main method yok, bu class'i _08CallingRectangleHomework class'inda cagiracagim.

    }
}

