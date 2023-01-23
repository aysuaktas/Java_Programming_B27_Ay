package day12_switch;

public class _01SwitchExample {

    public static void main(String[] args) {

        int day = 3;  // number from 1 to 7, where 1 is monday and 7 is sunday // bu ornek Java short videolarda da vardi. ---> day10_if_statements package'i _03NumberToDay class'inin switch ile yapilmis hali.

        switch (day){

            default: // acts like else, if no other case matches, the default case will run // default case'inin nerede oldugu fark etmiyor.
                System.out.println("Not a valid day number, it should be from 1 to 7");  // ornegin int day = 9; dersek, 1-7 arasinda olmadigi icin diger case'ler match olmayacak. O zaman default case will run
                break;  // You should 'break' after also the default, but if it is the last case, there is no need to put 'break' -> burada default sonda degil, basta. Basta veya ortada oldugunda 'break' koyuyoruz, koyduk.

            case 1:       // if statement'teki if(day == 1) demek switch konusunda case 1: yazmak da
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:    // int day = 3; demistik. Our switch matches with the case here.
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

        }

        /*
        int day = 3; iken run edersem console'da -> Wednesday yaziyor.
        We need 'break' because when we find the answer, if we don't have break, it still continue to execute the others too.
        -> 'Break' olmasaydi Wednesday'i bulduktan sonra devam edecegi icin console'da
                                -> Wednesday
                                   Thursday
                                   Friday... diye yazmaya devam eder. Diyelim 3te break yok ama 4te var, o zaman Wednesday ve Thursday yazardi ama sonrasina devam etmezdi.

         */

    }
}
