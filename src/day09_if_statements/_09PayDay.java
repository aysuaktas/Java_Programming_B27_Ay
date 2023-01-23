package day09_if_statements;

public class _09PayDay {

    public static void main(String[] args) {

        double hourlyRate = 60;     // how much you earn in an hour. double dedik ama int number (60) yazdik. Ama int smaller oldugu icin sorun yok
        int hoursPerWeek = 50;
        double netPay;

        if(hoursPerWeek > 40){
            // overtime calculation
            int overTimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40;   // this is to calculate the normal pay for a 40 hour in a week
            netPay += hourlyRate * overTimeHours * 1.5;  // this is the total earned from overtime
            // netPay = netPay + hourlyRate * overTimeHours * 1.5;
            // yani netPay = [hourlyRate (60) * 40 = 2400] + hourly rate (60) * overtime hours (10 --> (50-40'tan 10)) * 1.5 = 2400 + (60 * 10 * 1.5) = 2400 + 900 = 3300 --> double dedigimiz icin console'da 3300.0 olarak gozukuyor.

        } else {
            // worked under or equal to 40 hours, so no overtime
            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Net pay: " + netPay);   // outside the if statements'in disinda olan seyler console'da direkt yaziliyor. If else statement'te ise sadece bir statement console'da cikacak.

        /*
        double hourlyRate = 60;
        int hoursPerWeek = 50;
        if(hoursPerWeek > 40) uzerinden if else hesaplarsak;
        Net pay: 3300.0 olmus
         */


    }
}
