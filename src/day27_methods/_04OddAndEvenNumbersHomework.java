package day27_methods;

public class _04OddAndEvenNumbersHomework {

    /*
    Void Methods
-------------------------
create a method that can print odd numbers between 1-100 in the same line separated by space

create a method that can print even numbers between 1-100 in the same line separated by space
     */

    public static void main(String[] args) {
        EvenNumbers();

        System.out.println();  // empty print statement

        OddNumbers();
    }

    public static void EvenNumbers(){
        for(int i =1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void OddNumbers(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }


}
