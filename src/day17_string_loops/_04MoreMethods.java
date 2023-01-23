package day17_string_loops;

public class _04MoreMethods {

    public static void main(String[] args) {

        // isEmpty(): checks if the String has no characters. —> returns: boolean (true: there is no character | false: there is character/s)

        String s = "hello";
        System.out.println(s.isEmpty());  // false, it has characters

        String s2 = " ";  // space character
        System.out.println(s2.isEmpty());  // false, because space is also a character

        String s3 = ""; // empty space, String but no characters
        System.out.println(s3.isEmpty()); // true


        // isBlank(): checks for non-space characters. Checks if the String has only white space character and no other characters. Returns boolean

        System.out.println(s3.isBlank()); // true

        String a = "   ";  // spaces are characters
        System.out.println(a.isEmpty());  // --> false -> as we said, this method checks if there is characters
        System.out.println(a.isBlank()); // --> true -> isBlank() method checks for non-space characters

        String b = "h";
        System.out.println(b.isEmpty()); // false
        System.out.println(b.isBlank()); // false


        // replace

        String str = "java";
        str = str.replace('a', 'z'); // single character veya multiple characters ile kullanabiliriz replace() methodu.
        System.out.println(str);  // jzvz

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)")); //(a)n (a)pple p(a)th --> her a yazan yere gidip hepsini paranthesis'li haliyle degistirdi


        // common use case (for replace method): delete spaces
        String str3 = "    multiple  words   here   ";
        str3 = str3.replace(" ", ""); // this replace method ile space characters'i (" "), space'siz haliyle degistiriyorum. trim() method sadece bastaki ve sondaki space'leri siliyordu, bu replace method sayesinde ortadaki bosluklar da gidiyor.
        System.out.println(str3);  // multiplewordshere


        // remove only first
        String z = "wooden spoon";
        System.out.println(z.replace("o", "-")); // w--den sp--n  // --> tum o'lari - ile degistirdim. Sadece first one'i degistirmek istersem;
        // replaceFirst() method kullanirim;
        System.out.println(z.replaceFirst("o", "-"));  // w-oden spoon


        // TODO: how to replace middle character only?  --> we need substring
        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);  // indexOf konusunu islerken de bunu gormustuk ve demistik ki -> // take previous index and add 1 to it, so we can start looking for the next occurrence. Ilk siraya degistirmek istedidimiz karakteri yaziyoruz. Ikinci siraya da onceki o buldugumuz index'e +1 yapip ikinci o olani buluyoruz.
        // ikiye bolecegim;
        System.out.println(ex.substring(0, secondO)); // wo
        System.out.println(ex.substring((secondO))); // oden spoon
        System.out.println(ex.substring(secondO).replaceFirst("o", "-")); // -den spoon

        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("o", "-")); //wo-den spoon -> ikinci o'yu degistirmis olduk


    }
}


