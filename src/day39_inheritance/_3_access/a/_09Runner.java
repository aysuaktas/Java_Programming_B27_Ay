package day39_inheritance._3_access.a;

public class _09Runner {


    public static void main(String[] args) {


        // What did I inherit? which means: what do I have access to?

        // This is the same package -> halen a subpackage'i icindeyim

        _08Condo condo = new _08Condo();
        condo.address = "1312 l"; // inherited because address is public -> _07House parent class'inda public String address; diye tanimlamistik

        condo.city = "Chicago";  // protected String city; idi. Ayni package'dayiz, erisebiliyoruz
        condo.state = "IL"; // is inherited because we are in the same package
       // condo.zipcode = zipcode was private so it doesn't inherit


    }
}