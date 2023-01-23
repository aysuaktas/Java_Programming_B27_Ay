package day09_if_statements;

public class _08LunchTime {

    public static void main(String[] args) {

        boolean isHungry = false;
        boolean isLunchTime = true;

        if(isLunchTime && isHungry){
            System.out.println("go eat lunch");
            System.out.println("take a break");
        } else {
            System.out.println("Practice more java");
        }

        // && expression'unun true olmasi icin ikisinin de true olmasi gerekiyor. Yani console'da go eat lunch, take a breath demesi icin hem lunch time hem hungry olmasi gerek. && yerine || statement'i olsa birinden birinin true olmasi yeterdi.

        /*
        boolean isHungry = true;
        boolean isLunchTime = true; ise
        Console'da -> go eat lunch
                    take a break

        boolean isHungry = true;
        boolean isLunchTime = false; ya da ikisinin de true olmadigi herhangi bir olasilik ise;
        Console'da -> Practice more java cikiyor.

        If else'te her zaman statement'lardan biri calisir. Ikisi de dogru olabilir ama if dogruysa else kismini dikkate almaz. O yuzden ayni anda ikisi birden calisip go eat lunch, take a breath VE practice more java demez.

         */

    }
}
