package day43_abstraction._6_clothes;

public class _27Jacket extends _24Clothes implements _26HasHood {  // extends _24Clothes implements _26HasHood ekledik



    @Override
    public void wear() {
        System.out.println("Wearing the jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on jacket hood");
    }


    // right click -> Generate -> Implement Methods'a tikladik ve kendi automatically olusturdu tum onlarla alakali overriding'leri. Kisa yolu: control i ((command degil, control ile)!!!

}
