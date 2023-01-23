package day28_methods;

public class _06NumberToWord {

    /*
    5 --> Five
     */

    public static void main(String[] args) {
        System.out.println(numberToWord(1));  // One
        System.out.println(numberToWord2(7)); // Seven
        System.out.println(numberToWord2(9)); // Invalid
    }

    public static String numberToWord(int n) {

        String word = "";
        switch (n) {   // I will check n which is coming from my parameter
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            default:
                word = "Invalid. We can only accept numbers from 1-7";
        }

        return  word;

    }



        // Second way:

     public static String numberToWord2(int n) {  // convention of variable name is camel case. Ama uppercase ile baslasan da hata vermez. Ama convention olan camel case. --> Their syntax are different oldugu icin class name ile method name'in ayni olmasinda sorun yok

        switch (n) {   // I will check n which is coming from my parameter

            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
        }
        return "Invalid";  // at the end of in default case are both okay. Ama kullanmalisin. Yoksa kirmizi cizgi oluyor, hata veriyor bunu yazmazsan. Cunku 1 ile 7 arasinda olmayan value da girilebilir??
    }
    // return stops the methods. So, in this way, I don't need to use break;
    // Return'un mantigini anlayalim diye bu ikincisini yapti. Ama cok fazla return olmasi tercih edilmiyor, ilk yol kullanilir. Iki-ucten fazla return istenmez


}
