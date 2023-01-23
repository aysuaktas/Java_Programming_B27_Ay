package day41_exceptions._1_season;

import day41_exceptions._1_season._01Season;

public class _02Winter extends _01Season {


    // constructor
    public _02Winter(double highestTemp, double lowestTemp) {
        super("Winter", highestTemp, lowestTemp);  // bunu otomatik olarak yaptik. (Otomatik olarak ekledikten sonra name kismini degistirip Winter olarak hardcoded yaptik) ::: right click-> Generate -> Override Methods -> buradan sectik. Alttaki activity methodunu da buradan command+click ile secip ekledik:
    }

    @Override
    public void activity() {
             //  super.activity();  --> Generate'ten yapinca bu default olarak verilmisti ama bunu sildik. Original olanda GENERIC SEASON yazmisti ama onu burada cagirmak istemedi cunku, o yuzden super'i sildi
        System.out.println("Use Fireplace");
        System.out.println("Code java");
    }
}
