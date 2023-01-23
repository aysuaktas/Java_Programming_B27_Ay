package day33_arraylist;

public class _10UsingAnimal {

    // Bir onceki _09Animal class'ini kullanmak icin bu class'i actik

    public static void main(String[] args) {

        _09Animal animal1 = new _09Animal(); // this is creating an object of the Animal class

        animal1.species = "Lions";
        animal1.numberOfLegs = 4;
        animal1.age = 15;
        animal1.canFly = false;
        animal1.weight = 200;

        System.out.println(animal1.species);  // Lions
        System.out.println(animal1.numberOfLegs); // 4
        System.out.println(animal1.age); // 15
        System.out.println(animal1.canFly);   // false
        System.out.println(animal1.weight);  // 200.0

        // Bunlari birlikte de yazdirabilirdik ama sonra gorecegiz onu


        _09Animal animal2 = new _09Animal();  // animal1 and animal2 are not same. Bunda species vs icin we did not assigned any value.
        System.out.println(animal2.species);  // null --> because we have not assigned any value yet.

        System.out.println(animal2.numberOfLegs);  // 0 ---> numberOfLegs is 0 by default


    }
}
