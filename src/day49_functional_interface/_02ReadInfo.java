package day49_functional_interface;

public class _02ReadInfo {

    public static void main(String[] args) {

        // How do I read the information? ->

        System.out.println(_01ConfigRaeder.getProperty("day"));  // Monday --> test.properties file'inda day, browser, topic key'lerimiz var. Hangi key'i okumak istiyorsam parantez icine onu yazacagim ve get method ile onu okumaya calisacagim. For ex: if I want to read the day, I will write like this line of code.
        System.out.println(_01ConfigRaeder.getProperty("browser"));  // chrome
        System.out.println(_01ConfigRaeder.getProperty("topic"));  // java

    }
}
