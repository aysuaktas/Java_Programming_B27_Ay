package day16_string;

public class _07Email {

     /*
        saim@cydeo.com -> email bu ise

        name -> saim
        domain -> cydeo seklinde gormek istiyoruz

     */

    public static void main(String[] args) {

       String email = "saim@cydeo.com";
       int indexOfAt = email.indexOf('@');
       String name = email.substring(0, indexOfAt); // last index does not included this. But I already do not want to add last index, so I didnot do +1

        int indexOfDot = email.indexOf(".");
        String domain = email.substring(indexOfAt + 1, indexOfDot); // indexOfDot'ta yani mailin nokta kisminda durdurursak noktayi da almiyor, tam istedigimiz yer o yuzden orada bitirdik

        System.out.println("Full Email: " + email);
        System.out.println("Name part: " + name);
        System.out.println("Domain part: " + domain);


        /* boyle hardcoded olarak print edince console'da
        Full Email: saim@cydeo.com
        Name part: saim
        Domain part: cydeo
         */

        /* bruce@wayneenterprise.net -> bu e-mail ile denersek;
        Name part: bruce
        Domain part: wayneenterprise

         */


    }
}
