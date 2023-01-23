package day41_exceptions._1_season;

import day41_exceptions._1_season._01Season;

public class _03Summer extends _01Season {



    public _03Summer(double highestTemp, double lowestTemp) {
        super("Summer", highestTemp, lowestTemp);  // Summer -> hardcoded burada
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
