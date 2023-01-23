package day43_abstraction._5_animal;

public class _18AllAnimals {




}


/*
class Cat extends _17Animal implements _21Petable, _22Playable{

}

class Dog extends _17Animal implements _21Petable, _22Playable{

}


// Cat ve Dog'unkiler ayni. Ayni olanlar varsa grouping yapmak en iyisi. _23Friendly interface'i olusturduk o nedenle.


Inheritance in Interface:

	- inheritance is not a class, which means it doesn’t follow all the same rules
		-> classes can only have one parent, but interface doesn’t need follow that
	- so, a class in implement as many interfaces as it needs
	- an interface can inherit as many interfaces as needed
 */


class Cat extends _17Animal implements _23Friendly{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}

class Dog extends _17Animal implements _23Friendly, _20Swimable{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}


class Tiger extends _17Animal implements _20Swimable{  // tiger can swim, o yuzden _20Swimable interface'i uzerinden -> implements _20Swimable yapabilirim

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}


class Shark extends _17Animal implements _20Swimable {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}


class Bird extends _17Animal implements _19Flyable{ // // Bu hayvanlarin kimi ucuyor kimi ucmuyor. Flyable diye bir interface olusturduk mesela : _19Flyable interface'i. Sonra burada ucabilenlere implements _19Flyable ekledik

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }
}


class Duck extends _17Animal implements _19Flyable, _20Swimable {  // duck hem ucabilir hem yuzebilir o yuzden ikisini de aralarinda virgul ile ekledik.

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

}

/*
class Cat extends _17Animal{

} falan yazinca warning veriyor. Because we need to override everything. -> Bunu yapmak icin her birinin icine tikladik ve right click -> Generate -> Implement Methods'a tikladik ve kendi automatically olusturdu tum onlarla alakali overriding'leri.
 */

