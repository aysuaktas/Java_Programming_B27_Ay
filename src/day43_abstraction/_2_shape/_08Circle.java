package day43_abstraction._2_shape;

public class _08Circle extends _07Shape {  // extends _07Shape'i ekledik


    public final double radius;   // bu class'i biraz daha immutable yapmak istiyorum, a little bit more immutable yapmak icin final yazdik. Ama final yazinca bir yerde bir deger belirlememiz lazim, o yuzden altta olusturdugumuz no argument constuctor yerine parameter olarak double radius yazdik.

   /*
    public _08Circle(){  // argument'i simdilik empty biraktik -> no argument constructor
 //       super(); comes automatically ama bu gecerli degil cunku parent class olan _07Shape'de no argument bir constructor yok.
    }
    */

    public _08Circle(double radius){
       super("Circle");
       this.radius=radius;
    }

    @Override
    public double area(){
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        String org = super.toString();     //org dedigi original. ->  super.toString() yapinca return: parent class'taki toString method'daki name + " | Area: " + area() + " | Perimeter: " + perimeter();  olacakti ama radius'u da eklemek istedik bunda. O yuzden:
        return org.substring(0, org.indexOf("|")) + "| Radius: " + radius + org.substring(org.indexOf("|") -1);  // boyle yaptik ama easy way direkt super.toString() methodu alip radius ile concatenate etmek olurdu:  super.toString() + radius; gibi  --> Saim yaptiginda -1 yapti ama nedenini anlamaniz onemli degil dedi ahahahah o zaman why yani... Neyse, simple yol olarak alttakini yaparmisiz ama gostermek istemis.

        /*
        //Simpler version:
        @Override
        public String toString(){
            return super.toString() + "radius: " + radius;
        }

         */


    }


}
