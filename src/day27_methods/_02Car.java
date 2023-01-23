package day27_methods;

public class _02Car {

    /* Algorithm for using car:
        unlock car
        open door
        sit down & start
        check mirrors
        seatbelt
        adjust seat
        put to drive and go
     */

    public static void unlock(){  // method name is called as unlock
        System.out.println("Unlocking car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    // Order of these methods does not matter. It matters when we call them. Yani burada istedigimiz sirada yazabiliriz ama kod icinde onlari cagiracagimiz zaman order onemli tabii ki

    public static void sitAndStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Adjust seat");
        System.out.println("Then insert the key");
        System.out.println("Start the car");
    }  // bir method icinde farkli print statement'ler olabilir, bunu gostermek istedi bize burada

    public static void checkMirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking the rear view mirror");
        System.out.println("Checking right mirror");
    }

    public static void putOnSeatBelt(){
        System.out.println("Putting on seatbelt");
    }

    public static void drive(){
        System.out.println("Putting into drive");
        System.out.println("Pressing on the accelerator ");
    }

    public static void late(){  // what happens if you are late/ you are in rush
        unlock();
        openDoor();
        sitAndStart();
        drive();
    }  // This is a method that calls my other methods


    // To run these methods, I need main method;
    public static void main(String[] args) {

        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatBelt();
        drive();

        // Bu sekilde print edince tum yazdiklarimiz alt alta printed oldu


        System.out.println("-------------");

        late();

    }
}
