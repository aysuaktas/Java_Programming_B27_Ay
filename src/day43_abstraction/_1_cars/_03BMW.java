package day43_abstraction._1_cars;

import day43_abstraction._1_cars._01Car;

public class _03BMW extends _01Car { // extends _01Car yaptik
    // Car ismiyle koyanlarda ozellikle -> ayni isimde baska class'larimiz var, baska birini secersek (baska package'da olan) -> import eder. Import ederse onu sil ki su anki package'da olan Car'i esas alsin.


    @Override
    public void start() {
        System.out.println("pressing the button to start");
    }
}
