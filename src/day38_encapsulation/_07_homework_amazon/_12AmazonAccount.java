package day38_encapsulation._07_homework_amazon;

public class _12AmazonAccount {

    /* Homework:
    Create a class AmazonAccount

    instance variables:
        - userName (String)
        - email (String)
        - hasPrime (boolean)

    constructor:
        - initialize the fields

    encapsulate AmazonAccount

    methods: toString()

    Create a class UseAmazon
         create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */


    // instance variables:
    private String username;
    private String email;
    private boolean hasPrime;


    // constructor:
    public _12AmazonAccount(String username, String email, boolean hasPrime){
        this.username = username;
        this.email = email;
        this.hasPrime = hasPrime;
    }



    // getter methods:
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public boolean getHasPrime() {
        return hasPrime;
    }



    // setter methods:
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }



    // toString method:

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}