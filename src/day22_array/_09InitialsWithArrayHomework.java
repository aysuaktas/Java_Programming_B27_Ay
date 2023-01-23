package day22_array;

public class _09InitialsWithArrayHomework {

    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

            -No loop yet
     */

    public static void main(String[] args) {

        String [] fullNames = {"James Bond", "Harry Potter", "Tony Stark"};   //  [] yazmayi ve { } koymayi unutma


        // Bu kisim olmasa da olur ama daha iyi anlamak icin ekliyorum:
        System.out.println(fullNames[0]); // James Bond --> Sifirinci index
        System.out.println(fullNames[1]); // Harry Potter --> 1. index
        System.out.println(fullNames[2]); // Tony Stark --> 2. index


        System.out.println("" + fullNames[0].charAt(0) + fullNames[0].charAt(fullNames[0].indexOf(" ") + 1)); // JB ---> basina "" koymazsak addition olarak alip 140 seklinde yazdiriyor. Basina "" koyunca concatenation olarak aldigi icin JB yaziyor. Nasil JB yazdi? -> Array'de charAt yaptigimiz zaman eger String ise tumunu bir aliyor; yani "" icindeki her sey, isterse bir kelimeden fazla olsun, bir index num olarak aliniyor total bakinca. Yani fullNames[0] dedigimiz aslinda James Bond. Bunun charAt()'ini alinca o String icine bakiyoruz artik, yani James Bond fullName'indeki index number'lara bakmaya basliyoruz. fullNames[0].charAt(0) yazdigimizda sifirinci index olan J'yi buluruz. ---> fullNames[0].charAt(fullNames[0].indexOf(" ") +1)) kisminda da James Bond full name'inde bosluga bakmak icin " " yaziyoruz, cunku ondan sonraki karakter soyismin bas harfi oluyor. Onu elde etmek icin de +1 yapiyoruz.

        System.out.println("" + fullNames[1].charAt(0) + fullNames[1].charAt(fullNames[1].indexOf(" ") +1)); //HP --> bu sefer de fullNames[1] diye bakarak totalde Array'de 1. element ((every element yani each data has index numbers ---> arrayName[index] :::: gives back the element at that index))  olarak alacagimiz Harry Potter'a bakmis olduk.

        System.out.println("" + fullNames[2].charAt(0) + fullNames[2].charAt(fullNames[2].indexOf(" ") +1)); // TS --> bu sefer de fullNames[2] diye bakarak totalde Array'de 2. element olarak alacagimiz Tony Stark'a bakmis olduk.

        // bunlarda indexOf(" ") da oluyor indexOf(' ') da. Denedik Zeynep ile

        // TODO: guzel ornek, tekrar bakarsin

    }
}
