package day10_if_statements;

public class _04CampusTime {

    /*
    create an int value for the time of the day. Use a 24 hours format
    use the given time of day to display a message
    hint: use separate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or from 0 - 5, print: Good night
     */

    public static void main(String[] args) {

        int time = 12;

        if(time >= 6 && time <= 11){
            System.out.println("Good morning");
        } else if (time >=12 && time <= 16){
            System.out.println("Good evening");
        } else if ((time >= 17 && time <= 23) || (time >= 0 && time <= 5)){  // TODO: bunda en basa iki parantez acip en sona iki tane kapatmayinca hata veriyor
            System.out.println("Good night");
        } else {
            System.out.println("Not in 24h range"); // 23'ten buyuk bir deger verilirse bu. 24 de bunda cunku 24 demiyoruz, 00 diyoruz gece.
        }

        /*
        int time = 12; ise console'da -> Good evening
        int time = 23; ise console'da -> Good night
         */

    }
}
