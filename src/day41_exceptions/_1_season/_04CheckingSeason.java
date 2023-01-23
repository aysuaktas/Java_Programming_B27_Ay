package day41_exceptions._1_season;

import day41_exceptions._1_season._02Winter;
import day41_exceptions._1_season._03Summer;

public class _04CheckingSeason {

    public static void main(String[] args) {

       _02Winter winter = new _02Winter(60, -10);
        System.out.println(winter);  // Winter season with the highest temperature of 60.0 and the lowest temperature of -10.0  --> toString methodunu Generate'den degil de kendimiz yazdigimiz icin o metin uzerinde goruyoruz direkt yazdirinca.

        winter.activity(); /*
                            Use Fireplace
                            Code java
                           */

        _03Summer summer = new _03Summer(100, 60);
        System.out.println(summer);  // Summer season with the highest temperature of 100.0 and the lowest temperature of 60.0
        summer.activity();  // Drink Lemonade


    }
}
