package day12_switch;

public class _04Browsers {

    public static void main(String[] args) {

        String browser = "safari";

        switch (browser){

            case "chrome":
            case "CHROME":
            case "Chrome":      // bu 3unu de yazarsan; ucunden biri oldugu takdirde console'da bunlara ait print statement yaziliyor.
                System.out.println("opening google in chrome");
                break;

            case "firefox":
                System.out.println("opening google in firefox");
                break;

            case "safari":
                System.out.println("Special set up for apple computers");
                System.out.println("Opening in safari");
                break;     // safari case'i icin iki print statement yazdik ( daha cok da yazabilirdik bunun bir kurali yok). String browser = "safari"; olursa both of them will be printed.

            default:
                System.out.println("Opening in chrome by default");

        }


    }
}
