package day38_encapsulation._03_rectangle;

import day38_encapsulation._03_rectangle._04Rectangle;

public class _05UseRectangle {

    public static void main(String[] args) {

        _04Rectangle rectangle1 = new _04Rectangle();

        /* encapsulation yapmasaydik:

//      rectangle1.length = 10;
//      rectangle1.width = 5;

        yapardik. Ama why I cannot do it directly? Cunku variable'im private, ve sadece o class'ta direct access var ona. O class disinda direct access'im yok o variable'lara. Ama indirect access'im var -> getters & setters sayesinde
         */

        // Saim'in aciklamasi: direct access to the variable to assign is not possible, because they have private access modifier.

        // Ama set ve get methodlarini kullanabilirim.

        // use setter methods to assign:
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

 //     System.out.println(rectangle1.length);
 //     System.out.println(rectangle1.width);
        // bunlari da usttekiyle ayni sebepten yapamayiz. Cunku private variable'la direkt erisemiyoruz. Bu istedigimiz sonuca erismek icin getters kullanmamiz gerekiyor burada

        // use getter methods to read/ use the value
        System.out.println(rectangle1.getLength());  // 10.0
        System.out.println(rectangle1.getWidth());  // 5.0



    }
}
