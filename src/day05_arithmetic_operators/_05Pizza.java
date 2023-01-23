package day05_arithmetic_operators;

public class _05Pizza {

    public static void main(String[] args) {

        String type = "Vegan Cheese";
        int pizzaSlices = 12;
        int people = 5;
        int slicesPerPerson = pizzaSlices / people; // how many slices var ve her dilimi kac kisi yiyecek?
        int leftOverSlices = pizzaSlices % people; // bu kisimda pizzaSlices ve people sayisi degistikce console'daki sonuc degisecek.

        System.out.println(people + " people are going to eat the " + type + " pizza. Every person will get " + slicesPerPerson + " slices and there will be " + leftOverSlices + " left over");

    }
}
