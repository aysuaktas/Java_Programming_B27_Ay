package day41_exceptions._2_hiding;

public class _08Person {

    String name = "James Bond";
}


class SecretIdentity extends _08Person{
    String name = "dnobsemaj";  // doing variable hiding. The original one is hidden, but now I have a new variable with the same name
}


class Runner {
    public static void main(String[] args) {

        // could I have declared as a normal reference then access the variable? Yes but just to show quickly we made objects without reference

        System.out.println(new _08Person().name);  // James Bond
        System.out.println(new SecretIdentity().name);  // dnobsemaj --> class SecretIdentity extends _08Person{   } ici bos iken print ettigimizde yine parent class'taki James Bond'u print etmisti, sonra onun icini doldurdugumuzda yenisini print etti ve console'da dnobsemaj yazdi.



    }
}
