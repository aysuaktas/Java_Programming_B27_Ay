package day23_array;

public class _02Average {

    public static void main(String[] args) {

        double[] prices = {13.99, 19.14, 3.112, 65.332};
        double sum = 0;   // we need to some kind of calculation, that's why we need some summary (sum)
        for(double eachPrice : prices){
            sum += eachPrice;  // price is just each element. O yuzden sadece price koyuyorum buraya. Array'den automatically each element'i alacak
        }

        System.out.println(sum / prices.length);  // 25.3935
        // -> sadece sum'u print ettigimde bu cikti: 101.574. Bunu prices Array'indekilerin length'i olan 4e bolunce 25.3935 cikiyor.



    /*
       // Second way -> with for loop

       double[] prices = {13.99, 19.14, 3.112, 65.332};
       double sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];  // price is just each element. O yuzden sadece price koyuyorum buraya. Array'den automatically each element'i alacak
        }
        System.out.println(sum / prices.length);  // 25.3935
    */


        // eachPrice == prices[i] --> same


    }
}
