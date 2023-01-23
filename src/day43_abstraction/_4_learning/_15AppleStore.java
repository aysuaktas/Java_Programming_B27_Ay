package day43_abstraction._4_learning;

public class _15AppleStore {

    public static void main(String[] args) {

        // everything -> I can access without any class, directly from the interface. I was able to access these because they were static

        System.out.println(_14Mac.brand);  // Apple ---> _14Mac,brand derken: _14Mac -> reference to interface
        System.out.println(_14Mac.os);  // IOS
        _14Mac.getBrand();  // The brand is Apple


        // use a class that implements the interface ((which is _16Desktop class in our example))
        _16Desktop obj = new _16Desktop();
        obj.turnOn();  // Desktop is turning on
        obj.typing();  // Typing on apple keyboard  //--> default olanlari direkt boyle kullanabiliyoruz ama static olunca bu sekilde kullanamiyoeuz, mesela:

//      obj.getBrand();  // This is static information. -->  I cannot access the static members from the classes that implement that interface. So, only access static members of an interface by the interface.


    }
}
