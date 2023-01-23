package day17_string_loops;

public class _01RelativeChecker {

    /*
    [Relative checker] -> // it was yesterday's homework, but I didn't do it.

    Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related
    -------------------
        Input:
        James Bond
        Alex Benji
    Output:
        Not Related
     */

    public static void main(String[] args) {

    String name1 = "James Bond";   // nextLine()
    String name2 = "Jamie Bond";   // nextLine() -> Scanner ile yapsak bunlar yerine nextLine method kullanacaktik, biz hardcoded yapmayi tercih ettik bu sefer.

    // TODO: Soyadi yazdirmak istiyorsak  --->  int indexOfSpace = name.lastIndexOf(' ');  seklinde buluruz cunku substring icinde indexOfSpace +1 yaptirdigimizda soyismin ilk karakterinden itibaren sonuna kadar yazdirmis oluruz.
    int indexOfSpace = name1.lastIndexOf(' ');  // space --> "" yerine ' ' kullandik cunku lastIndex method tek karakter (char) kullanimina da multiple character (String) kullanimina da okay. String daha cok memory kapliyor. Daha az memory kullanmak icin sadece bir space oldugundan "" yerine '' kullandik.More than one character olsaydi "" olurdu.

    String lastName = name1.substring(indexOfSpace + 1);   // name1.substring(indexOfSpace).trim() seklinde de yapilabilirmis. Sadece indexOfSpace kullanmanin sikintisi soyisimden once boslugu da dahil eder. +1 eklemeden yapilacaksa trim() methodu ile bu space'ten kurtulmus oluruz.

        // First way;

     if(name2.endsWith(lastName)){
         System.out.println("Related");
     } else {
         System.out.println("Not Related");
     }

        System.out.println("---------------");

        // Second way;
        System.out.println(name1.endsWith(lastName) ? "Related" : "Not Related");


    }
}
