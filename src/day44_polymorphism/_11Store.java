package day44_polymorphism;

import day43_abstraction._6_clothes._24Clothes;
import day43_abstraction._6_clothes._25Tshirt;
import day43_abstraction._6_clothes._26HasHood;
import day43_abstraction._6_clothes._27Jacket;

import java.util.ArrayList;

public class _11Store {


    public static void main(String[] args) {

        // about yesterday's (day43) ->  _6_clothes subpackage

        // all the possible reference of TShirt and Jacket

        // TShirt:
        _25Tshirt shirt1 = new _25Tshirt();
        _24Clothes shirt2 = new _25Tshirt();

        // Jacket:
        _27Jacket jacket1 = new _27Jacket();
        _27Jacket jacket2 = new _27Jacket();
        _26HasHood jacket3 = new _27Jacket();

        _24Clothes[] inventory = new _24Clothes[7];
        inventory[0] = new _25Tshirt();
        inventory[1] = shirt1;
        inventory[2] = shirt2;
        inventory[3] = jacket1;
        inventory[4] = jacket2;
        //       inventory[5] = jacket3;  // it does not work because _24Clothes does not know what HasHood is. Cunku o class ile parent-child iliskisi falan yoktu. O yuzden jacket3 icin yapamiyoruz cunku ustte onu _26HasHood class'i ile belirlemistik. --> Saim's explanation: it doesn't work because HasHood interface is not related to Clothes at all.
        inventory[5] = new Hat(); // Hat class'ini altta olusturmustuk, onunla ilgili bu
        inventory[6] = new Hat();

        ArrayList<_24Clothes> list = new ArrayList<>();
        list.add(new _27Jacket());
        list.add(new _25Tshirt());
        list.add(new Hat()); // Hat class'ini altta olusturmustuk, onunla ilgili bu

        for (_24Clothes each : inventory) {
            each.wear();
        }

        buy(new _27Jacket()); // bunu yapabildim cunku bu: a possible reference of _24Clothes that I determined as parameter of the buy method
        buy(new Hat());  // yapabildik cunku it's a possible reference of _24Clothes
        buy(new _25Tshirt());  // yapabildik cunku it's a possible reference of _24Clothes
    }

    // gidip magazadan bir seyler almak icin buy methodu olustursak:
    public static void buy(_24Clothes clothes) {

        if(clothes instanceof _27Jacket){
            System.out.println("Jackets cost 29.99");
        } else if(clothes instanceof Hat){
            System.out.println("Hats cost 19.99");
        } else if(clothes instanceof _25Tshirt){
            System.out.println("Tshirt is 9.99");
        }

                  // instanceof keyword can be used to check if the object is certain class (returns boolean) --> ((  It is a way to read the information and understand the type of the object ))

    }
}

class Hat extends _24Clothes{

    @Override
    public void wear() {
        System.out.println("wearing hat");
    }
}

